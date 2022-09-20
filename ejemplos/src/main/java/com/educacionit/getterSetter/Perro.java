package com.educacionit.getterSetter;

public class Perro {
	private String raza;
	private String nombre;
	private Integer edad;
	private String pelaje;
	private Boolean esAmable;
		
	public Perro(String raza, String nombre, Integer edad, String pelaje, Boolean esAmable) {
		super();
		this.raza = raza;
		this.nombre = nombre;
		this.edad = edad;
		this.pelaje = pelaje;
		this.esAmable = esAmable;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPelaje() {
		return pelaje;
	}
	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}
	public Boolean getEsAmable() {
		return esAmable;
	}
	public void setEsAmable(Boolean esAmable) {
		this.esAmable = esAmable;
	}
	
	
	

}
