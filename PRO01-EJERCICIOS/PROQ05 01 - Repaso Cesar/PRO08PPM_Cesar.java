/*
	PROGRAMA:
		PRO08PPM_Cesar

	DESCRIPCION:
		Codificación a Cesar.
		
	MÉTODOS:
		public static void main(String[] args) {
		public static void dibujaPresentacion()
		public static void imprimeMenu()
		public static String solicitaPalabra()
		public static Int solicitaClave()
		public static void codifica(String sALF, String sPalabra, int iClave)
		public static void decodifica(String sALF, String sPalabra, int iClave)
		public static void dibujaFin()

	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;
class PRO08PPM_Cesar {
	public static void main(String[] args) {
		

		//Declaraciones
		Scanner sc=new Scanner(System.in);
		String sALF="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String sPalabra="";
		int iClave=0;
		char cOpcion=' ';



		dibujaPresentacion();
		//Inicio
		do {


			//Menu
			System.out.println();
			cOpcion=imprimeMenu();
			

			

			switch (cOpcion) {
				case '1':
					sPalabra=solicitaPalabra();
					iClave=solicitaClave();
					codifica(sALF,sPalabra,iClave);
					break;
				case '2':
					sPalabra=solicitaPalabra();
					iClave=solicitaClave();
					decodifica(sALF,sPalabra,iClave);
					break;
				case '0':

					break;

			}
			

		}while(cOpcion!='0');

			
		dibujaFin();



	}//Main


//---------------------------------------------------MIS METODOS---------------------------------------------------------------------------------------------

	//Método imprimir menú
	public static char imprimeMenu(){
		Scanner sc=new Scanner(System.in);
		char cseleccion=0;

		do{
			System.out.println("** MENU **");
			System.out.println();
			System.out.println("1. Codificar");
			System.out.println("2. Decodificar");
			System.out.println("0. Salir");
			System.out.println();

		System.out.print("Selecciona una opción: ");
		cseleccion=sc.nextLine().charAt(0);

		
		}while(cseleccion!='1'&& cseleccion!='2'&&cseleccion!='0');

		return cseleccion;
	}

	//Método solicitar palabra
	public static String solicitaPalabra(){
		//Decalraciones
		Scanner sc=new Scanner(System.in);
		String sPalabra="";
		//Inicio
		System.out.print("Introduce palabra: ");
		sPalabra=sc.nextLine().toUpperCase();

		return sPalabra;
	}

	//Método solicitar clave
	public static int solicitaClave(){
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		int iClave=0;
		//Inicio
		System.out.print("Introduce la clave: ");
		iClave=sc.nextInt();

		return iClave;
	}

	public static void codifica(String sALF, String sPalabra, int iClave){
		System.out.print("Palabra codificada: ");
		for (int i=0;i<sPalabra.length();i++) {
			
			for (int j=0;j<sALF.length();j++) {
				
				if (sPalabra.charAt(i)==sALF.charAt(j)) {
					if (j+iClave>26) {
						System.out.print(sALF.charAt(j+iClave-sALF.length()));
						
					}else
					System.out.print(sALF.charAt(j+iClave));
					break;

				}//If

			}//For

		}//For
		System.out.println();
	}//Decodifica

	public static void decodifica(String sALF, String sPalabra, int iClave){
		System.out.print("La palabra decodificada es: ");
		for (int i=0;i<sPalabra.length();i++) {

			for (int j=0;j<sALF.length();j++) {
				
				if (sPalabra.charAt(i)==sALF.charAt(j)) {
					if (j-iClave<0) {
						System.out.print(sALF.charAt(j-iClave+sALF.length()));
					}else

					System.out.print(sALF.charAt(j-iClave));
					break;
				}//If

			}//For

		}//For
		System.out.println();
	}//Decodifica

	//Método dibujar presentación
	public static void dibujaPresentacion(){
		System.out.println();
		System.out.println("PRESENTACIÓN CESAR");
		System.out.println();
	}

	//Método dibuja fin
	public static void dibujaFin(){
    System.out.println();
    System.out.println("    _        _        _______  __   __   __            ");
    System.out.println(" /\\| |/\\  /\\| |/\\    |   ____||  | |  \\ |  |     /\\| |/\\  /\\| |/\\ ");
    System.out.println(" \\ ` \' /  \\ ` \' /    |  |__   |  | |   \\|  |     \\ ` \' /  \\ ` \' / ");
    System.out.println("|_     _||_     _|   |   __|  |  | |  . `  |    |_     _||_     _|");
    System.out.println(" / , . \\  / , . \\    |  |     |  | |  |\\   |     / , . \\  / , . \\ ");
    System.out.println(" \\/|_|\\/  \\/|_|\\/    |__|     |__| |__| \\__|     \\/|_|\\/  \\/|_|\\/ ");
    System.out.println();
    }

}//Class


