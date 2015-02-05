package com.zubiri.eleccionesberria;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

 class Partido {
	private String nombrepar;
	private String siglas;
	private String repres;

	 void setNombrepar (String izena){
		nombrepar = izena;
	}
	 String getNombrepar(){
		return nombrepar;
	}

	 void setSiglas (String sig){
		siglas = sig;
	}
	 String getSiglas(){
		return siglas;
	}

	 void setRepres (String rep){
		repres = rep;
	}
	 String getRepres(){
		return repres;
	}
	
	 static void ImprimirPart(){
	
	System.out.print("\n--> Datos del partido: \n");
	ArrayList<Partido> listcort = new ArrayList<Partido>();

	File archivo = new File("/home/zubiri/proyectojava/java2/java2_EleccionesBerria/src/listadoPartidos.txt");
	Scanner salida = null;

	try {	
		
		
		System.out.println("\nEstos son los partidos que hay disponibles:");
		salida = new Scanner(archivo);
	 	while (salida.hasNextLine()) {

		String linea = salida.nextLine();			

		String[] corte = linea.split(",");
		Partido part = new Partido();
		part.setNombrepar(corte[0]);
		part.setSiglas(corte[1]);
		part.setRepres(corte[2]);

		listcort.add(part);}
		
		Iterator<Partido> itrPartido = listcort.iterator();
	while(itrPartido.hasNext()){
		Partido part = (Partido)itrPartido.next();
		
		System.out.println("\nNombre del partido: " + part.getNombrepar());
		System.out.println("Siglas del partido: " + part.getSiglas());
		System.out.println("Maximo representante: " + part.getRepres());
		System.out.println("\n-------------------------------");}

	}
	catch (IOException ioe) {
		System.out.println("Error E/S: " + ioe);
		}
	}
}
