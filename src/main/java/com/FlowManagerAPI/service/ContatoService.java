package com.FlowManagerAPI.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlowManagerAPI.model.ClienteModel;
import com.FlowManagerAPI.model.ContatoModel;
import com.FlowManagerAPI.repository.ClienteRepository;
import com.FlowManagerAPI.repository.ContatoRepository;

@Service
public class ContatoService {

	@Autowired
	private ContatoRepository contatoRepository;

	public ContatoModel save(ContatoModel contato) {
		return contatoRepository.save(contato);
	}

	public Optional<ContatoModel> contatoeById(Long idContato) {
		return contatoRepository.findById(idContato);
	}

}
