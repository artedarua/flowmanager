package com.FlowManagerAPI.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "fma4t_roteiro")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class RoteiroModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fma4_id_roteiro")
	private Long idRoteiro;
	
	@Column(name = "fma4_nome_roteiro")
	private String nomeRoteiro;
	
	@ManyToOne
    @JoinColumn(name = "fma4_produto_roteiro") 
    private ProdutoModel produtoModel;
}
