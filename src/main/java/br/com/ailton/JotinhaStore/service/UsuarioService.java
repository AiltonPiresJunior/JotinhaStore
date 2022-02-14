package br.com.ailton.JotinhaStore.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import br.com.ailton.JotinhaStore.domain.Usuario;
import br.com.ailton.JotinhaStore.dto.UsuarioDTO;

public interface UsuarioService {

	List<Usuario> findAll();

	Usuario findById(Long id);

	UsuarioDTO cadastraUsuario(UsuarioDTO usuarioDTO);

	UsuarioDTO alterarUsuario(Long id, @Valid UsuarioDTO usuarioDTO);

	Usuario deletaUsuario(Long id);
	
}