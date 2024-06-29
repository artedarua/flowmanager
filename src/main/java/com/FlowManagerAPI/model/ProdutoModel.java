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
@Table(name = "fma1t_produto")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProdutoModel {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fma1_id_produto")
	private Long idProduto;
	
	@Column(name = "fma1_nome_produto")
	private String nomeProduto;
	
	@Column(name = "fma1_partnumber_produto")
	private String partNumberProduto;

	@Column(name = "fma1_contato_produto")
	private String contatoProduto;

	@ManyToOne
	@JoinColumn(name = "fma1_fornecedor_produto", referencedColumnName = "fma2_id_fornecedor")
    private FornecedorModel fornecedor;
		
	@Column(name = "fma1_tipo_produto")
	private String tipoProduto;
}
