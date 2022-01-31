package br.com.ailton.JotinhaStore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ailton.JotinhaStore.domain.SubCategoria;
import br.com.ailton.JotinhaStore.repository.SubCategoriaRepository;

@Service
public class SubCategoriaServiceImpl implements SubCategoriaService{

	@Autowired
	public SubCategoriaRepository subCategoriaRepository;
	
	public List<SubCategoria> findAll() {
		List<SubCategoria> lista = subCategoriaRepository.findAll();
		return lista;
	}

	public SubCategoria findById(Long id) {
		Optional<SubCategoria> subCategoria = subCategoriaRepository.findById(id);
		return subCategoria.get();
	}
}