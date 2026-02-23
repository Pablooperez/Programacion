/*
	PROGRAMA:
		PRO08PPM_mayus

	DESCRIPCION:
		Programa para determinar si un carácter es mayúscula y minúscula. 
	AUTOR:
		Pablo Pérez

	*/

import java.util.Scanner;

class PRO08PPM_mayus {
	public static void main(String[] args) {


		//Declaraciones
		Scanner sc=new Scanner(System.in);
		char c = 0;

		//Inicio
		System.out.print("Introduce un caracter: ");
		c = sc.nextLine().charAt(0);

		int ascii = (int) c;//Creamos una variable INT, forzando que la variable c se transforme a INT.

		if (ascii >=65 && ascii <=90) { //Mayúsculas.
			System.out.println("El carácter " + c + " es una mayúscula.");
			
		} else if (ascii >=97 &&ascii <=122) { //Minúsculas.
			System.out.println("El carácter " + c + " es una minúscula.");
				
		}else{ //No es una letra.
			System.out.println("El carácter " + c + " no es una letra");

		}//If

	}//Main

}//Class