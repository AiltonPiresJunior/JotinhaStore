package br.com.ailton.JotinhaStore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
	
	private String nome;
	private String email;
	private String telefone;
	private String senha;

}
