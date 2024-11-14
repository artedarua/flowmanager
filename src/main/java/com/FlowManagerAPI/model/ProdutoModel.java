package com.FlowManagerAPI.model;
 
import java.time.LocalDate;
import java.sql.Date;

import jakarta.persistence.CascadeType;
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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "fma1t_produto")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProdutoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fma1_id_produto")
	private Long idProduto;

	@Column(name = "fma1_nome_produto", unique = true)
	private String nomeProduto;

	@Column(name = "fma1_desc_produto")
	private String descProduto;

	@Column(name = "fma1_data_revisao_2d_produto")
	private String dataRevisao2dProduto;

	@Column(name = "fma1_revisao_2d_produto")
	private String revisao2dProduto;

	@Column(name = "fma1_data_revisao_3d_produto")
	private String dataRevisao3dProduto;

	@Column(name = "fma1_revisao_3d_produto")
	private String revisao3dProduto;

	@Column(name = "fma1_tipo_produto")
	private String tipoProduto;

	@Column(name = "fma1_data_cadastro_produto")
	private Date dataCadastroProduto;

	@Column(name = "fma1_data_ltima_edicao_produto")
	private Date dataUltimaEdicaoProduto;
	
	@Column(name = "fma1_dataStr_produto")
	private String dataStrCadastro;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fma1_cliente_produto", referencedColumnName = "fma11_id_cliente")
	private ClienteModel cliente;

	@ManyToOne
	@JoinColumn(name = "fma1_roteiro_produto", referencedColumnName = "fma4_id_roteiro")
	private RoteiroModel roteiro;

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescProduto() {
		return descProduto;
	}

	public void setDescProduto(String descProduto) {
		this.descProduto = descProduto;
	}

	public String getRevisao2dProduto() {
		return revisao2dProduto;
	}

	public void setRevisao2dProduto(String revisao2dProduto) {
		this.revisao2dProduto = revisao2dProduto;
	}

	public String getRevisao3dProduto() {
		return revisao3dProduto;
	}

	public void setRevisao3dProduto(String revisao3dProduto) {
		this.revisao3dProduto = revisao3dProduto;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	

	public Date getDataCadastroProduto() {
		return dataCadastroProduto;
	}

	public void setDataCadastroProduto(Date dataCadastroProduto) {
		this.dataCadastroProduto = dataCadastroProduto;
	}

	public Date getDataUltimaEdicaoProduto() {
		return dataUltimaEdicaoProduto;
	}

	public void setDataUltimaEdicaoProduto(Date dataUltimaEdicaoProduto) {
		this.dataUltimaEdicaoProduto = dataUltimaEdicaoProduto;
	}

	public ClienteModel getCliente() {
		return cliente;
	}

	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}

	public String getDataRevisao2dProduto() {
		return dataRevisao2dProduto;
	}

	public void setDataRevisao2dProduto(String dataRevisao2dProduto) {
		this.dataRevisao2dProduto = dataRevisao2dProduto;
	}

	public String getDataRevisao3dProduto() {
		return dataRevisao3dProduto;
	}

	public void setDataRevisao3dProduto(String dataRevisao3dProduto) {
		this.dataRevisao3dProduto = dataRevisao3dProduto;
	}

	public String getDataStrCadastro() {
		return dataStrCadastro;
	}

	public void setDataStrCadastro(String dataStrCadastro) {
		this.dataStrCadastro = dataStrCadastro;
	}
	
}
