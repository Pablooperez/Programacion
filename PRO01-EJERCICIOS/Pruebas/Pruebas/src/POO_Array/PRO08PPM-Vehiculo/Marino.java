class Marino extends Vehiculo {
	
	//Atributos

	private int iMastiles;
	private int iNumMotores;
	private String sCombustible;

	//Constructores

	public Marino(){

	}

	//Métodos

	public void elevarVelas(){

	}

	public void recogerVelas(){

	}


	public void imprimeDatos(){
		super.imprimeDatos();
		System.out.println("Número de mastiles: " + iMastiles);
		System.out.println("Número de motores: " + iNumMotores);
		System.out.println("Tipo de combustible: " + sCombustible);
	}
}