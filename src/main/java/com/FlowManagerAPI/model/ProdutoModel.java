package com.FlowManagerAPI.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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

	@Column(name = "fma1_desc_produto")
	private String descProduto;

	@Column(name = "fma1_data_revisao_2d_produto")
	private Date dataRevisao2dProduto;

	@Column(name = "fma1_revisao_2d_produto")
	private String revisao2dProduto;

	@Column(name = "fma1_data_revisao_3d_produto")
	private Date dataRevisao3dProduto;

	@Column(name = "fma1_revisao_3d_produto")
	private String revisao3dProduto;

	@Column(name = "fma1_data_cadastro_produto")
	private Date dataCadastroProduto;

	@Column(name = "fma1_data_ltima_edicao_produto")
	private Date dataUltimaEdicaoProduto;

	@OneToOne
	@JoinColumn(name = "fma1_cliente_produto", referencedColumnName = "fma11_id_cliente")
	private ClienteModel cliente;

	@ManyToOne
	@JoinColumn(name = "fma1_roteiro_produto", referencedColumnName = "fma4_id_roteiro")
	private RoteiroModel roteiro;

}
