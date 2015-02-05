package com.zubiri.eleccionesberria;

 class EspacioPublico {
	private static String tipo;
	private static String direccionep;
	private static int area;

	 EspacioPublico(String mota, String repres, int m2) {
		this.tipo = mota;
		this.direccionep = repres;
		this.area = m2;
	}
	
	 EspacioPublico() {
		// TODO Auto-generated constructor stub
	}

	 void setTipo (String mota){
		tipo = mota;
	}
	
	 String getTipo(){
		return tipo;
	}

	 void setDireccionep (String dir){
		direccionep = dir;
	}
	 String getDireccionep(){
		return direccionep;
	}

	 void setArea (int m2){
		area = m2;
	}
	 int getArea(){
		return area;
	}

	 static void ImprimirEp(){
		
		System.out.println("\n\n Datos del espacio publico: ");
		System.out.println("\n-------------------------");

		System.out.println("\nEl tipo de espacio es: " + tipo);
		System.out.println("\nLa direccion es: " + direccionep);
		System.out.println("\nEl tamaño es: " + area + "m2");

		System.out.println("\n-------------------------");
	}
	
}
