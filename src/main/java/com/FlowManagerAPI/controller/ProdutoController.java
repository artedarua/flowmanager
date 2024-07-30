package com.FlowManagerAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FlowManagerAPI.model.ProdutoModel;
import com.FlowManagerAPI.service.ProdutoService;

@CrossOrigin
@RestController
@RequestMapping("/flowmanager/api/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@PostMapping("/save")
	public ResponseEntity<ProdutoModel> save(@RequestBody ProdutoModel produto) {
		return ResponseEntity.ok(produtoService.save(produto));
	}

	@GetMapping("/all")
	public ResponseEntity<List<ProdutoModel>> produtosTodos() {
		return ResponseEntity.ok(produtoService.produtoByAll());
	}

}
