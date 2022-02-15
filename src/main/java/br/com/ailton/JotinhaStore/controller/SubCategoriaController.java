package br.com.ailton.JotinhaStore.controller;

import java.util.List;

import javax.validation.Valid;

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

import br.com.ailton.JotinhaStore.domain.SubCategoria;
import br.com.ailton.JotinhaStore.dto.SubCategoriaDTO;
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
	@ApiOperation(value = "Listar todas as SubCategorias")
	public List<SubCategoria> findAll(){
		List<SubCategoria> subCategoria = subCategoriaService.findAll();
		
		return subCategoria;
	}
	
	@GetMapping(value = "/{id}")
	@ApiOperation(value = "Buscar SubCategoria por Id")
	public ResponseEntity<SubCategoria> findById(@PathVariable Long id) {
		SubCategoria subCategoria = subCategoriaService.findCategoriaById(id);
		return ResponseEntity.ok().body(subCategoria);
	}
	
	@PostMapping
	@ApiOperation(value = "Cadastra uma SubCategoria")
	public ResponseEntity<SubCategoriaDTO> cadastraSubCategoria(@RequestBody @Valid SubCategoriaDTO subCategoriaDTO) {
		subCategoriaDTO = subCategoriaService.cadastraSubCategoria(subCategoriaDTO);
		
		return ResponseEntity.ok().body(subCategoriaDTO);
	}
	
	@PutMapping(value = "/{id}")
	@ApiOperation(value = "Altera SubCategoria por Id")
	public ResponseEntity<SubCategoriaDTO> alteraSubCategoria(Long id, @RequestBody @Valid SubCategoriaDTO subCategoriaDTO) {
		subCategoriaDTO = subCategoriaService.alteraSubCategoria(id, subCategoriaDTO);
		
		return ResponseEntity.ok().body(subCategoriaDTO);
	}
	
	@DeleteMapping(value = "/{id}")
	@ApiOperation(value = "Deleta uma SubCategoria")
	public ResponseEntity<SubCategoria> deletaSubCategoria(Long id){
		return ResponseEntity.ok().body(subCategoriaService.deletaSubCategoria(id));
	}
}
