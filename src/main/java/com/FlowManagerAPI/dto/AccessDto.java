package com.FlowManagerAPI.dto;

public class AccessDto {
	
private String token;
private String tipoUsuario;
private String ativoUsuario;

	public AccessDto(String token,String tipoUsuario) {
		super();
		this.token = token;
		this.tipoUsuario=tipoUsuario;
	}
	
	public AccessDto(String token, String tipoUsuario, String ativoUsuario) {
		super();
		this.token = token;
		this.tipoUsuario = tipoUsuario;
		this.ativoUsuario = ativoUsuario;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getAtivoUsuario() {
		return ativoUsuario;
	}

	public void setAtivoUsuario(String ativoUsuario) {
		this.ativoUsuario = ativoUsuario;
	}
	
}
