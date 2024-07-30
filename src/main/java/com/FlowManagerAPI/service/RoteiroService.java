package com.FlowManagerAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlowManagerAPI.model.ProdutoModel;
import com.FlowManagerAPI.model.RoteiroModel;
import com.FlowManagerAPI.repository.ProdutoRepository;
import com.FlowManagerAPI.repository.RoteiroRepository;

@Service
public class RoteiroService {

	@Autowired
	private RoteiroRepository roteiroRepository;

	public RoteiroModel save(RoteiroModel roteiroModel) {
		return roteiroRepository.save(roteiroModel);
	}

	public Optional<RoteiroModel> roteiroById(Long idRoteiro) {
		return roteiroRepository.findById(idRoteiro);
	}
}
