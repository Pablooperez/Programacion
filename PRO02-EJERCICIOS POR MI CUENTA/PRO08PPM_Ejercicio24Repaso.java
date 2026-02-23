/*
	PROGRAMA:
		PRO08PPM_Ejercicio24Repaso

	DESCRIPCION:
		Realiza un programa que solicite un número entero por teclado y calcule su factorial

	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO08PPM_Ejercicio24Repaso {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		int iNumero=0;
		int iFactorial=1;
		//Inicio
		System.out.print("Dime un número: ");
		iNumero=sc.nextInt();
		System.out.println();
		System.out.println("El factorial de " + iNumero + " es: ");
		System.out.println();


		for (int x=1;x<=iNumero;x++) {
			iFactorial=iFactorial*x;
			
			if (x<iNumero) {
					System.out.print(x + " * ");
			}else if (x==iNumero) {
					System.out.println(x + ": " + iFactorial);
			}//Else If
				
		}//For

		System.out.println();

	}//Main

}//Class