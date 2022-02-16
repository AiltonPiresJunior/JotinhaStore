package br.com.ailton.JotinhaStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ailton.JotinhaStore.domain.Produto;
import br.com.ailton.JotinhaStore.dto.ProdutoDTO;
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
	@ApiOperation(value = "Lista todos os Produtos")
	public List<Produto> findAll(){
		
		List<Produto> produto = produtoService.findAll();
		return produto;
	}
	
	@GetMapping(value = "/{id}")
	@ApiOperation(value = "Busca um Produto por Id")
	public ResponseEntity<Produto> findById(@PathVariable Long id) {
		Produto produto = produtoService.findProdutoById(id);
		return ResponseEntity.ok().body(produto);
	}
	
	@PostMapping
	@ApiOperation(value = "Cadastra um Produto")
	public ResponseEntity<ProdutoDTO> cadastraProduto(@RequestBody ProdutoDTO produtoDTO){
		return ResponseEntity.ok().body(produtoService.cadastraProduto(produtoDTO));
	}
	
	@PutMapping(value = "/{id}")
	@ApiOperation(value = "Altera um produto por id")
	public ResponseEntity<ProdutoDTO> alteraProduto(@RequestBody ProdutoDTO produtoDTO, Long id){
		return ResponseEntity.ok().body(produtoService.alteraProduto(produtoDTO, id));
	}
	
	@DeleteMapping(value = "/{id}")
	@ApiOperation(value = "Deleta um produto por id")
	public ResponseEntity<ProdutoDTO> deletaProduto(Long id){
		
		return ResponseEntity.ok().body(produtoService.deletaProduto(id));
	}
}
