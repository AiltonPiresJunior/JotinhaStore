package br.com.ailton.JotinhaStore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ailton.JotinhaStore.domain.Categoria;
import br.com.ailton.JotinhaStore.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	public CategoriaRepository categoriaRepository;
	
	public List<Categoria> findAll() {
		List<Categoria> lista = categoriaRepository.findAll();
		return lista;
	}

	public Categoria findById(Long id) {
		Optional<Categoria> categoria = categoriaRepository.findById(id);
		return categoria.get();
	}
}