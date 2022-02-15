package br.com.ailton.JotinhaStore.service;

import java.util.List;

import br.com.ailton.JotinhaStore.domain.Produto;
import br.com.ailton.JotinhaStore.dto.ProdutoDTO;

public interface ProdutoService {

	List<Produto> findAll();

	Produto findProdutoById(Long id);

	ProdutoDTO cadastraProduto(ProdutoDTO produtoDTO);
}