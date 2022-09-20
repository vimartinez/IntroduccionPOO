package com.educacionit.polimorfismo;

public class Barco extends Vehiculo {

	public Barco(String marca, String modelo, Integer combustible) {
		super.setMarca(marca);
		super.setModelo(modelo);
		super.setCombustible(combustible);
	}
	
	@Override
	public void desplazarse(Integer metros) {
		System.out.println("El Barco se mueve " + metros + " metros");

	}

}
