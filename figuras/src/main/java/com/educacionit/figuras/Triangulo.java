package com.educacionit.figuras;

public class Triangulo extends Figura {
	
	Integer base;
	Integer altura;

	public Triangulo(String nombre, String color, Integer base, Integer altura) {
		super.setNombre(nombre);
		super.setColor(color);
		this.base = base;
		this.altura = altura;
		
	}
	
	@Override
	public void calcularSuperficie() {
		Double resultado = 0.0;
		resultado = (double) ((base * altura) / 2); 
		System.out.println("La superficie del Triangulo es:" + resultado.toString());

	}

}
