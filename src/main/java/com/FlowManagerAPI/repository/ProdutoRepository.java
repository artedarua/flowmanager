package com.FlowManagerAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.FlowManagerAPI.model.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {

	@Query("SELECT p FROM ProdutoModel p")
	List<ProdutoModel> findByTodosProdutos();
}
