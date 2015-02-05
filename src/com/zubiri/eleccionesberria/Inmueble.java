package com.zubiri.eleccionesberria;

 class Inmueble {
	private static String direccionin;
	private static String localidadin;
	private static int cp;


	 final void setDireccionin (String dir){
		direccionin = dir;
	}
	 String getDireccionin(){
		return direccionin;
	}

	 void setLocalidadin (String loc){
		localidadin = loc;
	}

	 String getLocalidadin(){
		return localidadin;
	}

	 void setCp (int codp){
		cp = codp;
	}
	 int getCp(){
		return cp;
	}
	
	 static void ImprimirInmu(){
		
		System.out.println("\n\n Datos del inmueble: ");
		System.out.println("\n-------------------------");

		System.out.println("\nLa localidad es: " + localidadin);
		System.out.println("\nLa direccion es: " + direccionin);
		System.out.println("\nEl codigo postal es: " + cp);

		System.out.println("\n-------------------------");
	}

	
}
