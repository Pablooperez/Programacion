/*
	PROGRAMA:
		PRO08PPM_Actividad03

	DESCRIPCION:
		Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo o negativo. 

	AUTOR:
		Pablo Pérez

	*/

import java.util.Scanner;

class PRO08PPM_Actividad05  {
	public static void main(String[] args) {

		//Declaraciones
		Scanner teclado=new Scanner(System.in);
		int numero=0;

		//Incio
		System.out.println("Introduce un valor entero: ");
		numero=teclado.nextInt();

		if (numero==0) {
			System.out.println("El número es un valor nulo.");
			}else{
				if (numero>0) {
					System.out.println("El número es un valor positivo.");	
				}else{
					if (numero<0) {
						System.out.println("El número es un valor negativo.");
						
					}//if
				}//if
			}//if


	}//Main
}//Class