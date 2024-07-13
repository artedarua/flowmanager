package com.FlowManagerAPI.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.FlowManagerAPI.model.ProdutoModel;
import com.FlowManagerAPI.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository <UsuarioModel, Long>  {

	Optional<UsuarioModel> findByLoginUsuario(String loginUsuario);

	@Query("SELECT u FROM UsuarioModel u WHERE u.loginUsuario = :loginUsuario")
	UsuarioModel findByLoginDesativar(@Param("loginUsuario") String loginUsuario);
	

}
