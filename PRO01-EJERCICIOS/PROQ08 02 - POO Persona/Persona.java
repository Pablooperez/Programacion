/*
	PROGRAMA:
		Persona

	DESCRIPCION:
		
		
	MÉTODOS:
		public void anda(int iDistancia)
		public void salta()
		public void duerme()
		public void cumplirAnyos()
		
	AUTOR:
		Pablo Pérez
*/


class Persona {
	//Declaraciones de clase ATRIBUTOS
	private String nombre="No tengo nombre";
	private String apellidos;
	private char sexo;
	private int edad=0;




	//**CONSTRUCTORES************
	public Persona(String n, String a, int e){
		nombre=n;
		apellidos=a;
		edad=e;

	}


	//**SET/GET/IS**************************************

	public void setNombre(String n){
		//Declaraciones
		String strTmp;
		boolean bError=false;

		//Inicio
		strTmp=n;
		n=n.toUpperCase();
		for (int i=0;i<n.length();i++) {
			if ((int)n.charAt(i)<65 || (int)n.charAt(i)>90) {
				bError=true;
				break;		
			}
		}
		if (bError) {
			System.out.println("ERROR en Nombre");
		}else{
			nombre=strTmp;
		}
	}//setNombre

	public String getNombre(){
		return nombre;
	}//getNombre

	public int getEdad(){
		return edad;
	}//getEdad

	public boolean isNombre(String n){
		return nombre.equals(n);
	}//isNombre

	//**MÉTODOS**************************************

	public void salta(){
		//Declaraciones

		//Inicio
		System.out.println(nombre + " está saltando");

	}//salta

	public void duerme(){
		//Declaraciones

		//Inicio
		System.out.println(nombre + " está durmiendo");
	}//duerme

	public void cumplirAnyos(){
		edad++;
		System.out.println("**FELICIDADES " +nombre);
		System.out.println("Ya tienes "+edad+" años.");
		System.out.println();
	}//cumplirAnyos

	public void anda(int iDistancia){
		
		System.out.println(nombre + " está andando " + iDistancia+ "m.");
	}//andar





}//class