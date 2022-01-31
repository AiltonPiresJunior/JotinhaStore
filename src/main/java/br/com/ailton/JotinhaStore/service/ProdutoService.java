package br.com.ailton.JotinhaStore.service;

import java.util.List;

import br.com.ailton.JotinhaStore.domain.Produto;

public interface ProdutoService {

	List<Produto> findAll();

	Produto findById(Long id);
}