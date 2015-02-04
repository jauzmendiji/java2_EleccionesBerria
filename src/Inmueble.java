public class Inmueble {
	private static String direccionin;
	private static String localidadin;
	private static int cp;


	public final void setDireccionin (String dir){
		direccionin = dir;
	}
	public String getDireccionin(){
		return direccionin;
	}

	public void setLocalidadin (String loc){
		localidadin = loc;
	}

	public String getLocalidadin(){
		return localidadin;
	}

	public void setCp (int codp){
		cp = codp;
	}
	public int getCp(){
		return cp;
	}
	
	public static void ImprimirInmu(){
		
		System.out.println("\n\n Datos del inmueble: ");
		System.out.println("\n-------------------------");

		System.out.println("\nLa localidad es: " + localidadin);
		System.out.println("\nLa direccion es: " + direccionin);
		System.out.println("\nEl codigo postal es: " + cp);

		System.out.println("\n-------------------------");
	}

	
}
