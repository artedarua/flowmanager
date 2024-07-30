package com.FlowManagerAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FlowManagerAPI.model.ClienteModel;
import com.FlowManagerAPI.model.FerramentalModel;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {

}
