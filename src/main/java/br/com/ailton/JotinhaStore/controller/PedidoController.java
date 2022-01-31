package br.com.ailton.JotinhaStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ailton.JotinhaStore.domain.Pedido;
import br.com.ailton.JotinhaStore.service.PedidoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path ="/jotinhaStore/api-docs/pedido")
@Api(value = "Pedido", tags = {"Pedido"})
public class PedidoController {
	
	@Autowired
	public PedidoService pedidoService;
	
	@GetMapping(value = "/all")
	@ApiOperation(value = "Listar todos os Pedidos")
	public List<Pedido> findAll(){
		
		List<Pedido> pedido = pedidoService.findAll();
		return pedido;
	}
	
	@GetMapping(value = "/{id}")
	@ApiOperation(value = "Buscar Usuario por Id")
	public ResponseEntity<Pedido> findById(@PathVariable Long id) {
		Pedido pedido = pedidoService.findById(id);
		return ResponseEntity.ok().body(pedido);
	}
	
}
