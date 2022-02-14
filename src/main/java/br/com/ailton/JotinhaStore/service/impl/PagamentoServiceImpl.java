package br.com.ailton.JotinhaStore.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ailton.JotinhaStore.domain.Pagamento;
import br.com.ailton.JotinhaStore.repository.PagamentoRepository;
import br.com.ailton.JotinhaStore.service.PagamentoService;

@Service
public class PagamentoServiceImpl implements PagamentoService{

	@Autowired
	public PagamentoRepository pagamentoRepository;
	
	@Override
	public List<Pagamento> findAll() {
		
		List<Pagamento> pagamentos = pagamentoRepository.findAll();
		
		return pagamentos;
	}

	@Override
	public Pagamento findById(Long id) {

		Optional<Pagamento> pagamento = pagamentoRepository.findById(id);
		
		return pagamento.get();
	}


}