package com.meudominio.pontointeligente.services;

import java.util.Optional;

import com.meudominio.pontointeligente.entities.Funcionario;

public interface FuncionarioServices {

	Funcionario persistir(Funcionario funcionario);
	
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	Optional<Funcionario> buscarPorEmail(String email);
	
//	Optional<Funcionario> buscarPorId(Long id);
	
	
}
