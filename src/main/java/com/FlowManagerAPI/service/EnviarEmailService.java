package com.FlowManagerAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.FlowManagerAPI.config.MailConfig;

import lombok.extern.slf4j.Slf4j;

@Service
public class EnviarEmailService {
    
    private final JavaMailSender javaMailSender;

	@Autowired
    public EnviarEmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }
	public void EnviarEmail(String para, String titulo, String conteudo) {
		
		SimpleMailMessage  mensagem = new SimpleMailMessage();
        mensagem.setTo(para);

        mensagem.setSubject(titulo);
        mensagem.setText(conteudo);
        javaMailSender.send(mensagem);
        
    }	
}
