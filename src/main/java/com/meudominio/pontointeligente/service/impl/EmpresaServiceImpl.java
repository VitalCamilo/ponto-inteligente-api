package com.meudominio.pontointeligente.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meudominio.pontointeligente.entities.Empresa;
import com.meudominio.pontointeligente.repositories.EmpresaRepository;
import com.meudominio.pontointeligente.services.EmpresaServices;

@Service
public class EmpresaServiceImpl implements EmpresaServices {

	private static final Logger log = LoggerFactory.getLogger(EmpresaServiceImpl.class);
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Override
	public Optional<Empresa> buscarPorCnpj(String cnpj){
		log.info("Buscando empresa para o CNPJ {}",cnpj);
		return Optional.ofNullable(this.empresaRepository.findByCnpj(cnpj));
	}
	
	
	@Override
	public Empresa persistir(Empresa empresa) {
		log.info("Persistindo a empresa {}",empresa);
		return this.empresaRepository.save(empresa);
	}
	
	
}
