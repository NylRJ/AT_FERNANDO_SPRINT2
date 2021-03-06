package com.i9developement.school_class.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.i9developement.school_class.entity.Student;
import com.i9developement.school_class.services.StudentService;


@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private final StudentService studentService;
	private final PagedResourcesAssembler<Student> assembler;

	@Autowired
	public StudentController(StudentService studentService, PagedResourcesAssembler<Student> assembler) {
		super();
		this.studentService = studentService;
		this.assembler = assembler;
	}

	@GetMapping(value = "/{id}", produces = { "application/json", "application/xml", "application/x-yaml" })
	public Student findById(@PathVariable("id") Long id) {
		Student studentVo = studentService.findById(id);
		studentVo.add(linkTo(methodOn(StudentController.class).findById(id)).withSelfRel());
		return studentVo;
	}


	@GetMapping(produces = { "application/json", "application/xml", "application/x-yaml" })
	public ResponseEntity<?> findAll(@RequestParam(value = "page", defaultValue = "0") int page,
			@RequestParam(value = "limit", defaultValue = "12") int limit,
			@RequestParam(value = "direction", defaultValue = "asc") String direction) {

		var sortDirection = "desc".equalsIgnoreCase(direction) ? Direction.DESC : Direction.ASC;
		Pageable pageable = PageRequest.of(page, limit, Sort.by(sortDirection, "classname"));

		Page<Student> students = studentService.findAll(pageable);
		students.stream()
				.forEach(c -> c.add(linkTo(methodOn(StudentController.class).findById(c.getId())).withSelfRel()));
		PagedModel<EntityModel<Student>> pageModel = assembler.toModel(students);
		return new ResponseEntity<>(pageModel, HttpStatus.OK);
	}

	@PostMapping(produces = { "application/json", "application/xml", "application/x-yaml" }, consumes = {
			"application/json", "application/xml", "application/x-yaml" })
	public Student create(@RequestBody Student studentVo) {

		Student classVo = studentService.create(studentVo);
		classVo.add(linkTo(methodOn(StudentController.class).findById(classVo.getId())).withSelfRel());
		return classVo;
	}

	@PutMapping(produces = { "application/json", "application/xml", "application/x-yaml" }, consumes = {
			"application/json", "application/xml", "application/x-yaml" })
	public Student update(@RequestBody Student studentVo) {

		Student classVo = studentService.update(studentVo);
		classVo.add(linkTo(methodOn(StudentController.class).findById(classVo.getId())).withSelfRel());
		return classVo;
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id){
		studentService.detete(id);
		return ResponseEntity.ok().build();
	}
	

}
