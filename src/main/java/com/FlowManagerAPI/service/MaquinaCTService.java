package com.FlowManagerAPI.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlowManagerAPI.model.FerramentalModel;
import com.FlowManagerAPI.model.MaquinasCTModel;
import com.FlowManagerAPI.repository.FerramentalRepository;
import com.FlowManagerAPI.repository.MaquinaCTRepository;

@Service
public class MaquinaCTService {

	@Autowired
	private MaquinaCTRepository maquinaCTRepository;

	public MaquinasCTModel save(MaquinasCTModel maquinasCTModel) {
		return maquinaCTRepository.save(maquinasCTModel);
	}

	public Optional<MaquinasCTModel> maquinaCTById(Long idMaquinaCT) {
		return maquinaCTRepository.findById(idMaquinaCT);
	}
}
