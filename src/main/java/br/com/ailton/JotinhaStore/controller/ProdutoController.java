package br.com.ailton.JotinhaStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ailton.JotinhaStore.domain.Produto;
import br.com.ailton.JotinhaStore.service.ProdutoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path ="/jotinhaStore/api-docs/produto")
@Api(value = "Produto", tags = {"Produto"})
public class ProdutoController {
	
	@Autowired
	public ProdutoService produtoService;
	
	@GetMapping(value = "/all")
	@ApiOperation(value = "Listar todos os Pedidos")
	public List<Produto> findAll(){
		
		List<Produto> produto = produtoService.findAll();
		return produto;
	}
	
	@GetMapping(value = "/{id}")
	@ApiOperation(value = "Buscar Usuario por Id")
	public ResponseEntity<Produto> findById(@PathVariable Long id) {
		Produto produto = produtoService.findById(id);
		return ResponseEntity.ok().body(produto);
	}
	
}
