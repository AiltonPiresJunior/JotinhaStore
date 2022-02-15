package br.com.ailton.JotinhaStore.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ailton.JotinhaStore.domain.Categoria;
import br.com.ailton.JotinhaStore.dto.CategoriaDTO;
import br.com.ailton.JotinhaStore.mapper.CategoriaMapper;
import br.com.ailton.JotinhaStore.repository.CategoriaRepository;
import br.com.ailton.JotinhaStore.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	public CategoriaRepository categoriaRepository;
	
	@Autowired
	public CategoriaMapper categoriaMapper;
	
	public List<Categoria> findAll() {
		List<Categoria> lista = categoriaRepository.findAll();
		return lista;
	}

	public Categoria findById(Long id) {
		Optional<Categoria> categoria = categoriaRepository.findById(id);
		return categoria.get();
	}

	public CategoriaDTO cadastraCategoria(CategoriaDTO categoriaDTO) {
		Categoria categoria = categoriaMapper.toEntidade(categoriaDTO);
		
		categoriaRepository.save(categoria);
		
		return categoriaMapper.toDto(categoria);
	}
}