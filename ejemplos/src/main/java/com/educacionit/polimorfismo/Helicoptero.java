package com.educacionit.polimorfismo;

public class Helicoptero extends Vehiculo {

	public Helicoptero(String marca, String modelo, Integer combustible) {
		super.setMarca(marca);
		super.setModelo(modelo);
		super.setCombustible(combustible);
	}
	@Override
	public void desplazarse(Integer metros) {
		System.out.println("El Helicóptero se mueve " + metros + " metros");

	}

}
