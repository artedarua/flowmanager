package com.FlowManagerAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.FlowManagerAPI.model.ProdutoModel;
import com.FlowManagerAPI.model.UsuarioModel;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {

	@Query("SELECT p FROM ProdutoModel p")
	List<ProdutoModel> findByTodosProdutos();

	@Query("SELECT u.nomeProduto FROM ProdutoModel u WHERE u.nomeProduto = :nomeProduto")
	ProdutoModel getByNomeProduto(@Param("nomeProduto") String nomeProduto);
}
