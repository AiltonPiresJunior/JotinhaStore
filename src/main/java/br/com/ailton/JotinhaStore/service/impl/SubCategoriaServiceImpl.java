package br.com.ailton.JotinhaStore.service.impl;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.ailton.JotinhaStore.domain.Categoria;
import br.com.ailton.JotinhaStore.domain.SubCategoria;
import br.com.ailton.JotinhaStore.dto.SubCategoriaDTO;
import br.com.ailton.JotinhaStore.enumerations.ErrorsEnum;
import br.com.ailton.JotinhaStore.mapper.SubCategoriaMapper;
import br.com.ailton.JotinhaStore.repository.SubCategoriaRepository;
import br.com.ailton.JotinhaStore.service.CategoriaService;
import br.com.ailton.JotinhaStore.service.SubCategoriaService;

@Service
public class SubCategoriaServiceImpl implements SubCategoriaService{

	@Autowired
	public SubCategoriaRepository subCategoriaRepository;
	
	@Autowired
	SubCategoriaMapper subCategoriaMapper;
	
	@Autowired
	public CategoriaService categoriaService;
	
	public List<SubCategoria> findAll() {
		List<SubCategoria> lista = subCategoriaRepository.findAll();
		return lista;
	}

	public SubCategoriaDTO cadastraSubCategoria(@Valid SubCategoriaDTO subCategoriaDTO) {
		SubCategoria categoria = subCategoriaMapper.toEntidade(subCategoriaDTO);
		
		subCategoriaRepository.save(categoria);
		
		return subCategoriaMapper.toDto(categoria);
	}

	public SubCategoriaDTO alteraSubCategoria(Long id, @Valid SubCategoriaDTO subCategoriaDTO ) {

		SubCategoria subCategoria = findCategoriaById(id);
		
		subCategoria.setCategoria(categoriaService.findCategoriaById(subCategoriaDTO.getId_categoria()));
		subCategoria.setNome(subCategoriaDTO.getNome());
		
		subCategoriaRepository.save(subCategoria);

		return subCategoriaMapper.toDto(subCategoria);
	}
	
	public SubCategoria deletaSubCategoria(Long id) {
		
		SubCategoria subCategoria = findCategoriaById(id);
		
		subCategoriaRepository.delete(subCategoria);
		
		return subCategoria;
	}
	
    public SubCategoria findCategoriaById(Long id) {
        return subCategoriaRepository.findById(id)
                .orElseThrow();
    }
}