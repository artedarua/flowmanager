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

import com.FlowManagerAPI.model.FerramentalModel;
import com.FlowManagerAPI.model.MaquinasCTModel;
import com.FlowManagerAPI.service.FerramentalService;
import com.FlowManagerAPI.service.MaquinaCTService;

@CrossOrigin
@RestController
@RequestMapping("/flowmanager/api/maquinaCT")
public class MaquinaCTController {

	@Autowired
	private MaquinaCTService maquinaCTService;
	
	
	@PostMapping("/save")
	public ResponseEntity<MaquinasCTModel> save(@RequestBody MaquinasCTModel maquinaCT) {
		return ResponseEntity.ok(maquinaCTService.save(maquinaCT));
	}

	@GetMapping("/id/{id}")
	public ResponseEntity<Optional<MaquinasCTModel>> MaquinaById(@PathVariable Long id) {
		return ResponseEntity.ok(maquinaCTService.MaquinaCTById(id));
	}
	
	
}
