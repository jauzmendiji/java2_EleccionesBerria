package com.zubiri.eleccionesberria;

 final class Ayuntamiento {
	private static String direccionay;
	private static String localidaday;
	private static String alcalde;
	private static String partidop;

	final void setDireccionay (String dir){
		direccionay = dir;
	}
	String getDireccionay(){
		return direccionay;
	}

	final void setLocalidaday (String loc){
		localidaday = loc;
	}
	 String getLocalidaday(){
		return localidaday;
	}

	 final void setAlcalde (String alkate){
		alcalde = alkate;
	}
	 String getAlcalde(){
		return alcalde;
	}

	 final void setPartidop (String pp){
		partidop = pp;
	}
	 String getPartidop(){
		return partidop;
	}
	
	 static void ImprimirAyun(){
		
		System.out.println("\n\n Datos Ayuntamiento: ");
		System.out.println("\n-------------------------");

		System.out.println("\nLa direccion es: " + direccionay);
		System.out.println("\nEl localidad es: " + localidaday);
		System.out.println("\nEl alcalde es: " + alcalde);
		System.out.println("\nPertence al partido: " + partidop);

		System.out.println("\n-------------------------");
	}
}
