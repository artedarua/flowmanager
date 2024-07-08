package com.FlowManagerAPI.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlowManagerAPI.model.FerramentalModel;
import com.FlowManagerAPI.model.HardwareModel;
import com.FlowManagerAPI.repository.FerramentalRepository;
import com.FlowManagerAPI.repository.HardwareRepository;

@Service
public class HardwareService {
	
	@Autowired
	private HardwareRepository hardwareRepository;
	
	public HardwareModel save(HardwareModel hardwareModel) {
		return hardwareRepository.save(hardwareModel);
	}
	
	public Optional<HardwareModel> HardwareById(Long idHardware) {
		return hardwareRepository.findById(idHardware);
	}


}
