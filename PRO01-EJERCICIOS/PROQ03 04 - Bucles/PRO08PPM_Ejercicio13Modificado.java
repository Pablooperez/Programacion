/*
	PROGRAMA:
		PRO08PPM_mayus

	DESCRIPCION:
		Desarrollar un programa que muestre la tabla de multiplicar del 5 (del 5 al 50)
	AUTOR:
		Pablo Pérez

	*/
import java.util.Scanner;


class PRO08PPM_Ejercicio13Modificado {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		int iNum=0;
		int iCont=0;


		//Inicio
		//Pedir número de tabla de multiplicar
		System.out.print("Introduce el número: ");
		iNum=sc.nextInt();

		//While
		System.out.println("La tabla de multiplicar de " + iNum + " es la siguiente: ");
		while (iCont<=10) {
			System.out.println(iNum + " * " + iCont + " = " + (iNum*iCont));
			iCont++;
		}

		//Do
		iCont=0;
		System.out.println("La tabla de multiplicar de " + iNum + " es la siguiente: ");
		do {
			System.out.println(iNum + " * " + iCont + " = " + (iNum*iCont));
			iCont++;
		}while (iCont<=10);

		//For
		System.out.println("La tabla de multiplicar de " + iNum+ " es la siguiente: ");
		for (int i=0;i<=10;i++) {
			System.out.println(iNum+ " * " + i + " = " + (i*iNum));
		}


	}//Main

}//Class