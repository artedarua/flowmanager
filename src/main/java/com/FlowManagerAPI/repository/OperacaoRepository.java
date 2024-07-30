package com.FlowManagerAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FlowManagerAPI.model.OperacaoModel;
import com.FlowManagerAPI.model.PedidoVendaModel;

@Repository

public interface OperacaoRepository extends JpaRepository<OperacaoModel, Long> {

}
