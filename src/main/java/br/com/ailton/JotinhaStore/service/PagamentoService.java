package br.com.ailton.JotinhaStore.service;

import java.util.List;

import br.com.ailton.JotinhaStore.domain.Pagamento;
import br.com.ailton.JotinhaStore.dto.PagamentoDTO;

public interface PagamentoService {

	List<PagamentoDTO> findAll();

	PagamentoDTO findPagamentoById(Long id);

	Pagamento cadastraPagamento(PagamentoDTO pagamentoDTO);

}