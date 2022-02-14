package br.com.ailton.JotinhaStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ailton.JotinhaStore.domain.Pagamento;
import br.com.ailton.JotinhaStore.service.PagamentoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path ="/jotinhaStore/api-docs/pagamento")
@Api(value = "Pagamento", tags = {"Pagamento"})
public class PagamentoController {
	
	@Autowired
	public PagamentoService pagamentoService;

	@GetMapping(value = "/all")
	@ApiOperation(value = "Listar todos os pagamentos")
	public List<Pagamento> findAll(){
		
		List<Pagamento> pagamento = pagamentoService.findAll();
		return pagamento;
	}

	@GetMapping(value = "/{id}")
	@ApiOperation(value = "Buscar pagamento por Id")
	public ResponseEntity<Pagamento> findById(@PathVariable Long id) {
		Pagamento pedido = pagamentoService.findById(id);
		return ResponseEntity.ok().body(pedido);
	}
}