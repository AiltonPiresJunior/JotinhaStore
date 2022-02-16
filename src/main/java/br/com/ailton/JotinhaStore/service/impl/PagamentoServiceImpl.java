package br.com.ailton.JotinhaStore.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.ailton.JotinhaStore.domain.Pagamento;
import br.com.ailton.JotinhaStore.dto.PagamentoDTO;
import br.com.ailton.JotinhaStore.enumerations.ErrorsEnum;
import br.com.ailton.JotinhaStore.mapper.PagamentoMapper;
import br.com.ailton.JotinhaStore.repository.PagamentoRepository;
import br.com.ailton.JotinhaStore.service.PagamentoService;
import br.com.ailton.JotinhaStore.service.exception.BusinessException;

@Service
public class PagamentoServiceImpl implements PagamentoService{

	@Autowired
	public PagamentoRepository pagamentoRepository;
	
	@Autowired
	public PagamentoMapper pagamentoMapper;
	
	public List<PagamentoDTO> findAll() {
		
		List<Pagamento> pagamentos = pagamentoRepository.findAll();
		List<PagamentoDTO> pagamentoDTO = new ArrayList<PagamentoDTO>();
		for(Pagamento pagamento : pagamentos) {
			pagamentoDTO.add(pagamentoMapper.toDto(pagamento));
		}
		
		return pagamentoDTO;
	}

	public PagamentoDTO findPagamentoById(Long id) {
		return pagamentoMapper.toDto(pagamentoRepository.findById(id)
                .orElseThrow(() -> new BusinessException(HttpStatus.NOT_FOUND, ErrorsEnum.NAO_ENCONTROU)));
	}

	public Pagamento cadastraPagamento(PagamentoDTO pagamentoDTO) {
		Pagamento pagamento = pagamentoMapper.toEntidade(pagamentoDTO);
		
		pagamentoRepository.save(pagamento);
		
		return pagamento;
	}

	
}