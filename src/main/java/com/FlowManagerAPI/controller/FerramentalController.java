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
import com.FlowManagerAPI.model.ProdutoModel;
import com.FlowManagerAPI.service.FerramentalService;
import com.FlowManagerAPI.service.ProdutoService;

@CrossOrigin
@RestController
@RequestMapping("/flowmanager/api/ferramental")
public class FerramentalController {

	@Autowired
	private FerramentalService ferramentalService;

	@PostMapping("/save")
	public ResponseEntity<FerramentalModel> save(@RequestBody FerramentalModel ferramental) {
		return ResponseEntity.ok(ferramentalService.save(ferramental));
	}

	@GetMapping("/id/{id}")
	public ResponseEntity<Optional<FerramentalModel>> ferramentalById(@PathVariable Long id) {
		return ResponseEntity.ok(ferramentalService.feraamentalById(id));
	}

}
