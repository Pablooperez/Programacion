/*
	PROGRAMA:
		PRO08PPM_Ahoracado

	DESCRIPCION:
		Practicar strings y bucles. Pide una palabra y muestra esa palabra al revés.

	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO08PPM_StringPracticar6 {
	public static void main(String[] args) {
		
		//Declaraciones

		Scanner sc=new Scanner(System.in);
		String sPalabra=" ";
		String sPalabraReverse=" ";

		//Inicio
		System.out.print("Dime una palabra: ");
		sPalabra=sc.nextLine();
		for (int i=sPalabra.length()-1;i>=0;i--) { //Recorremos la palabra al revés, desde el final al principio.
			char c=sPalabra.charAt(i);
			sPalabraReverse=sPalabraReverse+c;
			
		}//For

		System.out.println("La palabra al revés es: " + sPalabraReverse);

	}//Main
	
}//Class