package com.meudominio.pontointeligente.api;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.meudominio.pontointeligente.entities.Empresa;
import com.meudominio.pontointeligente.service.impl.EmpresaServiceImpl;

@SpringBootApplication
public class PontoInteligenteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PontoInteligenteApplication.class, args);
		
		
//		Empresa empresa = new Empresa();
//		empresa.setId(1l);
//		empresa.setCnpj("123456");
//		empresa.setRazaoSocial("Teste de Empresa");
//		empresa.setDataCriacao(new Date());
//		empresa.setDataAtualizacao(new Date());
//		
//		
//		EmpresaServiceImpl empresaImpl = new EmpresaServiceImpl();
//		empresaImpl.persistir(empresa);
		
	}

}
