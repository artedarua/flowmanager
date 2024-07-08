package com.FlowManagerAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FlowManagerAPI.model.HardwareModel;
import com.FlowManagerAPI.model.MaquinasCTModel;

@Repository
public interface MaquinaCTRepository extends JpaRepository <MaquinasCTModel, Long> {

}
