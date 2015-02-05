package com.zubiri.eleccionesberria;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

 class Habitante {
	private String nombre;
	private String ape1;
	private String ape2;
	private String dni;
	private int edad;

	 void setNombre (String izena){
		nombre = izena;
	}
	 String getNombre(){
		return nombre;
	}

	 void setApellido1 (String ab1){
		ape1 = ab1;
	}
	 String getApellido1(){
		return ape1;
	}

	 void setApellido2 (String ab2){
		ape2 = ab2;
	}

	 String getApellido2(){
		return ape2;
	}	

	 void setDni (String nan){
		dni = nan;
	}

	 String getDni(){
		return dni;
	}

	 void setEdad (int ad){
		edad = ad;
	}

	 int getEdad(){
		return edad;
	}
	
	 static void ImprimirHabitante(){
		
		System.out.print("\n--> Datos de los votantes: \n");
		ArrayList<Habitante> alHabitante= new ArrayList<Habitante>();

		File censo = new File("/home/zubiri/proyectojava/java2/java2_EleccionesBerria/src/censo.txt");
		Scanner salidah = null;

		try {	
			
			salidah = new Scanner(censo);
		 	while (salidah.hasNextLine()) {

			String lineah = salidah.nextLine();			

			String[] corte = lineah.split(",");
			Habitante habit = new Habitante();
			habit.setNombre(corte[0]);
			habit.setApellido1(corte[1]);
			habit.setApellido2(corte[2]);
			habit.setDni(corte[3]);

			int edadh = Integer.parseInt(corte[4]);
			habit.setEdad(edadh);

			if (edadh >= 18){
			alHabitante.add(habit);}
			}		
			Iterator<Habitante> itrHabitante = alHabitante.iterator();

		while(itrHabitante.hasNext()){
			Habitante habit = (Habitante)itrHabitante.next();
			
			System.out.println("\nNombre del habitante: " + habit.getNombre());
			System.out.println("Primer apellido del habitante: " + habit.getApellido1());
			System.out.println("Segundo Apellido del habitante: " + habit.getApellido2());
			System.out.println("DNI del habitante: " + habit.getDni());
			System.out.println("Edad del habitante: " + habit.getEdad());
			System.out.println("\n-------------------------------");}

		}
		catch (IOException ioe) {
			System.out.println("Error E/S: " + ioe);
		}
		
	}
}
