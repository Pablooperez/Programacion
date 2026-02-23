/*
	PROGRAMA:
		PRO08PPM_mayus

	DESCRIPCION:
		Realizar un programa que imprima por pantalla la secuencia Fibonacci. Este programa solicitará por pantalla la cantidad deFibonacci.
	AUTOR:
		Pablo Pérez

	*/

import java.util.Scanner;

class PRO08PPM_Ejercicio10 {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc= new Scanner(System.in);
		int icontador=1;
		int iMaxF=0;
		int iA=0;
		int iB=1;
		int iF=0;

		//Inicio
		System.out.print("Introduce la cantidad de Fibonacci: ");
		iMaxF=sc.nextInt();

		do {
			iF=iA+iB;
			System.out.println(icontador+" --> "+iF+", ");
			iA=iB;
			iB=iF;
			icontador++;
		} while (icontador<=iMaxF);
		
		//for (icontador=1;icontador<=iMaxF;icontador++) { //Siempre tiene que ser condición de contador.
			iF=iA+iB;
			System.out.println(icontador+" --> "+iF+", ");
			iA=iB;
			iB=iF;
			
		//}
		System.out.println();
		System.out.println("** FIN **");
		
	}//Main

}//Class