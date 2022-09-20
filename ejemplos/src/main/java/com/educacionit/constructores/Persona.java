package com.educacionit.constructores;

public class Persona {
	private String nombre;
	private String apellido;
	private Integer edad;
	private String nroDocumento;
	
	public Persona () {
		
	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public Persona(String nombre, String apellido, Integer edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	
	public Persona(String nombre, String apellido, Integer edad, String nroDocumento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.nroDocumento = nroDocumento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", nroDocumento="
				+ nroDocumento + "]";
	}
	
	
	
}


