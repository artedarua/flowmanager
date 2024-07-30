package com.FlowManagerAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.FlowManagerAPI.model.FornecedorModel;
import com.FlowManagerAPI.model.ProdutoModel;
import com.FlowManagerAPI.repository.FornecedorRepository;
import com.FlowManagerAPI.repository.ProdutoRepository;

@Service
public class FornecedorService {

	@Autowired
	private FornecedorRepository fornecedorRepository;

	public FornecedorModel save(FornecedorModel FornecedorModel) {
		return fornecedorRepository.save(FornecedorModel);
	}

	public List<FornecedorModel> fornecedorByAll() {
		return fornecedorRepository.findAll();
	}

	public Optional<FornecedorModel> fornecedorById(Long fornecedorId) {
		return fornecedorRepository.findById(fornecedorId);
	}
}
