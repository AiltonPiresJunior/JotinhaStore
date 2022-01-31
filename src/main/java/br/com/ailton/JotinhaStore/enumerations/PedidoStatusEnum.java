package br.com.ailton.JotinhaStore.enumerations;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PedidoStatusEnum {
	
	Pago("0"),
	Aguardadndo_Pagamento("1"),
	Entregue("2"),
	Enviado("3"),
	Cancelado("4");
	
	private String code;
	
}
