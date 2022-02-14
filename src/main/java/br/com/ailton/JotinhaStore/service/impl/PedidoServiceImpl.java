package br.com.ailton.JotinhaStore.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ailton.JotinhaStore.domain.Pedido;
import br.com.ailton.JotinhaStore.repository.PedidoRepository;
import br.com.ailton.JotinhaStore.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService{

	@Autowired
	public PedidoRepository pedidoRepository;
	
	public List<Pedido> findAll() {
		List<Pedido> lista = pedidoRepository.findAll();
		return lista;
	}

	public Pedido findById(Long id) {
		Optional<Pedido> pedido = pedidoRepository.findById(id);
		return pedido.get();
	}
}