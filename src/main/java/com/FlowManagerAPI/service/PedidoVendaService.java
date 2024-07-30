package com.FlowManagerAPI.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlowManagerAPI.model.MedidasModel;
import com.FlowManagerAPI.model.PedidoVendaModel;
import com.FlowManagerAPI.repository.MedidasRepository;
import com.FlowManagerAPI.repository.PedidoVendaRepository;

@Service
public class PedidoVendaService {

	@Autowired
	private PedidoVendaRepository pedidoVendaRepository;

	public PedidoVendaModel save(PedidoVendaModel pedidoVendaModel) {
		return pedidoVendaRepository.save(pedidoVendaModel);
	}

	public Optional<PedidoVendaModel> pedidoVendaById(Long idPedidoVendas) {
		return pedidoVendaRepository.findById(idPedidoVendas);
	}

}
