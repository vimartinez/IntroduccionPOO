package com.educacionit.polimorfismo;

public abstract class Vehiculo {
	private String marca;
	private String modelo;
	private Integer combustible;
	
	
	public void arrancar() {
		System.out.println("El vehículo arranca");
	}
	
	public void apagar() {
		System.out.println("El vehículo se apaga");
	}
	
	public abstract void desplazarse(Integer metros);


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public Integer getCombustible() {
		return combustible;
	}


	public void setCombustible(Integer combustible) {
		this.combustible = combustible;
	}
	
	
	

}
