package br.com.ailton.JotinhaStore.mapper;

import org.springframework.stereotype.Component;

import br.com.ailton.JotinhaStore.domain.SubCategoria;
import br.com.ailton.JotinhaStore.dto.SubCategoriaDTO;

@Component
public class SubCategoriaMapper {
	
	public SubCategoriaDTO toDto(SubCategoria entidade) {
		if(entidade == null) {
			return null;
		}
		else {
			return SubCategoriaDTO.builder()
					.id_categoria(entidade.getCategoria())
					.nome(entidade.getNome())
					.build();
		}
	}
	
	public SubCategoria toEntidade(SubCategoriaDTO dto) {
		if(dto == null) {
			return null;
		}
		else {
			return SubCategoria.builder()
					.categoria(dto.getId_categoria())
					.nome(dto.getNome())
					.build();
		}
	}
}