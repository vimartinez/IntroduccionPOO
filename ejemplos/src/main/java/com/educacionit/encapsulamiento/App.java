package com.educacionit.encapsulamiento;

import java.util.ArrayList;
import java.util.List;

import com.educacionit.constructores.Persona;
import com.educacionit.getterSetter.Perro;
import com.educacionit.herencia.ClaseA;
import com.educacionit.herencia.ClaseB;
import com.educacionit.herencia.ClaseC;
import com.educacionit.polimorfismo.Auto;
import com.educacionit.polimorfismo.Barco;
import com.educacionit.polimorfismo.Helicoptero;
import com.educacionit.polimorfismo.Vehiculo;
import com.educacionit.sobrecarga.Sumador;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    //	CuentaBancaria cuentaBancaria = new CuentaBancaria();
    	
    //	System.out.println("El saldo de su cuenta es:"+cuentaBancaria.mostrarSaldo());
    	
    //	cuentaBancaria.depositarDinero(5144.32F);
    	
    //cuentaBancaria.extraerDinero(150000.0F);
    //	cuentaBancaria.setSaldo(800000F);
   
    	
    //	System.out.println("El saldo de su cuenta es:"+cuentaBancaria.mostrarSaldo());
    	
    	
    	
    //	ClaseA claseA = new ClaseA();
    //	ClaseB claseB = new ClaseB();
    //	ClaseC claseC = new ClaseC();
    	
    	
    //	claseA.metodo1();
    //	claseA.metodo2();
    //	claseB.metodo1();
    //	claseB.metodo2();
    //	claseC.metodo1();
    //	claseC.metodo2();
    	
    	
    	//Sumador suma = new Sumador();
    	
    //	suma.sumar(45, -98);
    //	suma.sumar(154.4f, 25f);
    //	suma.sumar("Hola", "Mundo!", false);
    	
    	
  //  	 Persona persona1 = new Persona("victor");
  //  	 Persona persona2 = new Persona("Checo","Perez",35);
  //  	 Persona persona3 = new Persona("Julio", "Sosa", 85, "1245789");
    	 
  //  	 System.out.println(persona1.toString());
  //  	 System.out.println(persona2.toString());
  //  	 System.out.println(persona3.toString());
    	
    	
    //	Perro perro = new Perro("Labrador","Bobby",5,"Chocolate",true);
    	
    	
  //  	System.out.println(perro.getPelaje());
  //  	perro.setPelaje("Negro");
 //   	perro.setEsAmable(false);
    	
  //  	System.out.println(perro.getPelaje());
  //  	System.out.println(perro.getEsAmable());
    	
    	//problema
    	/*Auto auto1 = new Auto("VW", "Vento", 40);
    	Auto auto2 = new Auto("Ford", "Fiesta", 30);
    	Auto auto3 = new Auto("Fiat", "Palio", 40);
    	Auto auto4 = new Auto("Citroen", "Xara", 40);*/
    	
    /*	Integer distancia = 400;
    	List<Auto> flota = new ArrayList<Auto>();
    	
    	flota.add(auto1);
    	flota.add(auto2);
    	flota.add(auto3);
    	flota.add(auto4);
    	flota.add(new Auto("Ferrari","F40",60));
    	
    	for (Auto auto : flota) {
			auto.desplazarse(distancia);
			distancia = distancia * 2;
		}*/
    	
    	//Barco barco1 = new Barco("BarcoMarca", "ElVeloz", 300);
    	//Helicoptero h1 = new Helicoptero("Heli Marca", "Heli modelo", 150);
    	
    	//flota.add(h1);
    	//no se pueden agregar distintos elementos a la lista
    	
    	//Solución - Implementar polimorfismo dinámico
    	Vehiculo auto1 = new Auto("VW", "Vento", 40);
    	Vehiculo auto2 = new Auto("Ford", "Fiesta", 30);
    	Vehiculo auto3 = new Auto("Fiat", "Palio", 40);
    	Vehiculo auto4 = new Auto("Citroen", "Xara", 40);
    	Vehiculo barco1 = new Barco("BarcoMarca", "ElVeloz", 300);
    	Vehiculo h1 = new Helicoptero("Heli Marca", "Heli modelo", 150);
    	
    	List<Vehiculo> flota = new ArrayList<Vehiculo>();
    	flota.add(h1);
    	flota.add(barco1);
    	flota.add(auto4);
    	flota.add(auto3);
    	flota.add(auto2);
    	flota.add(auto1);
    	
    	Integer distancia = 350;
    	for (Vehiculo vehiculo : flota) {
			vehiculo.desplazarse(distancia);
			distancia = distancia * 2;
		}
    }
}
