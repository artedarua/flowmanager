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
@Table(name = "fma5t_Usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fma5_id_Usuario")
	private Long idUsuario;
	
	@Column(name = "fma5_nome_usuario")
	private String nomeUsuario;
	
	@Column(name = "fma5_login_usuario")
	private String loginUsuario;
	
	@Column(name = "fma5_email_usuario")
	private String emailUsuario;
	
	@Column(name = "fma5_senha_usuario")
	private String senhaUsuario;
	
	@Column(name = "fma5_obs_usuario")
	private String obsUsuario;
	
	@Column(name = "fma5_tipo_usuario")
	private String tipoUsuario;

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

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	

}
