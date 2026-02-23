/*
	PROGRAMA:
		PRO08PPM_Actividad03

	DESCRIPCION:
		Se cargan por teclado 3 números distintos. Mostrar por pantalla el mayor de ellos.

	AUTOR:
		Pablo Pérez

	*/

import java.util.Scanner;
class PRO08PPM_Actividad04 {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		int numero1=0, numero2=0, numero3=0;


		//Inicio
		System.out.print("Introduce el número 1: ");
		numero1=sc.nextInt();
		System.out.print("Introcuce el número 2: ");
		numero2=sc.nextInt();
		System.out.print("Introduce el número 3: ");
		numero3=sc.nextInt();

		//Condicionales SI anidados
		if (numero1>=numero2 && numero1>=numero3) {
			System.out.println("El número 1 es el número mayor: " +numero1);
		}else{
			if (numero2>=numero1 && numero2>=numero3) {
				System.out.println("El´número 2 es el número mayor: " +numero2);
			}else{
				if (numero3>=numero1 && numero3>=numero2) {
					System.out.println("El número 3 es el número mayor: " +numero3);
					
				}
			}
		}

		//Condicionales NO anidados
		if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println(numero1+ " es el número mayor.");
		}//if
		if (numero2 >= numero1 && numero2 >= numero3) {	
			System.out.println(numero2+ " es el número mayor.");		
		}//if
		if (numero3 >= numero1 && numero3 >= numero2) {
			System.out.println(numero3+ " es el número mayor.");
		}//if

	}//Main
}//Class