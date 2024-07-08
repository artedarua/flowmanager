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

import com.FlowManagerAPI.model.FerramentalModel;
import com.FlowManagerAPI.model.HardwareModel;
import com.FlowManagerAPI.model.ProdutoModel;
import com.FlowManagerAPI.service.HardwareService;
import com.FlowManagerAPI.service.ProdutoService;

@CrossOrigin
@RestController
@RequestMapping("/flowmanager/api/hardware")
public class HardwareController {

	@Autowired
	private HardwareService hardwareService;
	
	
	@PostMapping("/save")
	public ResponseEntity<HardwareModel> save(@RequestBody HardwareModel hardware) {
		return ResponseEntity.ok(hardwareService.save(hardware));
	}

	
	@GetMapping("/id/{id}")
	public ResponseEntity<Optional<HardwareModel>> HardwareById(@PathVariable Long id) {
		return ResponseEntity.ok(hardwareService.HardwareById(id));
	}
	
}
