package br.com.ailton.JotinhaStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ailton.JotinhaStore.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
	
}