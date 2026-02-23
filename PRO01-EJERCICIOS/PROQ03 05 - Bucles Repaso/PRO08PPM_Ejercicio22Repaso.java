/*
	PROGRAMA:
		PRO08PPM_Ejercicio22Repaso

	DESCRIPCION:
		Realiza un programa que dado un numero por teclado, calcule si es un número 
		perfecto. (Estos números son aquellos que la suma de sus divisores sin incluir el mismos dan 
		el mismo). 

	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO08PPM_Ejercicio22Repaso {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		int iNumero=0;
		int iSumaDivisores=0;
		//<
		//>

		//Inicio

		System.out.print("Dime un número: ");
		iNumero=sc.nextInt();

		for (int i=1;i<iNumero;i++) {
			if (iNumero%i==0) {
				iSumaDivisores=iSumaDivisores+i;
				//System.out.println(i);
				
			}//If

		}//For
		
		System.out.println("La suma de los divisores del " + iNumero + " es: " + iSumaDivisores);

		if (iSumaDivisores!=iNumero) {
			System.out.println("No es un número perfecto.");
		} else {
			System.out.println("Es un número perfecto.");
		}//Else

	}//Main

}//Class