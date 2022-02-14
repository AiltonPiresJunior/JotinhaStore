package br.com.ailton.JotinhaStore.service;

import java.util.List;

import javax.validation.Valid;

import br.com.ailton.JotinhaStore.domain.SubCategoria;
import br.com.ailton.JotinhaStore.dto.SubCategoriaDTO;

public interface SubCategoriaService {

	List<SubCategoria> findAll();

	SubCategoria findById(Long id);

	SubCategoriaDTO cadastraSubCategoria(SubCategoriaDTO subCategoriaDTO);

	SubCategoriaDTO alteraSubCategoria(Long id, @Valid SubCategoriaDTO subCategoriaDTO);

	SubCategoria deletaSubCategoria(Long id);
}