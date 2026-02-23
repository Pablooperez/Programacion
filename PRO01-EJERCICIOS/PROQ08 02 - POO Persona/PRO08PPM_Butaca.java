
/*
	PROGRAMA:
		PRO08PPM_Butaca

	DESCRIPCION:
		
		
	MÉTODOS:
		
		
	AUTOR:
		Pablo Pérez
*/

class PRO08PPM_Butaca {
	//Atributos
	private int iFil=0;
	private int iCol=0;
	private String id=""; 
	private String sModelo="";
	private String sColor="";
	private boolean bPlegada=true;
	private boolean bReservada=false;
	private String sNomReserva="";

	//Constructores

	public PRO08PPM_Butaca(int f, int c){
		this.iFil=f;
		this.iCol=c;
		this.id="F"+f+"-"+"C"+c;
	}

	public PRO08PPM_Butaca(int f, int c, String mod, String col){
		this.iFil=f;
		this.iCol=c;
		this.sModelo=mod;
		this.sColor=col;
		this.id=f+"-"+c;
	}

	//CONSTANTES
	private static final String ANSI_BLACK 	= "\u001B[30m";
	private static final String ANSI_RED 	= "\u001B[31m";
	private static final String ANSI_GREEN 	= "\u001B[32m";
	private static final String ANSI_YELLOW = "\u001B[33m";
	private static final String ANSI_BLUE 	= "\u001B[34m";
	private static final String ANSI_PURPLE = "\u001B[35m";
	private static final String ANSI_CYAN 	= "\u001B[36m";
	private static final String ANSI_WHITE 	= "\u001B[37m";


	//**SET/GET/IS**************************************

	public void setColor(String col){
		this.sColor=col;
	}

	public String getModelo(){
		return this.sModelo;

	}

	public String getColor(){
		return this.sColor;

	}

	public boolean isPlegada(){
		return this.bPlegada;
	}	

	public boolean isReservada(){
		return this.bReservada;
	}

	//**MÉTODOS**************************************

	public void subirButaca(){
		if (this.bPlegada) {
			System.out.println(this.id+" Ya estaba subida");
		}else{
			bPlegada=true;
			System.out.println(this.id+" Butaca plegada");
		}
	}

	public void bajarButaca(){
		if (this.bPlegada) {
			System.out.println(this.id+" Butaca bajada");
			bPlegada=false;
		}else{
			System.out.println(this.id+" Ya estaba bajada");
		}
	}

	public void reservarButaca(String sNom){
			this.bReservada=true;
			sNomReserva=sNom;
			this.setColor("Rojo");
		
	}

	public void borrarReserva(){
			bReservada=false;
			sNomReserva="";
			this.setColor("Blanco");
		
	}

	public void imprimirDatos(){
		System.out.println("Ubicación: " +this.iFil+"/"+this.iCol);
		System.out.println("Modelo: "+this.sModelo);
		System.out.println("Color: " +this.sColor);
		System.out.println("¿Está plegada? " +this.bPlegada);
		System.out.println("¿Está reservada? " +this.bReservada+"/"+this.sNomReserva);
	}

	public void dibujarButaca(){
		switch (this.sColor) {
			case "Negro":
				System.out.print(ANSI_BLACK);
				break;
			case "Rojo":
				System.out.print(ANSI_RED);
				break;
			case "Verde":
				System.out.print(ANSI_GREEN);
				break;
			case "Amarillo":
				System.out.print(ANSI_YELLOW);
			case "Azul":
				System.out.print(ANSI_BLUE);
				break;
			case "Morado":
				System.out.print(ANSI_PURPLE);
				break;
			case "Cian":
				System.out.print(ANSI_CYAN);
				break;
			case "Blanco":
				System.out.print(ANSI_WHITE);
				break;
			default:
				System.out.print(ANSI_WHITE);
		}

		if (bPlegada) {
			System.out.print("-");
		}else{
			System.out.print("X");
		}
		System.out.print(ANSI_WHITE);
	}



}