/*
	PROGRAMA:
		PRO08PPM_DiaSemana

	DESCRIPCION:
		Programa para ingresar / sacar dinero de una cuenta usando el siguiente menú, y switch: 1. Ingresar dinero a la cuenta. 2.Retirar dinero de la cuenta. 3. Salir.
	AUTOR:
		Pablo Pérez

*/

import java.util.Scanner;
class PRO08PPM_cajero {
	public static void main(String[] args) {

		//Declaraciones

		Scanner sc=new Scanner(System.in);
		int ipulsador=0;
		int idinero=0;


		//Inicio		
		System.out.println("Bienvenido a su cuenta bancaria. El menú es el siguiente: ");
		System.out.println("1. Ingresar dinero a la cuenta.");
		System.out.println("2. Retirar dinero de la cuenta.");
		System.out.println("3. Salir.");
		System.out.println("Selecciona una opción: ");
		ipulsador=sc.nextInt();

		switch (ipulsador) {
			case 1:
				System.out.println("¿Cuanto dinero desea ingresar?.");
				break;
			case 2:
				System.out.println("¿Cuanto dinero desea retirar?");
				break;
			case 3:
				System.out.println("FIN");
				System.exit(0);
				break;
			default:
				System.out.println("ERROR");

		}//Switch

		idinero=sc.nextInt();
		System.out.println("Perfecto, ha retirado/ingresado " + idinero + " € a/de su cuenta.");

	}//Main

}//Class