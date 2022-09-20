package com.educacionit.figuras;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	List<Figura> figs = new ArrayList<Figura>();
    	
    	figs.add(new Circulo("Circulo1", "Rojo", 25));
    	figs.add(new Cuadrado("Cuadrado1", "Verde", 10));
    	figs.add(new Circulo("Circulo2", "Violeta", 20));
    	figs.add(new Circulo("Circulo3", "Azul", 5));
    	
    	
    /*	for (Figura figura : figs) {
			figura.calcularSuperficie();
		}*/
    	
    	
    	figs.add(new Triangulo("T1","Verde",5,20));
    	figs.add(new Rectangulo("R1","Azul",10,20));
    	figs.add(new Triangulo("T2","Verde",15,10));
    	
    	for (Figura figura : figs) {
			figura.calcularSuperficie();
		}
    	
    }
}
