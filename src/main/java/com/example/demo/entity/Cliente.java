package com.example.demo.entity;

public class Cliente {

	private int id;
	private String nombre;
	private String apellidos;
	private String dni;

	public Cliente() {

	}

	public Cliente(int id, String nombre, String apellidos, String dni) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	//// Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//// Nombre

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	////// Apellido
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	//// Dni
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
