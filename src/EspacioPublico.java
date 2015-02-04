public class EspacioPublico {
	private static String tipo;
	private static String direccionep;
	private static int area;

	public EspacioPublico(String mota, String repres, int m2) {
		this.tipo = mota;
		this.direccionep = repres;
		this.area = m2;
	}
	
	public EspacioPublico() {
		// TODO Auto-generated constructor stub
	}

	public void setTipo (String mota){
		tipo = mota;
	}
	
	public String getTipo(){
		return tipo;
	}

	public void setDireccionep (String dir){
		direccionep = dir;
	}
	public String getDireccionep(){
		return direccionep;
	}

	public void setArea (int m2){
		area = m2;
	}
	public int getArea(){
		return area;
	}

	public static void ImprimirEp(){
		
		System.out.println("\n\n Datos del espacio publico: ");
		System.out.println("\n-------------------------");

		System.out.println("\nEl tipo de espacio es: " + tipo);
		System.out.println("\nLa direccion es: " + direccionep);
		System.out.println("\nEl tamaño es: " + area + "m2");

		System.out.println("\n-------------------------");
	}
	
}
