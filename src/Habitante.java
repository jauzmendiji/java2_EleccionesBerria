import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Habitante {
	private String nombre;
	private String ape1;
	private String ape2;
	private String dni;
	private int edad;

	public void setNombre (String izena){
		nombre = izena;
	}
	public String getNombre(){
		return nombre;
	}

	public void setApellido1 (String ab1){
		ape1 = ab1;
	}
	public String getApellido1(){
		return ape1;
	}

	public void setApellido2 (String ab2){
		ape2 = ab2;
	}

	public String getApellido2(){
		return ape2;
	}	

	public void setDni (String nan){
		dni = nan;
	}

	public String getDni(){
		return dni;
	}

	public void setEdad (int ad){
		edad = ad;
	}

	public int getEdad(){
		return edad;
	}
	
	public static void ImprimirHabitante(){
		
		System.out.print("\n--> Datos de los votantes: \n");
		ArrayList<Habitante> alHabitante= new ArrayList<Habitante>();

		File censo = new File("/home/zubiri/proyectojava/java2/java2_Elecciones/src/censo.txt");
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
