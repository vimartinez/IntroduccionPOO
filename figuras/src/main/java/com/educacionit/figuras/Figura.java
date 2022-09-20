package com.educacionit.figuras;

public abstract class Figura {
	private String nombre;
	private String color;
	
	public void copiar() {
		System.out.println("Se copió la figura");
	}
	public void borrar() {
		System.out.println("Se borró la figura");
	}
	public void mover() {
		System.out.println("Se movió la figura");
	}
	
	public abstract void calcularSuperficie();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
