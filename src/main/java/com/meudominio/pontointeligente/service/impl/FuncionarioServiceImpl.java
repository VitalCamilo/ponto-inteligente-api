package com.meudominio.pontointeligente.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meudominio.pontointeligente.entities.Funcionario;
import com.meudominio.pontointeligente.repositories.FuncionarioRepository;
import com.meudominio.pontointeligente.services.FuncionarioServices;

@Service
public class FuncionarioServiceImpl implements FuncionarioServices {

	
	private static final Logger log = LoggerFactory.getLogger(FuncionarioServiceImpl.class);
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Override
	public Funcionario persistir(Funcionario funcionario) {
		log.info("Persistindo o funcionario {}", funcionario);
		return this.funcionarioRepository.save(funcionario);
	}
	
	@Override
	public Optional<Funcionario> buscarPorCpf(String cpf){
		log.info("buscando funcionario pelo cpf {}", cpf);
		return Optional.ofNullable(this.funcionarioRepository.findByCpf(cpf));
	}
	
	@Override
	public Optional<Funcionario> buscarPorEmail(String email){
		log.info("buscando funcionario pelo email {}", email);
		return Optional.ofNullable(this.funcionarioRepository.findByEmail(email));
	}
	
	
}
