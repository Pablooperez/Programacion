/*
	PROGRAMA:
		PRO08PPM_Ejercicio20Repaso

	DESCRIPCION:
		Realiza un programa que solicite por pantalla un numero e indique si el numero es primos o no. 

	AUTOR:
		Pablo Pérez
*/

//Para que un número sea primo, tiene que cumplirse que solamente sea divisor el 1 y el mismo número.

import java.util.Scanner;

class PRO08PPM_Ejercicio20Repaso {
	public static void main(String[] args) {
	
	//Declaraciones
	Scanner sc= new Scanner(System.in);
	int iNumero=0;
	int iSumaDivisores=0;

	//Si la suma de los divisores es mayor que el número más 1. Entonces NO es primo

	//Inicio
	System.out.print("Dime un número: ");
	iNumero=sc.nextInt();
	for (int i=1;i<=iNumero;i++) {
		if (iNumero%i==0) {
			iSumaDivisores=iSumaDivisores+i;
		}//If		
	}//For

	if (iSumaDivisores==(iNumero+1)) {
		System.out.println("Es número primo.");
	}else{
		System.out.println("No es número primo.");
	}//Else If
			
		
	
			
		
			
	
		
	






	}//Main

}//Class