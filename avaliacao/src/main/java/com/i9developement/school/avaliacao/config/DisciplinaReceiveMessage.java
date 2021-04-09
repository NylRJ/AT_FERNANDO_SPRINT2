package com.i9developement.school.avaliacao.config;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.i9developement.school.avaliacao.entity.Disciplina;
import com.i9developement.school.avaliacao.repository.DisciplinaRepository;

@Component
public class DisciplinaReceiveMessage {
	
	private final DisciplinaRepository disciplinaRepository;

	@Autowired
	public DisciplinaReceiveMessage(DisciplinaRepository disciplinaRepository) {
		
		this.disciplinaRepository = disciplinaRepository;
	}
	
	@RabbitListener(queues = {"${disciplina.rabbitmq.queue}"})
	public void receive(@Payload Disciplina disciplina) {
		disciplinaRepository.save(disciplina);
	}
	
	
}
