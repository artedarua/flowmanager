package com.FlowManagerAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FlowManagerAPI.model.MaquinasCTModel;
import com.FlowManagerAPI.model.PedidoVendaModel;

@Repository
public interface PedidoVendaRepository extends JpaRepository<PedidoVendaModel, Long> {

}
