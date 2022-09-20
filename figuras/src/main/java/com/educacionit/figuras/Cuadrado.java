package com.educacionit.figuras;

public class Cuadrado extends Figura {
	
	Integer lado;
	
	public Cuadrado(String nombre, String color, Integer lado) {
		super.setNombre(nombre);
		super.setColor(color);
		this.lado = lado;
		
	}
	@Override
	public void calcularSuperficie() {
		Integer resultado = 0;
		resultado = lado * lado; 
		System.out.println("La superficie del Cuarado es:" + resultado.toString());

	}

}
