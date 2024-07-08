package com.FlowManagerAPI.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlowManagerAPI.model.MaquinasCTModel;
import com.FlowManagerAPI.model.MedidasModel;
import com.FlowManagerAPI.repository.MaquinaCTRepository;
import com.FlowManagerAPI.repository.MedidasRepository;

@Service
public class MedidasService {

	@Autowired
	private MedidasRepository medidasRepository;
	
	public MedidasModel save(MedidasModel medidasModel) {
		return medidasRepository.save(medidasModel);
	}
	
	public Optional<MedidasModel> MedidasById(Long idMedidas) {
		return medidasRepository.findById(idMedidas);
	}

}
