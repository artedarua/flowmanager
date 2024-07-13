package com.FlowManagerAPI.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlowManagerAPI.model.FornecedorModel;
import com.FlowManagerAPI.model.ProdutoModel;
import com.FlowManagerAPI.model.UsuarioModel;
import com.FlowManagerAPI.repository.ProdutoRepository;
import com.FlowManagerAPI.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public UsuarioModel save(UsuarioModel usuarioModel) {
		return usuarioRepository.save(usuarioModel);
	}
	
	public Optional <UsuarioModel> usuarioByLogin(String loginUsuario) {
		return usuarioRepository.findByLoginUsuario(loginUsuario);
	}
	 
	public UsuarioModel updateDesativa(String loginUsuario) {
		
		UsuarioModel usuario= new UsuarioModel();
		usuario = (UsuarioModel) usuarioRepository.findByLoginDesativar(loginUsuario);
		usuario.setAtivoUsuario("D");
		return usuarioRepository.save(usuario);
	}
	

}
