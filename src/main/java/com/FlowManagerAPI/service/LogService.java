package com.FlowManagerAPI.service;


import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlowManagerAPI.model.LogModel;
import com.FlowManagerAPI.repository.LogRepository;

@Service
public class LogService {

	@Autowired
	private LogRepository logRepository;

	public void save(String conteudo) {
		LogModel log = new LogModel();
		
        LocalDateTime dateAtual = LocalDateTime.now();
		log.setDataLog(dateAtual);
		log.setConteudoLog(conteudo);
		
		logRepository.save(log);
	}
}
