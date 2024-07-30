package com.FlowManagerAPI.controller;

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

import com.FlowManagerAPI.model.ClienteModel;
import com.FlowManagerAPI.model.ContatoModel;
import com.FlowManagerAPI.service.ClienteService;
import com.FlowManagerAPI.service.ContatoService;

@CrossOrigin
@RestController
@RequestMapping("/flowmanager/api/contato")
public class ContatoController {

	@Autowired
	private ContatoService contatoService;

	@PostMapping("/save")
	public ResponseEntity<ContatoModel> save(@RequestBody ContatoModel contato) {
		return ResponseEntity.ok(contatoService.save(contato));
	}

	@GetMapping("/id/{id}")
	public ResponseEntity<Optional<ContatoModel>> contatoBYyId(@PathVariable Long id) {
		return ResponseEntity.ok(contatoService.contatoeById(id));
	}
}
