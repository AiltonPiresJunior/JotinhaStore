package br.com.ailton.JotinhaStore.service;

import java.util.List;

import br.com.ailton.JotinhaStore.domain.Categoria;
import br.com.ailton.JotinhaStore.dto.CategoriaDTO;

public interface CategoriaService {

	List<Categoria> findAll();

	Categoria findCategoriaById(Long id);

	CategoriaDTO cadastraCategoria(CategoriaDTO categoriaDTO);

	CategoriaDTO alteraCategoria(CategoriaDTO categoriaDTO, Long id);
}