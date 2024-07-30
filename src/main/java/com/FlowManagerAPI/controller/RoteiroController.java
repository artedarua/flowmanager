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

import com.FlowManagerAPI.model.MedidasModel;
import com.FlowManagerAPI.model.RoteiroModel;
import com.FlowManagerAPI.service.MedidasService;
import com.FlowManagerAPI.service.RoteiroService;

@CrossOrigin
@RestController
@RequestMapping("/flowmanager/api/roteiro")
public class RoteiroController {

	@Autowired
	private RoteiroService roteiroService;

	@PostMapping("/save")
	public ResponseEntity<RoteiroModel> save(@RequestBody RoteiroModel roteiro) {
		return ResponseEntity.ok(roteiroService.save(roteiro));
	}

	@GetMapping("/id/{id}")
	public ResponseEntity<Optional<RoteiroModel>> roteiroById(@PathVariable Long id) {
		return ResponseEntity.ok(roteiroService.roteiroById(id));
	}

}
