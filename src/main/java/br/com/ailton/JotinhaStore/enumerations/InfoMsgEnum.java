package br.com.ailton.JotinhaStore.enumerations;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InfoMsgEnum {

	ARQUIVO_REMOVIDO_SUCESSO("arquivoRemovidoSucesso"),
	DELECAO_CONCLUIDA("deletadoSucesso"),
	REGISTRO_ATUALIZADO_PARA_INATIVO("registroInativo"),
	SEM_STATUS_ADMINISTRADOR("naoAdiministrador"),
	OPERACAO_CONCLUIDA("operacaoConcluida")
	;
    private String code;
    
}
