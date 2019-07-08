package com.meudominio.pontointeligente.repositories;



import java.awt.print.Pageable;
import java.util.List;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.meudominio.pontointeligente.entities.Lancamento;

@Transactional(readOnly = true)
@NamedQueries({
		@NamedQuery(name = "LancamentoRepository.findByFuncionarioId",
					query = "SELECT lanc FROM Lancamento lanc WHERE lanc.funcionario.id = :funcionarioId")})
public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

	
	List<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionarioid);
	
	Page<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId, Pageable page);
	
}
