package br.com.ailton.JotinhaStore.service;

import java.util.List;

import br.com.ailton.JotinhaStore.domain.SubCategoria;

public interface SubCategoriaService {

	List<SubCategoria> findAll();

	SubCategoria findById(Long id);
}