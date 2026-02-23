/*
	PROGRAMA:
		PRO08PPM_Ejercicio19Repaso

	DESCRIPCION:
		Realiza un programa que tras solicitar un numero te liste todos sus divisores.	
	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO08PPM_Ejercicio19Repaso {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		int iNumero=0;

		//Inicio
		System.out.println("Dime un número: ");
		iNumero=sc.nextInt();
		System.out.println("Los divisores de " + iNumero + " son: ");
		for (int i=1;i<=iNumero;i++) {
			if (iNumero%i==0) {
				System.out.println("-->" + i);	
			}//

		}//For

	}//Main

}//Class
