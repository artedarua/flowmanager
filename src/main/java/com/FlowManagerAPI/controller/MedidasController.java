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

import com.FlowManagerAPI.model.MaquinasCTModel;
import com.FlowManagerAPI.model.MedidasModel;
import com.FlowManagerAPI.service.MaquinaCTService;
import com.FlowManagerAPI.service.MedidasService;

@CrossOrigin
@RestController
@RequestMapping("/flowmanager/api/medidas")
public class MedidasController {

	@Autowired
	private MedidasService medidasService;
	
	
	@PostMapping("/save")
	public ResponseEntity<MedidasModel> save(@RequestBody MedidasModel medidas) {
		return ResponseEntity.ok(medidasService.save(medidas));
	}

	@GetMapping("/id/{id}")
	public ResponseEntity<Optional<MedidasModel>> MedidasById(@PathVariable Long id) {
		return ResponseEntity.ok(medidasService.MedidasById(id));
	}
	
}
