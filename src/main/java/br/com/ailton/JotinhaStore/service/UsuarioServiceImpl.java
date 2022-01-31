package br.com.ailton.JotinhaStore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ailton.JotinhaStore.domain.Usuario;
import br.com.ailton.JotinhaStore.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	public UsuarioRepository usuarioRepository;
	
	public List<Usuario> findAll() {
		List<Usuario> lista = usuarioRepository.findAll();
		return lista;
	}

	public Usuario findById(Long id) {
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		return usuario.get();
	}
}