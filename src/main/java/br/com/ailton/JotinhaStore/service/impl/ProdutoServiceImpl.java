package br.com.ailton.JotinhaStore.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.ailton.JotinhaStore.domain.Produto;
import br.com.ailton.JotinhaStore.dto.ProdutoDTO;
import br.com.ailton.JotinhaStore.enumerations.ErrorsEnum;
import br.com.ailton.JotinhaStore.mapper.ProdutoMapper;
import br.com.ailton.JotinhaStore.repository.ProdutoRepository;
import br.com.ailton.JotinhaStore.service.ProdutoService;
import br.com.ailton.JotinhaStore.service.SubCategoriaService;
import br.com.ailton.JotinhaStore.service.exception.BusinessException;

@Service
public class ProdutoServiceImpl implements ProdutoService{

	@Autowired
	public ProdutoRepository produtoRepository;
	
	@Autowired
	public ProdutoMapper produtoMapper;
	
	@Autowired
	public SubCategoriaService subCategoriaService;
	
	public List<Produto> findAll() {
		List<Produto> lista = produtoRepository.findAll();
		return lista;
	}

	public Produto findProdutoById(Long id) {
		return produtoRepository.findById(id)
                .orElseThrow(() -> new BusinessException(HttpStatus.NOT_FOUND, ErrorsEnum.NAO_ENCONTROU));
	}

	public ProdutoDTO cadastraProduto(ProdutoDTO produtoDTO) {
		Produto produto = produtoMapper.toEntidade(produtoDTO);
		
		produtoRepository.save(produto);
		
		return produtoMapper.toDto(produto);
	}

	public ProdutoDTO alteraProduto(ProdutoDTO produtoDTO, Long id) {
		Produto produto = findProdutoById(id);
		
		produto.setDescricao(produtoDTO.getDescricao());
		produto.setNome(produtoDTO.getNome());
		produto.setPreco(produtoDTO.getPreco());
		produto.setImgUrl(produtoDTO.getImgUrl());
		produto.setSubCategoria(subCategoriaService.findCategoriaById(produtoDTO.getSubCategoria()));
		
		produtoRepository.save(produto);
		
		return produtoMapper.toDto(produto);
	}
}