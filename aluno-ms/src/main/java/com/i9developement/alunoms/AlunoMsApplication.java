package com.i9developement.alunoms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Turma Microserves", version = "2.0", description = "Turma Microcrevices"))
public class AlunoMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlunoMsApplication.class, args);
	}

}
