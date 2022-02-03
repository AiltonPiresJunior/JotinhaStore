package br.com.ailton.JotinhaStore.service;

import java.util.List;

import br.com.ailton.JotinhaStore.domain.Pagamento;
import br.com.ailton.JotinhaStore.domain.Pedido;

public interface PagamentoService {

	List<Pagamento> findAll();

	Pagamento findById(Long id);

}