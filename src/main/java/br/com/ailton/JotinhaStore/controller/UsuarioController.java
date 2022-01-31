package br.com.ailton.JotinhaStore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ailton.JotinhaStore.domain.Usuario;
import br.com.ailton.JotinhaStore.service.UsuarioService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/jotinhaStore/api-docs")
public class UsuarioController {
	
	@Autowired
	public UsuarioService usuarioService;
	
	@GetMapping(value = "/all")
	@ApiOperation(value = "Listar todos os Usuarios")
	public List<Usuario> findAll(){
		
		List<Usuario> usuario = usuarioService.findAll();
		return usuario;
	}
	
	@GetMapping(value = "/{id}")
	@ApiOperation(value = "Buscar Usuario por Id")
	public ResponseEntity<Usuario> findById(@PathVariable Long id) {
		Usuario usuario = usuarioService.findById(id);
		return ResponseEntity.ok().body(usuario);
	}
	
	

}
