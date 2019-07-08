package com.meudominio.pontointeligente.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class PasswordUtils {
	
	private static final Logger log = LoggerFactory.getLogger(PasswordUtils.class);
	
	
	public PasswordUtils() {
		
	}
	
	public static String gerarBCrypt(String senha) {
		if(senha == null) {
			return senha;
		}
		
		log.info("Gerar senha com BCrypt");
		BCryptPasswordEncoder BcryptEncoder = new BCryptPasswordEncoder();
		return BcryptEncoder.encode(senha);
		
	}
	
	

}
