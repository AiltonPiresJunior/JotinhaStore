package br.com.ailton.JotinhaStore.service;

import java.util.List;
import java.util.Optional;

import br.com.ailton.JotinhaStore.domain.Usuario;

public interface UsuarioService {

	List<Usuario> findAll();

	Usuario findById(Long id);
	
	

}
