package com.FlowManagerAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FlowManagerAPI.model.FornecedorModel;
import com.FlowManagerAPI.model.ProdutoModel;
import com.FlowManagerAPI.service.FornecedorService;
import com.FlowManagerAPI.service.ProdutoService;

@CrossOrigin
@RestController
@RequestMapping("/flowmanager/api/fornecedor")
public class FornecedorController {
	
	@Autowired
	private FornecedorService fornecedorService;
	
	
	@PostMapping("/save")
	public ResponseEntity<FornecedorModel> save(@RequestBody FornecedorModel fornecedor) {
		return ResponseEntity.ok(fornecedorService.save(fornecedor));
	}

	
	@GetMapping("/all")
	public ResponseEntity<List<FornecedorModel>> fornecedorByAll() {
		return ResponseEntity.ok(fornecedorService.fornecedorByAll());
	}
	
	@GetMapping("/id/{idFornecedor}")
	public ResponseEntity<Optional<FornecedorModel>> idFornecedorFind(@PathVariable("idFornecedor")Long idFornecedor) {
		return ResponseEntity.ok(fornecedorService.fornecedorById(idFornecedor));
	
	}
}
