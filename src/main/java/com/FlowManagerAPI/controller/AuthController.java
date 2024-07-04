package com.FlowManagerAPI.controller;

import java.util.List;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FlowManagerAPI.dto.AuthenticationDto;
import com.FlowManagerAPI.model.ProdutoModel;
import com.FlowManagerAPI.service.AuthService;
import com.FlowManagerAPI.service.ProdutoService;

@CrossOrigin
@RestController
@RequestMapping("/flowmanager/api/auth")
public class AuthController {

	@Autowired
	private AuthService authService;
	
	@PostMapping("/login")
	public ResponseEntity<?> loginUsuario(@RequestBody AuthenticationDto authDto) {
		return ResponseEntity.ok(authService.login(authDto));
	}
}
