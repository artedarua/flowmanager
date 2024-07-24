package com.FlowManagerAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FlowManagerAPI.model.ContatoModel;
import com.FlowManagerAPI.model.FerramentalModel;

@Repository
public interface ContatoRepository extends JpaRepository <ContatoModel, Long> {

}
