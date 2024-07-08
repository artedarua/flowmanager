package com.FlowManagerAPI.model;

import java.sql.Date;

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
	
	@Column(name = "fma1_data_revisao_desenho_produto")
	private Date dataRevisaoDesenhoProduto;
	
	@Column(name = "fma1_num_revisao_desenho_produto")
	private String numRevisaoDesenhoProduto;
	
	@Column(name = "fma1_data_revisao_3d_produto")
	private String dateRevisao3dProduto;
	
	@Column(name = "fma1_data_cadastro_produto")
	private Date dataCadastroProduto;

	@ManyToOne
	@JoinColumn(name = "fma1_roteiro_produto", referencedColumnName = "fma4_id_roteiro")
    private RoteiroModel roteiro;
		

}
