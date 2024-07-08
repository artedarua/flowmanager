package com.FlowManagerAPI.dto;

public class AccessDto {
	
private String token;
private String tipoUsuario;

	public AccessDto(String token,String tipoUsuario) {
		super();
		this.token = token;
		this.tipoUsuario=tipoUsuario;
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
}
