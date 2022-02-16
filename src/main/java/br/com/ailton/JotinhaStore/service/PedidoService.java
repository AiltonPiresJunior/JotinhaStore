package br.com.ailton.JotinhaStore.service;

import java.util.List;

import br.com.ailton.JotinhaStore.domain.Pedido;

public interface PedidoService {

	List<Pedido> findAll();

	Pedido findPedidoById(Long id);
}