package com.FlowManagerAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlowManagerAPI.model.FerramentalModel;
import com.FlowManagerAPI.model.ProdutoModel;
import com.FlowManagerAPI.repository.FerramentalRepository;
import com.FlowManagerAPI.repository.ProdutoRepository;

@Service
public class FerramentalService {

	@Autowired
	private FerramentalRepository ferramentalRepository;

	public FerramentalModel save(FerramentalModel ferramentalModel) {
		return ferramentalRepository.save(ferramentalModel);
	}

	public Optional<FerramentalModel> feraamentalById(Long idFerramantal) {
		return ferramentalRepository.findById(idFerramantal);
	}
}
