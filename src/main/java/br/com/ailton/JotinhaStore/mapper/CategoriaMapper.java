package br.com.ailton.JotinhaStore.mapper;

import org.springframework.stereotype.Component;

import br.com.ailton.JotinhaStore.domain.Categoria;
import br.com.ailton.JotinhaStore.dto.CategoriaDTO;

@Component
public class CategoriaMapper {
	
	public CategoriaDTO toDto(Categoria entidade) {
		if(entidade == null) {
			return null;
		}
		else {
			return CategoriaDTO.builder()
					.id(entidade.getId())
					.nome(entidade.getNome())
					.build();
		}
	}
	
	public Categoria toEntidade(CategoriaDTO dto) {
		if(dto == null) {
			return null;
		}
		else {
			return Categoria.builder()
					.id(dto.getId())
					.nome(dto.getNome())
					.build();
		}
	}
}