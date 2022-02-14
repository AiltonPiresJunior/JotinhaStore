package br.com.ailton.JotinhaStore.mapper;

import org.springframework.stereotype.Component;

import br.com.ailton.JotinhaStore.domain.Usuario;
import br.com.ailton.JotinhaStore.dto.UsuarioDTO;

@Component
public class UsuarioMapper {
	
	public UsuarioDTO toDto(Usuario entidade) {
		if(entidade == null) {
			return null;
		}
		else {
			return UsuarioDTO.builder()
					.nome(entidade.getNome())
					.email(entidade.getEmail())
					.telefone(entidade.getTelefone())
					.senha(entidade.getSenha())
					.build();
		}
	}
	
	public Usuario toEntidade(UsuarioDTO dto) {
		if(dto == null) {
			return null;
		}
		else {
			return Usuario.builder()
					.nome(dto.getNome())
					.email(dto.getEmail())
					.telefone(dto.getTelefone())
					.senha(dto.getSenha())
					.build();
		}
	}
}