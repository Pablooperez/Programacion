/*
	PROGRAMA:
		PRO08PPM_DiaSemana

	DESCRIPCION:
		Programa para ingresar / sacar dinero de una cuenta usando el siguiente menú, y switch: 1. Ingresar dinero a la cuenta. 2.Retirar dinero de la cuenta. 3. Salir.
	AUTOR:
		Pablo Pérez

*/

import java.util.Scanner;
class PRO08PPM_bancoclase {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		float fCCC=1000f;
		float fimporte=0;
		byte bopción=0;

		//Inicio
		//Menu

		System.out.println("Bienvenido a su cuenta bancaria.");
		System.out.println(" ");
		System.out.println("En tu cuenta hay disponible " + fCCC);
		System.out.println(" ");
		System.out.println(" El menú es el siguiente: ");
		System.out.println("------------------------------");
		System.out.println("1. Ingresar dinero a la cuenta.");
		System.out.println("2. Retirar dinero de la cuenta.");
		System.out.println("3. Salir.");
		System.out.println("------------------------------");
		System.out.println("Selecciona una opción: ");
		bopción=sc.nextByte();

		//Gestión
		
		switch (bopción) {
			case 1://Ingresar
				System.out.println("¿Cuanto dinero desea ingresar?");
				fimporte=sc.nextFloat();
				fCCC=fCCC+fimporte;
				System.out.println("En tu cuenta hay disponible " + fCCC);
				break;
			case 2://Retirar
				System.out.println("¿Cuanto dinero desea retirar?");
				fimporte=sc.nextFloat();
				fCCC-=fimporte;
				System.out.println("En tu cuenta hay disponible " + fCCC);
				break;
			case 3://Salir
				System.out.println("FIN");
				System.exit(0);
				break;

		}//Switch

	}//Main
	
}//Class