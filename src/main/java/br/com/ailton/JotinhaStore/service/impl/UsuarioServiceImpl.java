package br.com.ailton.JotinhaStore.service.impl;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.ailton.JotinhaStore.domain.Usuario;
import br.com.ailton.JotinhaStore.dto.UsuarioDTO;
import br.com.ailton.JotinhaStore.enumerations.ErrorsEnum;
import br.com.ailton.JotinhaStore.mapper.UsuarioMapper;
import br.com.ailton.JotinhaStore.repository.UsuarioRepository;
import br.com.ailton.JotinhaStore.service.UsuarioService;
import br.com.ailton.JotinhaStore.service.exception.BusinessException;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	public UsuarioRepository usuarioRepository;
	
	@Autowired
	public UsuarioMapper usuarioMapper;
	
	public List<Usuario> findAll() {
		List<Usuario> lista = usuarioRepository.findAll();
		return lista;
	}

	public Usuario findById(Long id) {
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		return findUsuarioById(id);
	}

	public UsuarioDTO cadastraUsuario(UsuarioDTO usuarioDTO) {
		
		Usuario usuario = usuarioMapper.toEntidade(usuarioDTO);
		
		usuarioRepository.save(usuario);
				
		return usuarioMapper.toDto(usuario);
	}

	public UsuarioDTO alterarUsuario(Long id, @Valid UsuarioDTO usuarioDTO) {

		Usuario usuario = findUsuarioById(id);
		
		usuario.setNome(usuarioDTO.getNome());
		usuario.setEmail(usuarioDTO.getEmail());
		usuario.setTelefone(usuarioDTO.getTelefone());
		usuario.setSenha(usuarioDTO.getSenha());
		
		usuarioRepository.save(usuario);
		
		return usuarioMapper.toDto(usuario);
	}

	private Usuario findUsuarioById(Long id) {
		
		return usuarioRepository.findById(id)
                .orElseThrow(() -> new BusinessException(HttpStatus.NOT_FOUND, ErrorsEnum.NAO_ENCONTROU));
	}

	public Usuario deletaUsuario(Long id) {
		
		Usuario usuario = findUsuarioById(id);
		
		usuarioRepository.delete(usuario);
		
		return usuario;
	}
}