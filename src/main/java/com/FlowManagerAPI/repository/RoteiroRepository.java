package com.FlowManagerAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FlowManagerAPI.model.MedidasModel;
import com.FlowManagerAPI.model.RoteiroModel;

@Repository
public interface RoteiroRepository extends JpaRepository<RoteiroModel, Long> {

}
