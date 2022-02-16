package br.com.ailton.JotinhaStore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDTO {
	
	private Long id;
	private String nome;
	private String descricao;
	private Double preco;
	private String imgUrl;
	private Long subCategoria;

}
