/*
	PROGRAMA:
		PRO08PPM_Actividad03

	DESCRIPCION:
		Se ingresa por teclado un número positivo de uno o dos digitos (1.99) mostrar un mensaje indicando si el número tiene uno o dos dígitos.

	AUTOR:
		Pablo Pérez

	*/

import java.util.Scanner;

class PRO08PPM_Actividad03 {
	public static void main(String[] args) {
		//Declaraciones
		Scanner teclado=new Scanner(System.in);
		int numero=0;	
		
		//Inicio
		System.out.print("Introduce un número entre 1-99: ");
		numero=teclado.nextInt();

		if (numero<0 || numero>99) { //Estamos delimitando el rango
			System.out.println("Número fuera de rango.");
		}
		if (numero >=0 && numero <=9) { //Primera condicion por la que delimitamos los números de 1 digito.
			System.out.println("Tu número " + numero+" tiene una cifra.");			
			}else{ //Segunda condición por la que delimitamos los número de 2 dígitos.
				System.out.println("Tu número " + numero+ " tiene dos cifras.");
		}

	
	}//Main
}//Class