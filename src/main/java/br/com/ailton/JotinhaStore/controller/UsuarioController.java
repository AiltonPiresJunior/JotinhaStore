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

import br.com.ailton.JotinhaStore.domain.Usuario;
import br.com.ailton.JotinhaStore.dto.UsuarioDTO;
import br.com.ailton.JotinhaStore.service.UsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/jotinhaStore/api-docs/usuario")
@Api(value = "Usuario", tags = { "Usuario"})
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
	
	@PostMapping
	@ApiOperation(value = "Cadastrar novo Usuario")
	public ResponseEntity<UsuarioDTO> cadastrarUsuario(@RequestBody @Valid UsuarioDTO usuarioDTO){
		
		return ResponseEntity.ok().body(usuarioService.cadastraUsuario(usuarioDTO));
	}
	
	@PutMapping(value = "/{id}")
	@ApiOperation(value = "Alterar um Usuario por id")
	public ResponseEntity<UsuarioDTO> alterarUsuario(Long id, @RequestBody @Valid UsuarioDTO usuarioDTO){
		
		return ResponseEntity.ok().body(usuarioService.alterarUsuario(id, usuarioDTO));
	}
	
	@DeleteMapping(value = "/{id}")
	@ApiOperation(value = "Deleta um Usuario por id")
	public ResponseEntity<Usuario> deletaUsuario(Long id){
		return ResponseEntity.ok().body(usuarioService.deletaUsuario(id));
	}
	
}