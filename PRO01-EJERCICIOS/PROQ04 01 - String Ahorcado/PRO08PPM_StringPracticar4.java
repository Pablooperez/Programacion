/*
	PROGRAMA:
		PRO08PPM_Ahoracado

	DESCRIPCION:
		Practicar strings y bucles. Pide una palabra y una letra, y muestra cuántas veces aparece esa letra.
	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO08PPM_StringPracticar4 {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		String sPalabra="";
		String sLetra="";
		int iContador=0;


		//Inicio
		System.out.print("Dime una palabra: ");
		sPalabra=sc.nextLine();
		System.out.print("Dime una letra: ");
		sLetra=sc.nextLine();

		for (int i=0;i<sPalabra.length();i++) {
			char c=sPalabra.charAt(i);
			if (c==sLetra.charAt(0)) {
				iContador++;
			}//If

		}//For

		System.out.println("La letra " + sLetra + " aparece " + iContador + " veces." );

	}//Main

}//Class
