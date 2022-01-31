package br.com.ailton.JotinhaStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ailton.JotinhaStore.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	
}
