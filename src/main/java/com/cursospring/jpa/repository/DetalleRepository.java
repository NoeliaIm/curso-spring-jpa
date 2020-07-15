package com.cursospring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursospring.jpa.model.Detalle;

@Repository
public interface DetalleRepository extends JpaRepository<Detalle, Integer> {

}
