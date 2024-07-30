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
import com.FlowManagerAPI.model.PedidoVendaModel;
import com.FlowManagerAPI.service.MedidasService;
import com.FlowManagerAPI.service.PedidoVendaService;

@CrossOrigin
@RestController
@RequestMapping("/flowmanager/api/pedidovenda")
public class PedidoVendaController {

	@Autowired
	private PedidoVendaService pedidoVendaService;

	@PostMapping("/save")
	public ResponseEntity<PedidoVendaModel> save(@RequestBody PedidoVendaModel pedidoVendaModel) {
		return ResponseEntity.ok(pedidoVendaService.save(pedidoVendaModel));
	}

	@GetMapping("/id/{id}")
	public ResponseEntity<Optional<PedidoVendaModel>> pedidoVendaById(@PathVariable Long id) {
		return ResponseEntity.ok(pedidoVendaService.pedidoVendaById(id));
	}
}
