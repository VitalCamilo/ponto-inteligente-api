package com.meudominio.pontointeligente.services;

import java.util.Optional;

import com.meudominio.pontointeligente.entities.Empresa;

public interface EmpresaServices {

	
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	Empresa persistir(Empresa empresa);
	
	
}
