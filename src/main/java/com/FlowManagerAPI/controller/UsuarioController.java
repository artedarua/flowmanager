package com.FlowManagerAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FlowManagerAPI.model.MedidasModel;
import com.FlowManagerAPI.model.ProdutoModel;
import com.FlowManagerAPI.model.UsuarioModel;
import com.FlowManagerAPI.service.ProdutoService;
import com.FlowManagerAPI.service.UsuarioService;

@CrossOrigin
@RestController
@RequestMapping("/flowmanager/api/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@PostMapping("/save")
	public ResponseEntity<UsuarioModel> Save(@RequestBody UsuarioModel usuario) {
		usuario.setSenhaUsuario(passwordEncoder.encode(usuario.getSenhaUsuario()));
		return ResponseEntity.ok(usuarioService.save(usuario));
	}

	@PostMapping("/login/{usuarioLogin}")
	public ResponseEntity<Optional<UsuarioModel>> usuarioByLogin(@PathVariable String usuarioLogin) {
		return ResponseEntity.ok(usuarioService.usuarioByLogin(usuarioLogin));
	}

	@PutMapping("/desativa/{usuarioLogin}")
	public ResponseEntity<UsuarioModel> usuarioDesativa3r(@PathVariable String usuarioLogin) {
		return ResponseEntity.ok(usuarioService.updateDesativa(usuarioLogin));
	}

	@PutMapping("/atualizar")
	public ResponseEntity<String> atualizarSenha(@RequestBody UsuarioModel usuario) {
		usuario.setSenhaUsuario(passwordEncoder.encode(usuario.getSenhaUsuario()));
		return ResponseEntity.ok(usuarioService.atualizarSenha(usuario));
	}

	@PutMapping("/atualiza/info")
	public ResponseEntity<String> atualizarInfo(@RequestBody UsuarioModel usuario) {
		return ResponseEntity.ok(usuarioService.atualizarInfo(usuario));
	}

	@PostMapping("/recuperar/{usuarioLogin}/{secreta}")
	public ResponseEntity<String> recuperarUsuarioByLogin(@PathVariable String usuarioLogin,
			@PathVariable String secreta) {
		return ResponseEntity.ok(usuarioService.recuperarUsuarioByLogin(usuarioLogin, secreta));
	}

}
