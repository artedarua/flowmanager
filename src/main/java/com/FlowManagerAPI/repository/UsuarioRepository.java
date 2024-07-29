package com.FlowManagerAPI.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.FlowManagerAPI.model.ProdutoModel;
import com.FlowManagerAPI.model.UsuarioModel;

import jakarta.transaction.Transactional;

@Repository
public interface UsuarioRepository extends JpaRepository <UsuarioModel, Long>  {

	Optional<UsuarioModel> findByLoginUsuario(String loginUsuario);

	@Query("SELECT u FROM UsuarioModel u WHERE u.loginUsuario = :loginUsuario")
	UsuarioModel findByLoginDesativar(@Param("loginUsuario") String loginUsuario);
	
	
	@Query("SELECT u FROM UsuarioModel u WHERE u.loginUsuario = :loginUsuario")
	UsuarioModel findByLoginRecuperar(@Param("loginUsuario") String loginUsuario);
@Transactional
@Modifying
	@Query("UPDATE UsuarioModel u SET u.senhaUsuario = :novaSenha WHERE u.loginUsuario = :loginUsuario")
	int atualizarSenhar(@Param("loginUsuario") String loginUsuario, @Param("novaSenha") String novaSenha);

@Transactional
@Modifying
@Query("UPDATE UsuarioModel u SET "
        + "u.celularUsuario = CASE WHEN :celularUsuario IS NOT NULL THEN :celularUsuario ELSE u.celularUsuario END, "
        + "u.nivelAcessoUsuario = CASE WHEN :nivelAcessoUsuario IS NOT NULL THEN :nivelAcessoUsuario ELSE u.nivelAcessoUsuario END, "
        + "u.emailUsuario = CASE WHEN :emailUsuario IS NOT NULL THEN :emailUsuario ELSE u.emailUsuario END, "
        + "u.secretoUsuario = CASE WHEN :secretoUsuario IS NOT NULL THEN :secretoUsuario ELSE u.secretoUsuario END "
        + "WHERE u.loginUsuario = :loginUsuario")
int atualizarInfo(@Param("loginUsuario") String loginUsuario, 
                  @Param("celularUsuario") String celularUsuario,  
                  @Param("nivelAcessoUsuario") String nivelAcessoUsuario, 
                  @Param("emailUsuario") String emailUsuario,
                  @Param("secretoUsuario") String secretoUsuario);
}
