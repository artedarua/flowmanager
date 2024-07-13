package com.FlowManagerAPI.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.FlowManagerAPI.model.UsuarioModel;

public class UserDetailsImpl implements UserDetails {

	private Long id;
	
	private String nome;

	private String login;
	
	private String email;
		
	private String password;
	
	private String tipo;
	
	private String ativo;
	
	public static UserDetailsImpl build (UsuarioModel usuario) {
		return new UserDetailsImpl(usuario.getIdUsuario(), 
				                   usuario.getNomeUsuario(), 
				                   usuario.getLoginUsuario(), 
				                   usuario.getEmailUsuario(),
				                   usuario.getSenhaUsuario(),
				                   usuario.getTipoUsuario(),
				                   usuario.getAtivoUsuario(),
				                   new ArrayList<>());
	};

	
	
	public UserDetailsImpl(Long id, String nome, String login, String email, String passaword, String tipo, String ativo,
			Collection<? extends GrantedAuthority> authorities) {
		super();
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.email = email;
		this.password =passaword;
		this.tipo = tipo;
		this.authorities = authorities;
		this.ativo = ativo;
	}



	private  Collection<? extends GrantedAuthority> authorities;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}
	@Override
	public String getUsername() {

		return login;
	}

	public String getPassword() {
		return password;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getAtivo() {
		return ativo;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}


	

}
