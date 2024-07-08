package com.FlowManagerAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FlowManagerAPI.model.FerramentalModel;
import com.FlowManagerAPI.model.HardwareModel;

@Repository
public interface HardwareRepository extends JpaRepository <HardwareModel, Long> {

}
