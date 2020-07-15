package com.cursospring.jpa;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cursospring.jpa.repository.LibroRepository;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		LibroRepository libr = context.getBean("libroRepository", LibroRepository.class);
		System.out.println(libr.count());
		context.close();
	}

}
