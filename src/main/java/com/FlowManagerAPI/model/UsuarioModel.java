package com.FlowManagerAPI.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "fma5t_Usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fma5_id_Usuario")
	private Long idUsuario;

	@NotNull
	@Column(name = "fma5_nome_usuario")
	private String nomeUsuario;

	@NotNull
	@Column(name = "fma5_login_usuario", unique = true)
	private String loginUsuario;

	@NotNull
	@Column(name = "fma5_email_usuario", unique = true)
	private String emailUsuario;

	@NotNull
	@Column(name = "fma5_senha_usuario")
	private String senhaUsuario;

	@Column(name = "fma5_obs_usuario")
	private String obsUsuario;

	@NotNull
	@Column(name = "fma5_nivelAcesso_usuario")
	private String nivelAcessoUsuario;

	@NotNull
	@Column(name = "fma5_secreto_usuario")
	private String secretoUsuario;

	@Column(name = "fma5_celular_usuario")
	private String celularUsuario;

	@Column(name = "fma5_ativo_usuario")
	private String ativoUsuario;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getLoginUsuario() {
		return loginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public String getObsUsuario() {
		return obsUsuario;
	}

	public void setObsUsuario(String obsUsuario) {
		this.obsUsuario = obsUsuario;
	}

	public String getSecretoUsuario() {
		return secretoUsuario;
	}

	public void setSecretoUsuario(String secretoUsuario) {
		this.secretoUsuario = secretoUsuario;
	}

	public String getCelularUsuario() {
		return celularUsuario;
	}

	public void setCelularUsuario(String celularUsuario) {
		this.celularUsuario = celularUsuario;
	}

	public String getAtivoUsuario() {
		return ativoUsuario;
	}

	public void setAtivoUsuario(String ativoUsuario) {
		this.ativoUsuario = ativoUsuario;
	}

	public String getNivelAcessoUsuario() {
		return nivelAcessoUsuario;
	}

	public void setNivelAcessoUsuario(String nivelAcessoUsuario) {
		this.nivelAcessoUsuario = nivelAcessoUsuario;
	}

}
