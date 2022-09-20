package com.educacionit.figuras;

public class Circulo extends Figura {
	
	private Integer radio;

	public Circulo(String nombre, String color, Integer radio) {
		super.setNombre(nombre);
		super.setColor(color);
		this.radio = radio;
		
	}
	@Override
	public void calcularSuperficie() {
		Double resultado = 0.0;
		resultado = 3.1416 * radio * radio; 
		System.out.println("La superficie del circulo es:" + resultado.toString());

	}

}
