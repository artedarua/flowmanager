package com.FlowManagerAPI.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlowManagerAPI.model.ClienteModel;
import com.FlowManagerAPI.model.OperacaoModel;
import com.FlowManagerAPI.repository.ClienteRepository;
import com.FlowManagerAPI.repository.OperacaoRepository;

@Service
public class OperacaoService {

	@Autowired
	private OperacaoRepository operacaoRepository;
	
	public OperacaoModel save(OperacaoModel operacaoModel) {
		return operacaoRepository.save(operacaoModel);
	}
	
	public Optional<OperacaoModel> operacaoById(Long id) {
		return operacaoRepository.findById(id);
	}
}
