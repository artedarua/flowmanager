package com.FlowManagerAPI.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

	public UsuarioModel save(UsuarioModel usuarioModel) {

		UsuarioModel usuario = usuarioModel;
		// setar usuario ativo
		usuario.setAtivoUsuario("A");

		String Conteudo = "Foi realizado o cadastro de seu Usuario para acesso ao sistema 'FlowManager'. O Seu Usuario é '"
				+ usuario.getLoginUsuario() + "'," + " em caso de perda de senha favor utilizar a palavra secreta '"
				+ usuario.getSecretoUsuario() + "' juntamente com seu login para trocar a senha na tela de login.";

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

	public String atualizarSenha(UsuarioModel usuarioModel) {

		UsuarioModel usuario = usuarioModel;
		UsuarioModel usuarioEmail = (UsuarioModel) usuarioRepository.findByLoginRecuperar(usuario.getLoginUsuario());

		usuario.setEmailUsuario(usuarioEmail.getEmailUsuario());
		String Conteudo = "Foi realizada a atualização da senha para o usaurio '" + usuario.getLoginUsuario() + "'";
		emailSend.EnviarEmail(usuario.getEmailUsuario(), " FlowManager-Sistema", Conteudo);

		int validarRetorno = usuarioRepository.atualizarSenhar(usuario.getLoginUsuario(), usuario.getSenhaUsuario());

		if (validarRetorno > 0) {
			return "OK";
		} else {
			return "NOK";
		}
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

	public String recuperarUsuarioByLogin(String usuarioLogin, String secreta) {
		UsuarioModel usuario = new UsuarioModel();

		usuario = (UsuarioModel) usuarioRepository.findByLoginRecuperar(usuarioLogin);

		if (usuario.getSecretoUsuario().equals(secreta)) {

			return "OK";

		} else {
			return "NOK";
		}

	}

}
