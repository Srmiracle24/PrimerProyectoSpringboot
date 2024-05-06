package com.miracle.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Embedding {

	@Id
	private int identificador;

	@Column(name = "usuario")
	private String usuario;

	@Column(name = "contenido_texto")
	private String contenido_texto;

	@Column(name = "embeddings")
	private String embeddings;

	@Column(name = "nombre_archivo")
	private String nombre_archivo;

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContenido_texto() {
		return contenido_texto;
	}

	public void setContenido_texto(String contenido_texto) {
		this.contenido_texto = contenido_texto;
	}

	public String getEmbeddings() {
		return embeddings;
	}

	public void setEmbeddings(String embeddings) {
		this.embeddings = embeddings;
	}

	public String getNombre_archivo() {
		return nombre_archivo;
	}

	public void setNombre_archivo(String nombre_archivo) {
		this.nombre_archivo = nombre_archivo;
	}

}
