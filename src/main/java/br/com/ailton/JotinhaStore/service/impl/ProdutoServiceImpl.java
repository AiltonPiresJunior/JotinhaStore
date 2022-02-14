package br.com.ailton.JotinhaStore.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ailton.JotinhaStore.domain.Produto;
import br.com.ailton.JotinhaStore.repository.ProdutoRepository;
import br.com.ailton.JotinhaStore.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService{

	@Autowired
	public ProdutoRepository produtoRepository;
	
	public List<Produto> findAll() {
		List<Produto> lista = produtoRepository.findAll();
		return lista;
	}

	public Produto findById(Long id) {
		Optional<Produto> produto = produtoRepository.findById(id);
		return produto.get();
	}
}