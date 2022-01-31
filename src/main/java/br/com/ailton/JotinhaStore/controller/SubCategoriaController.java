package br.com.ailton.JotinhaStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ailton.JotinhaStore.domain.Categoria;
import br.com.ailton.JotinhaStore.domain.SubCategoria;
import br.com.ailton.JotinhaStore.service.SubCategoriaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path ="/jotinhaStore/api-docs/subCategoria")
@Api(value = "SubCategoria", tags = {"SubCategoria"})
public class SubCategoriaController {
	
	@Autowired
	public SubCategoriaService subCategoriaService;
	
	@GetMapping(value = "/all")
	@ApiOperation(value = "Listar todos os Pedidos")
	public List<SubCategoria> findAll(){
		
		List<SubCategoria> subCategoria = subCategoriaService.findAll();
		return subCategoria;
	}
	
	@GetMapping(value = "/{id}")
	@ApiOperation(value = "Buscar Usuario por Id")
	public ResponseEntity<SubCategoria> findById(@PathVariable Long id) {
		SubCategoria subCategoria = subCategoriaService.findById(id);
		return ResponseEntity.ok().body(subCategoria);
	}
	
}
