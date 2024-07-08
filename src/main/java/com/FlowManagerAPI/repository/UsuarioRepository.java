package com.FlowManagerAPI.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FlowManagerAPI.model.ProdutoModel;
import com.FlowManagerAPI.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository <UsuarioModel, Long>  {

	Optional<UsuarioModel> findByLoginUsuario(String loginUsuario);

}
