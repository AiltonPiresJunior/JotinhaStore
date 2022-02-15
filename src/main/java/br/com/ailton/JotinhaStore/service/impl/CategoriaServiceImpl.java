package br.com.ailton.JotinhaStore.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.ailton.JotinhaStore.domain.Categoria;
import br.com.ailton.JotinhaStore.dto.CategoriaDTO;
import br.com.ailton.JotinhaStore.enumerations.ErrorsEnum;
import br.com.ailton.JotinhaStore.mapper.CategoriaMapper;
import br.com.ailton.JotinhaStore.repository.CategoriaRepository;
import br.com.ailton.JotinhaStore.service.CategoriaService;
import br.com.ailton.JotinhaStore.service.exception.BusinessException;

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

	public Categoria findCategoriaById(Long id) {
		return categoriaRepository.findById(id)
                .orElseThrow(() -> new BusinessException(HttpStatus.NOT_FOUND, ErrorsEnum.NAO_ENCONTROU));
	}

	public CategoriaDTO cadastraCategoria(CategoriaDTO categoriaDTO) {
		Categoria categoria = categoriaMapper.toEntidade(categoriaDTO);
		
		categoriaRepository.save(categoria);
		
		return categoriaMapper.toDto(categoria);
	}

	public CategoriaDTO alteraCategoria(CategoriaDTO categoriaDTO, Long id) {
		Categoria categoria = findCategoriaById(id);
		
		categoria.setNome(categoriaDTO.getNome());
		categoriaRepository.save(categoria);
		
		return categoriaMapper.toDto(categoria);
	}

	public Categoria deletaCategoria(Long id) {
		Categoria categoria = findCategoriaById(id);
		
		categoriaRepository.delete(categoria);
				
		return categoria;
	}
}