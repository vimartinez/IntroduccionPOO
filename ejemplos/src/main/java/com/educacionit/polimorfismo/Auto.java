package com.educacionit.polimorfismo;

public class Auto extends Vehiculo {

	public Auto(String marca, String modelo, Integer combustible) {
		super.setMarca(marca);
		super.setModelo(modelo);
		super.setCombustible(combustible);
	}
	
	@Override
	public void desplazarse(Integer metros) {
		System.out.println("El auto se mueve " + metros + " metros");

	}

}
