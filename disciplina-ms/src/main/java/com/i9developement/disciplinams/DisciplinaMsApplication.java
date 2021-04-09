package com.i9developement.disciplinams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Disciplina Microserves", version = "2.0", description = "Disciplina Microcrevices"))
public class DisciplinaMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisciplinaMsApplication.class, args);
	}

}
