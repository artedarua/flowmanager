package com.FlowManagerAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.FlowManagerAPI.model.FerramentalModel;

@Repository
public interface FerramentalRepository extends JpaRepository <FerramentalModel, Long>  {

}
