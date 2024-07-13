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

	@GetMapping("/login/{usuarioLogin}")
	public ResponseEntity<Optional<UsuarioModel>> usuarioByLogin(@PathVariable String usuarioLogin) {
		return ResponseEntity.ok(usuarioService.usuarioByLogin(usuarioLogin));
	}

	@PutMapping("/desativa/{usuarioLogin}")
	public ResponseEntity<UsuarioModel> usuarioDesativar(@PathVariable String usuarioLogin) {
		return ResponseEntity.ok(usuarioService.updateDesativa(usuarioLogin));
	}

}
