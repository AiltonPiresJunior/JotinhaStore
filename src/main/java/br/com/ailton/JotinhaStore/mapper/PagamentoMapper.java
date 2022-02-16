package br.com.ailton.JotinhaStore.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.ailton.JotinhaStore.domain.Pagamento;
import br.com.ailton.JotinhaStore.dto.PagamentoDTO;
import br.com.ailton.JotinhaStore.service.PedidoService;

@Component
public class PagamentoMapper {
	
	@Autowired
	public PedidoService pedidoService;
	
	public PagamentoDTO toDto(Pagamento entidade) {
		if(entidade == null) {
			return null;
		}
		else {
			return PagamentoDTO.builder()
					.pagamento_id(entidade.getPagamento_id())
					.momento(entidade.getMomento())
					.pedido(entidade.getPedido().getId())
					.build();
		}
	}
	
	public Pagamento toEntidade(PagamentoDTO dto) {
		if(dto == null) {
			return null;
		}
		else {
			return Pagamento.builder()
					.pagamento_id(dto.getPagamento_id())
					.momento(dto.getMomento())
					.pedido(pedidoService.findPedidoById(dto.getPedido()))
					.build();
		}
	}
}