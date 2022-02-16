package br.com.ailton.JotinhaStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ailton.JotinhaStore.domain.Pagamento;
import br.com.ailton.JotinhaStore.dto.PagamentoDTO;
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
	@ApiOperation(value = "Lista todos os pagamentos")
	public List<PagamentoDTO> findAll(){
		
		List<PagamentoDTO> pagamento = pagamentoService.findAll();
		return pagamento;
	}

	@GetMapping(value = "/{id}")
	@ApiOperation(value = "Busca pagamento por Id")
	public ResponseEntity<PagamentoDTO> findById(@PathVariable Long id) {
		PagamentoDTO pedido = pagamentoService.findPagamentoById(id);
		return ResponseEntity.ok().body(pedido);
	}
	
	@PostMapping
	@ApiOperation(value = "Cadastra pagamento")
	public ResponseEntity<PagamentoDTO> cadastrarPagamento(@RequestBody PagamentoDTO pagamentoDTO){
		return ResponseEntity.ok().body(pagamentoService.cadastraPagamento(pagamentoDTO));
	}
	
	@PutMapping(value = "/{id}")
	@ApiOperation(value = "Altera pagamento por id")
	public ResponseEntity<PagamentoDTO> alterarPagamento(@RequestBody PagamentoDTO pagamentoDTO, Long id){
		return ResponseEntity.ok().body(pagamentoService.alteraPagamento(pagamentoDTO, id));
	}
}