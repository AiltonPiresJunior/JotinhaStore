package br.com.ailton.JotinhaStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ailton.JotinhaStore.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
}