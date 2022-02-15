package br.com.ailton.JotinhaStore.service;

import java.util.List;

import br.com.ailton.JotinhaStore.domain.Categoria;
import br.com.ailton.JotinhaStore.dto.CategoriaDTO;

public interface CategoriaService {

	List<Categoria> findAll();

	Categoria findById(Long id);

	CategoriaDTO cadastraCategoria(CategoriaDTO categoriaDTO);
}