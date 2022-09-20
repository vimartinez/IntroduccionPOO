package com.educacionit.herencia;

public class ClaseC extends ClaseB{

	public void metodo1() {
		super.metodo2();
		System.out.println("Clase C - Método 1");
	}
	
	public void metodo2() {
		System.out.println("ClaseC - Método 2");
	}
}
