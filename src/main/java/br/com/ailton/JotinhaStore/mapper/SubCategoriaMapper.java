package br.com.ailton.JotinhaStore.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.ailton.JotinhaStore.domain.SubCategoria;
import br.com.ailton.JotinhaStore.dto.SubCategoriaDTO;
import br.com.ailton.JotinhaStore.service.CategoriaService;

@Component
public class SubCategoriaMapper {
	
	@Autowired
	public CategoriaService categoriaService;
	
	public SubCategoriaDTO toDto(SubCategoria entidade) {
		if(entidade == null) {
			return null;
		}
		else {
			return SubCategoriaDTO.builder()
					.id_categoria(entidade.getCategoria().getId())
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
					.categoria(categoriaService.findCategoriaById(dto.getId_categoria()))
					.nome(dto.getNome())
					.build();
		}
	}
}