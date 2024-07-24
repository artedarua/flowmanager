package com.FlowManagerAPI.service;

import org.apache.logging.log4j.LogManager;
import org.slf4j.event.Level;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.FlowManagerAPI.dto.AccessDto;
import com.FlowManagerAPI.dto.AuthenticationDto;
import com.FlowManagerAPI.repository.LogRepository;
import com.FlowManagerAPI.security.jwt.JwtUtils;
import com.FlowManagerAPI.service.impl.UserDetailsImpl;
import com.FlowManagerAPI.utils.dataFormatadaUtils;

@Service
public class AuthService {
    
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtUtils jwtUtils;
		
   
	@Autowired
	private LogService logBd ;

	public AccessDto login (AuthenticationDto authDto) {
	
		try {
		UsernamePasswordAuthenticationToken  usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(authDto.getUserName(), authDto.getSenha());
		
		Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
		
		UserDetailsImpl userAuth = 	(UserDetailsImpl) authentication.getPrincipal();
		
		 String token = jwtUtils.generateTokenFronUserDetailsImpl(userAuth);
		 
		 AccessDto accessDto = new AccessDto(token,userAuth.getnivelAcesso(),userAuth.getAtivo());
		
		 //log 
		
         logBd.save(authDto.getUserName()+" login ");
         
         return accessDto;
	}catch (BadCredentialsException e) {
		   //((org.apache.logging.log4j.Logger) logger).error("Login failed for user {}", authDto.getUserName(), e);
		   logBd.save(authDto.getUserName()+" login " +e); 

         	return null;
	}
		

}
}

	
