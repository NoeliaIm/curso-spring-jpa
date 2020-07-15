package com.cursospring.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="libros")
public class Libro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idlibros")
	private int idLibro;
	@Column(name="titulo", length = 45, nullable = false)
	private String titulo;
	@Column(name="num_pag", length = 45)
	private String numPag;
	@Column(name="editorial", length = 45)
	private String editorial;
	@Column(name="año", length = 45)
	private String anio;
	@Column(name="estado")
	private String estado;
	@Column(name="clasificacion")
	private String clasificacion;
	@OneToOne
	@JoinColumn(name="idDetalle")
	private Detalle detalle;
	
	
	
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getNumPag() {
		return numPag;
	}
	public void setNumPag(String numPag) {
		this.numPag = numPag;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	public Detalle getDetalle() {
		return detalle;
	}
	public void setDetalle(Detalle detalle) {
		this.detalle = detalle;
	}
	
}
