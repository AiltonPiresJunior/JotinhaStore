package br.com.ailton.JotinhaStore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ailton.JotinhaStore.domain.Usuario;
import br.com.ailton.JotinhaStore.service.UsuarioService;

@RestController
@RequestMapping(value = "/api/jotinhastore")
public class UsuarioController {
	
	@Autowired
	public UsuarioService usuarioService;
	
	@GetMapping
	public List<Usuario> findAll(){
		
		List<Usuario> usuario = usuarioService.findAll();
		return usuario;
	}
	

}
