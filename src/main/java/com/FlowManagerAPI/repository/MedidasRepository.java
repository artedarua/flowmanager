package com.FlowManagerAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FlowManagerAPI.model.MaquinasCTModel;
import com.FlowManagerAPI.model.MedidasModel;

@Repository
public interface MedidasRepository extends JpaRepository<MedidasModel, Long> {

}
