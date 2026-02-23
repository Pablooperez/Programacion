class Aereo extends Vehiculo {
	
	//Atributos

	private int iNumElices;
	private int iNumReactores;
	private String sTipo;

	//Constructores

	public Aereo(){

	}

	//Métodos

	public void retrocederA(int d){
		if (sTipo.equals("helicoptero")) {

		}
	}

	public void imprimeDatos(){
		super.imprimeDatos();
		System.out.println("Número de elices: " + iNumElices);
		System.out.println("Número de reactores: " + iNumReactores);
		System.out.println("Tipo: " + sTipo);

	}

}