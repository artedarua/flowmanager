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
@Table(name = "fma12t_contatocliente")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ContatoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fma12_id_contatocliente")
	private Long idContatoCliente;

	@Column(name = "fma12_contato_ContatoCliente")
	private String contatoContatoCliente;

	@Column(name = "fma12_email_ContatoCliente")
	private String emailContatocliente;

	@Column(name = "fma12_tel_ContatoCliente")
	private String telContatocliente;

	public Long getIdContatoCliente() {
		return idContatoCliente;
	}

	public void setIdContatoCliente(Long idContatoCliente) {
		this.idContatoCliente = idContatoCliente;
	}

	public String getContatoContatoCliente() {
		return contatoContatoCliente;
	}

	public void setContatoContatoCliente(String contatoContatoCliente) {
		this.contatoContatoCliente = contatoContatoCliente;
	}

	public String getEmailContatocliente() {
		return emailContatocliente;
	}

	public void setEmailContatocliente(String emailContatocliente) {
		this.emailContatocliente = emailContatocliente;
	}

	public String getTelContatocliente() {
		return telContatocliente;
	}

	public void setTelContatocliente(String telContatocliente) {
		this.telContatocliente = telContatocliente;
	}

}
