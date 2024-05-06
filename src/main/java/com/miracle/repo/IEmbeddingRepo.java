package com.miracle.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miracle.model.Embedding;

public interface IEmbeddingRepo extends JpaRepository<Embedding, Integer> {

}
