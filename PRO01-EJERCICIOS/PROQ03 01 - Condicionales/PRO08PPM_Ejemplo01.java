/*
	PROGRAMA:
		PRO08PPM_Ejemplo01

	DESCRIPCION:
		Ejemplo de condicionales (IF)

	AUTOR:
		Pablo Pérez

	*/

import	java.util.Scanner;

class PRO08PPM_Ejemplo01 {
	public static void main(String[] args) {
		//Declaraciones
		Scanner teclado = new Scanner(System.in);
		//Scanner sc = new Scanner(System.in);
		int nota1=0, nota2=0, nota3=0;
		int contador=0;
		long numPersonas=0; 


		//Inicio
		System.out.print("Introduce una nota1: ");
		nota1=teclado.nextInt();
		System.out.print("Introduce una nota2: ");
		nota2=teclado.nextInt();
		System.out.print("Introduce una nota3: ");
		nota3=teclado.nextInt();

		if ((nota1+nota2+nota3)/3>=5) {
			System.out.print("Tu nota es: "+(nota1+nota2+nota3)/3);
			System.out.println(" -> Aprobado");
		}else{
			System.out.print("Tu nota es: "+(nota1+nota2+nota3)/3);
			System.out.println(" -> Suspendido");
		}
		System.out.println("\n***Fin de programa***");		

	}//Main
}//Class