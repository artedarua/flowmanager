package com.FlowManagerAPI.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlowManagerAPI.model.ClienteModel;
import com.FlowManagerAPI.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public ClienteModel save(ClienteModel clienteModel) {
		return clienteRepository.save(clienteModel);
	}

	public Optional<ClienteModel> clienteById(Long idCliente) {
		return clienteRepository.findById(idCliente);
	}
}
