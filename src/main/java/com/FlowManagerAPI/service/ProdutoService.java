package com.FlowManagerAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlowManagerAPI.model.ProdutoModel;
import com.FlowManagerAPI.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public ProdutoModel save(ProdutoModel produtoModel) {
		return produtoRepository.save(produtoModel);
	}

	public List<ProdutoModel> produtoByAll() {
		return produtoRepository.findByTodosProdutos();
	}
}
