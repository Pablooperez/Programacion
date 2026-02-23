/*
	PROGRAMA:
		PRO08PPM_Ahoracado

	DESCRIPCION:
		Practicar strings y bucles. Pide una palabra y muestra sus letras separadas por guiones.

	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO08PPM_StringPracticar3 {
	public static void main(String[] args) {
	
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		String sPalabra="";

		//Inicio
		System.out.print("Introduce una palabra: ");
		sPalabra=sc.nextLine();
		for (int i=0;i<sPalabra.length();i++) {
			char c=sPalabra.charAt(i);

			if (i<sPalabra.length() -1) {
				System.out.print(c+"-");
			}else{
				System.out.print(c);
				System.out.println();
			}//Else

		}//For

	}//Main

}//Class