package com.cursospring.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cursospring.jpa.model.Curso;

@Repository
public interface CursoRepository extends CrudRepository<Curso, Integer> {

}
