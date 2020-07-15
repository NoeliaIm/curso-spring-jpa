package com.cursospring.jpa;

import java.util.Optional;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cursospring.jpa.model.Libro;
import com.cursospring.jpa.repository.LibroRepository;

public class UpdateEntity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		LibroRepository libr = context.getBean("libroRepository", LibroRepository.class);
		Optional<Libro> op= libr.findById(1);
		if(op.isPresent()) {
			Libro libro= op.get();
			libro.setEstado("Prestado");
			libr.save(libro);
		}
		context.close();
	}

}
