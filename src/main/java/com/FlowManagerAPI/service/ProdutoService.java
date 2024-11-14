package com.FlowManagerAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlowManagerAPI.model.ClienteModel;
import com.FlowManagerAPI.model.ContatoModel;
import com.FlowManagerAPI.model.ProdutoModel;
import com.FlowManagerAPI.repository.ClienteRepository;
import com.FlowManagerAPI.repository.ContatoRepository;
import com.FlowManagerAPI.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ContatoRepository contatoRepository;

	public ProdutoModel save(ProdutoModel produtoModel) {
		
		Boolean findProduto = produtoByNomeProduto(produtoModel.getNomeProduto());
		
		if (findProduto) {
			return produtoRepository.save(produtoModel);
		} else {
			return null;
		}

	}

	public List<ProdutoModel> produtoByAll() {
		return produtoRepository.findByTodosProdutos();
	}

	public boolean produtoByNomeProduto(String nomeProduto) {

		ProdutoModel produto = produtoRepository.getByNomeProduto(nomeProduto);

		if (produto == null) {
			return true;
		} else {
			return false;
		}

	}
}
