package com.bytecode.core.model;

import java.util.Date;

public class Post {
	private int id;
	private String descripcion;
	private String urlimg = "http://localhost:8080/img/post.jpg";
	private Date fecha = new Date();
	private String titulo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUrlimg() {
		return urlimg;
	}
	public void setUrlimg(String urlimg) {
		this.urlimg = urlimg;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Post(int id, String descripcion, String urlimg, Date fecha, String titulo) {
		this.id = id;
		this.descripcion = descripcion;
		this.urlimg = urlimg;
		this.fecha = fecha;
		this.titulo = titulo;
	}
	public Post() {
		
	}

	

}
