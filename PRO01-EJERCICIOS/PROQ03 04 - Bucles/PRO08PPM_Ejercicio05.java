/*
	PROGRAMA:
		PRO08PPM_mayus

	DESCRIPCION:
		Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc.
	AUTOR:
		Pablo Pérez

	*/

import java.util.Scanner;

class PRO08PPM_Ejercicio05 {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc= new Scanner(System.in);
		int i8=8;
		int iserie8=8;
		int icontador=0;

		System.out.println("Los múltiplos de 8 hasta el valor 500 son: ");
		//Inicio
		while (iserie8<500) {
			System.out.println(icontador +" * "+ i8 +" -->: " + iserie8);
			icontador++;
			iserie8+=i8;

		}//While

	}//Class
	
}//Main