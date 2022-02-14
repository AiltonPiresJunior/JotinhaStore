package br.com.ailton.JotinhaStore.dto;

import br.com.ailton.JotinhaStore.domain.Categoria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SubCategoriaDTO {
	
	private String nome;
	private Categoria id_categoria;

}
