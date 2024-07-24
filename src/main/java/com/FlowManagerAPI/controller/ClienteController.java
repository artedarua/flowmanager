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
import com.FlowManagerAPI.model.HardwareModel;
import com.FlowManagerAPI.service.ClienteService;
import com.FlowManagerAPI.service.HardwareService;

@CrossOrigin
@RestController
@RequestMapping("/flowmanager/api/cliente")
public class ClienteController {

	
	@Autowired
	private ClienteService clienteService;
	
	
	@PostMapping("/save")
	public ResponseEntity<ClienteModel> save(@RequestBody ClienteModel cliente) {
		return ResponseEntity.ok(clienteService.save(cliente));
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Optional<ClienteModel>> ClienteById(@PathVariable Long id) {
		return ResponseEntity.ok(clienteService.ClienteById(id));
	}
	
}
