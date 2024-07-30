package com.FlowManagerAPI.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "fma2t_fornecedor")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class FornecedorModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fma2_id_fornecedor")
	private Long idFornecedor;

	@Column(name = "fma2_nome_fornecedor")
	private String nomeFornecedor;

	@Column(name = "fma2_cnpj_fornecedor")
	private String cnpjFornecedor;

	@Column(name = "fma2_contato_fornecedor")
	private String contatoFornecedor;

	@Column(name = "fma2_obs_fornecedor")
	private String obsFornecedor;

	public Long getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(Long idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public String getCnpjFornecedor() {
		return cnpjFornecedor;
	}

	public void setCnpjFornecedor(String cnpjFornecedor) {
		this.cnpjFornecedor = cnpjFornecedor;
	}

	public String getContatoFornecedor() {
		return contatoFornecedor;
	}

	public void setContatoFornecedor(String contatoFornecedor) {
		this.contatoFornecedor = contatoFornecedor;
	}

	public String getObsFornecedor() {
		return obsFornecedor;
	}

	public void setObsFornecedor(String obsFornecedor) {
		this.obsFornecedor = obsFornecedor;
	}

}
