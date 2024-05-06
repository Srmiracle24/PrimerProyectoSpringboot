package com.miracle.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miracle.model.Embedding;
import com.miracle.repo.IEmbeddingRepo;

@RestController
@RequestMapping("/rest")

public class EmbeddingController {

	@Autowired
	private IEmbeddingRepo repo;

	@PostMapping
	public void insertar(@RequestBody Embedding emb) {

		repo.save(emb);

	}

	@PutMapping
	public void modificar(@RequestBody Embedding emb) {

		repo.save(emb);

	}

}
