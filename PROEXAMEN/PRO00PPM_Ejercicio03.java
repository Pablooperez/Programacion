/*
	PROGRAMA:
		PRO00PPM_Ejercicio03

	DESCRIPCION:
		Crea un metodo que pasandole como parametro un entero, devuelva true or false si es capicua.
		
	MÉTODOS:

	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO00PPM_Ejercicio03 {
	public static void main(String[] args) {
	
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		String sNumeros="";
		String sReverse="";
		boolean bEstado=true;

		//Inicio
		System.out.println("Dime un conjunto de numeros: ");
		sNumeros=sc.nextLine();
		System.out.println("El conjunto de números es: " + sNumeros);
		for (int i=0;i<sNumeros.length();i++) {
			System.out.println("La posición " + i + " es: " + sNumeros.charAt(i));
			sReverse=sNumeros.charAt(i)+sReverse;
		}

		System.out.println("El número en reverse es: " + sReverse);

		if (sNumeros.equals(sReverse)) {
			System.out.println(bEstado);
		}else{
			System.out.println(!bEstado);
		}

	}//main

}//class