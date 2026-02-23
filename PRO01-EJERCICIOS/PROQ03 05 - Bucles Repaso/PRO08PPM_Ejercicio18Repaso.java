/*
	PROGRAMA:
		PRO08PPM_Ejercicio18Repaso

	DESCRIPCION:
		Realiza un programa que solicite por teclado una tabla de multiplicar y 
		que imprima por pantalla todas las tablas menores he igual que el número
		introducido. 
	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO08PPM_Ejercicio18Repaso {
	public static void main(String[] args) {

		//Declaraciones
		Scanner sc=new Scanner(System.in);
		int iTablaMultiplicar=0;
		//int iTablas=1;

		//Inicio
		System.out.print("Introduce una tabla de multiplicar: ");
		iTablaMultiplicar=sc.nextInt();
		System.out.println();
		System.out.println("Las tablas menores e iguales que " + iTablaMultiplicar + " son: ");

		for (int i=iTablaMultiplicar;i<=iTablaMultiplicar;i--) {
			System.out.println();
			System.out.println("--> Tabla del " + i + ":");
			System.out.println();
			for (int x=1;x<=10;x++ ) {
				System.out.println(i + " * " + x + " = " + i*x);
			}//For
			if (i==0) {
				System.out.println();
				System.exit(0);
				System.out.println();
			}//If

		}//For

	}//Main

}//Class