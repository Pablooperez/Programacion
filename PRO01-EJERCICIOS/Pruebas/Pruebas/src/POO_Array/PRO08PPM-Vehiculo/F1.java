/*
* Titulo
	F1

* Descripcion
	

* Metodos
public F1(String escuderia, String piloto)
	public void setEscuderia(String escuderia)
	public void setPiloto(String str)
	public void imprimeDatos()
*/

class F1 extends Terrestre {
	
	//Atributos
	int iAerodinamica=0;
	private String sEscuderia;
	private String sPiloto;

	//Constructores

	public F1(String escuderia, String piloto){
		super(escuderia,1,1,4);
		this.sEscuderia=escuderia;
		this.sPiloto=piloto;
	}

	//Getter and setter


	public void setEscuderia(String escuderia){
		this.sEscuderia=escuderia;
	}

	public void setPiloto(String str){
		this.sPiloto=str;
	}

	//Métodos

	public void imprimeDatos(){
		super.imprimeDatos();
		System.out.println("Aerodinámica: " + iAerodinamica);
		System.out.println("Escuderia: " + sEscuderia);
		System.out.println("Piloto: " + sPiloto);
	}



}