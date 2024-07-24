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
@Table(name = "fma11t_Cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ClienteModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fma11_id_cliente")
	private Long idCliente;
	
	@Column(name = "fma11_nome_cliente")
	private String nomeCliente;
	
	@Column(name = "fma11_segmento_cliente")
	private String segmentoCliente;
	
	@Column(name = "fma11_obs_cliente")
	private String obsClienteCliente;
	
	@ManyToOne
	@JoinColumn(name = "fma11_contato_cliente", referencedColumnName = "fma12_id_contatocliente")
    private ContatoModel contatoCliente;

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getSegmentoCliente() {
		return segmentoCliente;
	}

	public void setSegmentoCliente(String segmentoCliente) {
		this.segmentoCliente = segmentoCliente;
	}

	public String getObsClienteCliente() {
		return obsClienteCliente;
	}

	public void setObsClienteCliente(String obsClienteCliente) {
		this.obsClienteCliente = obsClienteCliente;
	}

	public ContatoModel getContatoCliente() {
		return contatoCliente;
	}

	public void setContatoCliente(ContatoModel contatoCliente) {
		this.contatoCliente = contatoCliente;
	}

	
}
