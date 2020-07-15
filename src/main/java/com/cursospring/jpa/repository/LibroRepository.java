package com.cursospring.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cursospring.jpa.model.Libro;

@Repository
public interface LibroRepository extends CrudRepository<Libro, Integer> {
	
	
}
