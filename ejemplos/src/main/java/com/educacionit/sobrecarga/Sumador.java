package com.educacionit.sobrecarga;

public class Sumador {
	
	public void sumar(int argumento1, int argumento2) {
		Integer resultado = 0;
		resultado = argumento1 + argumento2;
		if (resultado > 0) {
			System.out.println("El resultado de la suma en el método de enteros es mayor a 0!: "+ resultado.toString());
		}
		else {
			System.out.println("El resultado de la suma en el método de enteros es menor a 0: "+ resultado.toString());
		}
		
	}
	
	public void sumar(float argumento1, float argumento2) {
		Float resultado = 0f;
		resultado = argumento1 + argumento2;
		System.out.println("El resultado de la suma en el método de float es:" + resultado.toString());
	}
	
	public void sumar(String argumento1, String argumento2, Boolean tipoOperacion) {
		String resultado = "";
		resultado = argumento1 + " " + argumento2;
		if (tipoOperacion) {
			resultado = resultado + " La operación es positiva!";
		}
		else {
			resultado = resultado + " La operación es negativa.";
		}
		System.out.println("El resultado de la operación string es: "+ resultado);
	}

}
