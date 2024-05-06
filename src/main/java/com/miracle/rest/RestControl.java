package com.miracle.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miracle.model.Embedding;
import com.miracle.repo.IEmbeddingRepo;

@RestController
@RequestMapping("/listadoEmbeddings")
public class RestControl {

	@Autowired
	private IEmbeddingRepo repo;

	@GetMapping
	public List<Embedding> listar() {
		return repo.findAll();

	}

	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {

		repo.deleteById(id);
	}

}
