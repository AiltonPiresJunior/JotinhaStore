package br.com.ailton.JotinhaStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ailton.JotinhaStore.domain.Categoria;
import br.com.ailton.JotinhaStore.dto.CategoriaDTO;
import br.com.ailton.JotinhaStore.mapper.CategoriaMapper;
import br.com.ailton.JotinhaStore.mapper.UsuarioMapper;
import br.com.ailton.JotinhaStore.service.CategoriaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path ="/jotinhaStore/api-docs/categoria")
@Api(value = "Categoria", tags = {"Categoria"})
public class CategoriaController {
	
	@Autowired
	public CategoriaService categoriaService;
	
	@Autowired
	public CategoriaMapper categoriaMapper;
	
	@GetMapping(value = "/all")
	@ApiOperation(value = "Listar todos as Categorias")
	public List<Categoria> findAll(){
		
		List<Categoria> categoria = categoriaService.findAll();
		return categoria;
	}
	
	@GetMapping(value = "/{id}")
	@ApiOperation(value = "Buscar Categoria por Id")
	public ResponseEntity<Categoria> findById(@PathVariable Long id) {
		Categoria categoria = categoriaService.findById(id);
		return ResponseEntity.ok().body(categoria);
	}
	
	@PostMapping
	@ApiOperation(value = "Cadastrar Categoria")
	public ResponseEntity<CategoriaDTO> cadastra(@RequestBody CategoriaDTO categoriaDTO) {			
		return ResponseEntity.ok().body(categoriaService.cadastraCategoria(categoriaDTO));
	}
}