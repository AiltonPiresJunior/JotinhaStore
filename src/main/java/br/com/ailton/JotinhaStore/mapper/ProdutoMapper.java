package br.com.ailton.JotinhaStore.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.ailton.JotinhaStore.domain.Produto;
import br.com.ailton.JotinhaStore.dto.ProdutoDTO;
import br.com.ailton.JotinhaStore.service.ProdutoService;
import br.com.ailton.JotinhaStore.service.SubCategoriaService;

@Component
public class ProdutoMapper {
	
	@Autowired
	public SubCategoriaService subCategoriaService;
	
	public ProdutoDTO toDto(Produto entidade) {
		if(entidade == null) {
			return null;
		}
		else {
			return ProdutoDTO.builder()
					.id(entidade.getId())
					.nome(entidade.getNome())
					.descricao(entidade.getDescricao())
					.preco(entidade.getPreco())
					.imgUrl(entidade.getImgUrl())
					.subCategoria(entidade.getSubCategoria().getId())
					.build();
		}
	}
	
	public Produto toEntidade(ProdutoDTO dto) {
		if(dto == null) {
			return null;
		}
		else {
			return Produto.builder()
					.id(dto.getId())
					.nome(dto.getNome())
					.descricao(dto.getDescricao())
					.preco(dto.getPreco())
					.imgUrl(dto.getImgUrl())
					.subCategoria(subCategoriaService.findCategoriaById(dto.getSubCategoria()))
					.build();
		}
	}
}