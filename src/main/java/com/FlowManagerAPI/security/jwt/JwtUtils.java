package com.FlowManagerAPI.security.jwt;

import java.nio.charset.MalformedInputException;
import java.security.Key;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.FlowManagerAPI.service.impl.UserDetailsImpl;

import io.jsonwebtoken.JwtParserBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;



@Component
public class JwtUtils {
	
	private String senhaJwt;
	
	private Date tempoExpiracaoJwt  =new Date(30000);
	
  	
	public String generateTokenFronUserDetailsImpl(UserDetailsImpl userDetails) {
		
	return Jwts.builder().setSubject(userDetails.getUsername())
			.setIssuedAt(new Date())
			.setExpiration(tempoExpiracaoJwt)
			.signWith(getSignInKey(), SignatureAlgorithm.HS512).compact()
			;
	}
	
	public String getUsernameToken(String token) {
		return ((JwtParserBuilder) Jwts.parser().setSigningKey(getSignInKey())).build()
				.parseClaimsJws(token).getBody().getSubject();
	}
	
	public Key getSignInKey() {
		SecretKey Key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(senhaJwt));
		return Key;
	}
	
	public boolean validateJwtToken(String authToken) {
		   try {
	            Jwts.parserBuilder().setSigningKey(getSignInKey()).build().parseClaimsJws(authToken);
	            return true;
	        } catch (MalformedJwtException e) {
	            System.out.print(" " + e.getMessage());
	            return false;
	        } catch (Exception e) {
	            System.out.print(" " + e.getMessage());
	            return false;
	        }
	    
	}
}
