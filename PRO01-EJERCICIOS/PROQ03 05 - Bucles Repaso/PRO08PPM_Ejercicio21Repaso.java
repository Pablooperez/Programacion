/*
	PROGRAMA:
		PRO08PPM_Ejercicio21Repaso

	DESCRIPCION:
		Realiza un programa que solicite por pantalla un numero e imprima por pantalla todos los 
		numero primos incluido en indicado. 

	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO08PPM_Ejercicio21Repaso {
	public static void main(String[] args) {
		
		//Declaraciones

		Scanner sc=new Scanner(System.in);
		int iNumero=0;
		//int iSumaDivisores=0;
		//<
		//>

		//Inicio

		System.out.print("Dime un número: ");
		iNumero=sc.nextInt();

		System.out.println("Números primos hasta " + iNumero + ": ");
		for (int i=1;i<=iNumero;i++) {
				
			int iSumaDivisores=0;

			for (int x=1;x<=i;x++) {
				
				if (i%x==0) {
					iSumaDivisores=iSumaDivisores+x;
				}//If

			}//For

			if (iSumaDivisores==i+1) {
				System.out.println(i);
			}//If

		}//For



		
	




	}//Main

}//Class
