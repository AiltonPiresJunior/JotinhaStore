package br.com.ailton.JotinhaStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ailton.JotinhaStore.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	
}
