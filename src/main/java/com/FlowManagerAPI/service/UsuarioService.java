package com.FlowManagerAPI.service;

import java.security.SecureRandom;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.FlowManagerAPI.config.MailConfig;
import com.FlowManagerAPI.model.FornecedorModel;
import com.FlowManagerAPI.model.ProdutoModel;
import com.FlowManagerAPI.model.UsuarioModel;
import com.FlowManagerAPI.repository.ProdutoRepository;
import com.FlowManagerAPI.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private EnviarEmailService emailSend;

	@Autowired
	private LogService logBd;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public UsuarioModel save(UsuarioModel usuarioModel) {

		UsuarioModel usuario = usuarioModel;
		// setar usuario ativo
		usuario.setAtivoUsuario("A");

		String Conteudo = "Foi realizado o cadastro de seu usuário para acesso ao sistema FlowManager. "
				+ "O seu Usuario  do sistema é '"+ usuario.getLoginUsuario() + "',";

		emailSend.EnviarEmail(usuario.getEmailUsuario(), " FlowManager-Sistema", Conteudo);

		// log
		logBd.save("usuario Criado");

		return usuarioRepository.save(usuario);
	}

	public Optional<UsuarioModel> usuarioByLogin(String loginUsuario) {
		return usuarioRepository.findByLoginUsuario(loginUsuario);
	}

	public UsuarioModel updateDesativa(String loginUsuario) {

		UsuarioModel usuario = new UsuarioModel();
		usuario = (UsuarioModel) usuarioRepository.findByLoginDesativar(loginUsuario);
		usuario.setAtivoUsuario("D");
		return usuarioRepository.save(usuario);
	}

	public String atualizarSenha(String usuario, String senha) {

		usuarioRepository.atualizarSenhar(usuario, senha);

		String Conteudo = "Foi realizada a atualização da senha para o usuario '" + usuario + "'";
	
		 return null;
	}

	public String atualizarInfo(UsuarioModel usuarioModel) {

		UsuarioModel usuario = usuarioModel;
		String Conteudo = "Foi realizada a atualização do usuario '" + usuario.getLoginUsuario() + "'" + " "
				+ usuario.getCelularUsuario() + " " + usuario.getNivelAcessoUsuario() + " " + usuario.getEmailUsuario()
				+ " " + usuario.getSecretoUsuario();
		emailSend.EnviarEmail(usuario.getEmailUsuario(), " FlowManager-Sistema", Conteudo);

		int validarRetorno = usuarioRepository.atualizarInfo(usuarioModel.getLoginUsuario(),
				usuarioModel.getCelularUsuario() != null ? usuarioModel.getCelularUsuario() : null,
				usuarioModel.getNivelAcessoUsuario() != null ? usuarioModel.getNivelAcessoUsuario() : null,
				usuarioModel.getEmailUsuario() != null ? usuarioModel.getEmailUsuario() : null,
				usuarioModel.getSecretoUsuario() != null ? usuarioModel.getSecretoUsuario() : null);
		if (validarRetorno > 0) {
			return "OK";
		} else {
			return "NOK";
		}
	}

	public UsuarioModel recuperarUsuarioByLogin(String usuarioLogin, String emailUsuario) {

		UsuarioModel usuario;
		
		usuario = usuarioRepository.findByLoginRecuperar(usuarioLogin, emailUsuario);
		if(!usuario.equals(null)){
			String senha =gerarSenha() ;
			
			usuario.setSenhaUsuario(passwordEncoder.encode(senha));

			
			String Conteudo = "Foi realizado a atualização da senha do seu usuario '"+ usuario.getLoginUsuario() + "'"
					+ " e senha "+senha+", favor realizar a troca." ;

			emailSend.EnviarEmail(usuario.getEmailUsuario(), "FlowManager-Sistema", Conteudo);
			
			return usuarioRepository.save(usuario);
		}else {
			return null;
		}
	

	}

	public List<UsuarioModel> mostrarUsuarios(String nomeUsuario, String loginUsuario, String emailUsuario,
			String nivelAcessoUsuario, String celularUsuario, String ativoUsuario) {

		return usuarioRepository.findByUsuario(nomeUsuario, loginUsuario, emailUsuario, nivelAcessoUsuario,
				celularUsuario, ativoUsuario);
	}

	public List<UsuarioModel> mostrarUsuarioByAll(String Email) {

		return null;
	}
	
	public String gerarSenha() {
		
        String caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        
        SecureRandom random = new SecureRandom();
        
        int comprimento=12;
        StringBuilder senha = new StringBuilder(comprimento);
        
        for (int i = 0; i < comprimento; i++) {
            // Escolher um caractere aleatório do conjunto de caracteres permitidos
            int indice = random.nextInt(caracteresPermitidos.length());
            senha.append(caracteresPermitidos.charAt(indice));
        }
        
        // Retornar a senha gerada
        return senha.toString();
	}
}
