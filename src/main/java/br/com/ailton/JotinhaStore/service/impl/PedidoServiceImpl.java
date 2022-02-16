package br.com.ailton.JotinhaStore.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.ailton.JotinhaStore.domain.Pedido;
import br.com.ailton.JotinhaStore.enumerations.ErrorsEnum;
import br.com.ailton.JotinhaStore.repository.PedidoRepository;
import br.com.ailton.JotinhaStore.service.PedidoService;
import br.com.ailton.JotinhaStore.service.exception.BusinessException;

@Service
public class PedidoServiceImpl implements PedidoService{

	@Autowired
	public PedidoRepository pedidoRepository;
	
	public List<Pedido> findAll() {
		List<Pedido> lista = pedidoRepository.findAll();
		return lista;
	}

	public Pedido findPedidoById(Long id) {
		return pedidoRepository.findById(id)
                .orElseThrow(() -> new BusinessException(HttpStatus.NOT_FOUND, ErrorsEnum.NAO_ENCONTROU));
	}
}