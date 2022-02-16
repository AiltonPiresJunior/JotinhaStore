package br.com.ailton.JotinhaStore.dto;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PagamentoDTO {
	
	private Long pagamento_id;
	private Instant momento;
	private Long pedido;

}
