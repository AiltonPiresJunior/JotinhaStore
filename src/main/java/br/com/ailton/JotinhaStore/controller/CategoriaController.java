package br.com.ailton.JotinhaStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ailton.JotinhaStore.domain.Categoria;
import br.com.ailton.JotinhaStore.domain.Pedido;
import br.com.ailton.JotinhaStore.service.CategoriaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path ="/jotinhaStore/api-docs/categoria")
@Api(value = "Categoria", tags = {"Categoria"})
public class CategoriaController {
	
	@Autowired
	public CategoriaService categoriaService;
	
	@GetMapping(value = "/all")
	@ApiOperation(value = "Listar todos os Pedidos")
	public List<Categoria> findAll(){
		
		List<Categoria> categoria = categoriaService.findAll();
		return categoria;
	}
	
	@GetMapping(value = "/{id}")
	@ApiOperation(value = "Buscar Usuario por Id")
	public ResponseEntity<Categoria> findById(@PathVariable Long id) {
		Categoria categoria = categoriaService.findById(id);
		return ResponseEntity.ok().body(categoria);
	}
	
}
