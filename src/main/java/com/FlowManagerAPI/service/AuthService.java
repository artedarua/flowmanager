package com.FlowManagerAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.FlowManagerAPI.dto.AccessDto;
import com.FlowManagerAPI.dto.AuthenticationDto;
import com.FlowManagerAPI.security.jwt.JwtUtils;
import com.FlowManagerAPI.service.impl.UserDetailsImpl;

@Service
public class AuthService {
    
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtUtils jwtUtils;
	
	
	public AccessDto login (AuthenticationDto authDto) {
		
		try {
		UsernamePasswordAuthenticationToken  usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(authDto.getUserName(), authDto.getSenha());
		
		Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
		
		UserDetailsImpl userAuth = 	(UserDetailsImpl) authentication.getPrincipal();
		
		 String token = jwtUtils.generateTokenFronUserDetailsImpl(userAuth);
		 
		 AccessDto accessDto = new AccessDto(token,userAuth.getTipo(),userAuth.getAtivo());
		
		 return accessDto;
	}catch (BadCredentialsException e) {
		// TODO: handle exception
		return null;
	}
		

}
}

	
