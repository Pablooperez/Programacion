/*
	PROGRAMA:
		PRO08PPM_Ahoracado

	DESCRIPCION:
		Practicar strings y bucles. Pide una palabra y muestra cuántas letras tiene.
		

	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO08PPM_StringPracticar1 {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		String sPalabra="";


		//Inicio
		System.out.print("Introduce una palabra: ");
		sPalabra=sc.nextLine();

		int iLetras=sPalabra.length();

		System.out.println("La palabra " + " ( "  + sPalabra + " ) " + " tiene " + iLetras + " letras.");












	}//Main

}//Class
