package com.educacionit.figuras;

public class Rectangulo extends Figura {
	
	Integer lado1;
	Integer lado2;
	
	public Rectangulo(String nombre, String color, Integer lado1, Integer lado2) {
		super.setNombre(nombre);
		super.setColor(color);
		this.lado1 = lado1;
		this.lado2 = lado2;
		
	}

	@Override
	public void calcularSuperficie() {
		Integer resultado = 0;
		resultado = lado1 * lado2; 
		System.out.println("La superficie del Rectángulo es:" + resultado.toString());

	}

}
