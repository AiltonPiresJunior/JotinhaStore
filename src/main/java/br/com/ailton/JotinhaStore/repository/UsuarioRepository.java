package br.com.ailton.JotinhaStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ailton.JotinhaStore.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	
}
