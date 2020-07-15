package com.cursospring.jpa;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cursospring.jpa.model.Curso;
import com.cursospring.jpa.model.Detalle;
import com.cursospring.jpa.model.Libro;
import com.cursospring.jpa.repository.CursoRepository;
import com.cursospring.jpa.repository.DetalleRepository;
import com.cursospring.jpa.repository.LibroRepository;

@SpringBootApplication
public class CursoSpringJpaApplication {

	public static void main(String[] args) {

		Libro libro = new Libro();
		Detalle detalle = new Detalle();

		detalle.setAutor("Ian Sommerville");
		detalle.setResumen(
				"El enfoque del presente texto se centra en temas fundamentales para todos los procesos de desarrollo y, en particular, para el desarrollo de sistemas fiables.");
		libro.setDetalle(detalle);
		libro.setAnio("2012");
		libro.setTitulo("Ingeniería de software");
		libro.setClasificacion("Intermedio");
		libro.setEditorial("Grupo Anaya Publicaciones Generales");
		libro.setNumPag("792");
		libro.setEstado("Libre");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DetalleRepository deta = context.getBean("detalleRepository", DetalleRepository.class);

		deta.save(detalle);
		LibroRepository libr = context.getBean("libroRepository", LibroRepository.class);
		libr.save(libro);

		Curso curso = new Curso();
		curso.setNombreCurso("Fundamentos de programación");
		
		curso.setLibro(libr.findById(1).get());
		CursoRepository curs = context.getBean("cursoRepository", CursoRepository.class);
		curs.save(curso);
		context.close();
	}

}
