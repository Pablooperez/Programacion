/*
	PROGRAMA:
		PRO08PPM_Actividad03

	DESCRIPCION:
		Se ingresa por teclado un número positivo de uno o dos digitos (1.99) mostrar un mensaje indicando si el número tiene uno o dos dígitos.

	AUTOR:
		Pablo Pérez

	*/
import java.util.Scanner;

class PRO08PPM_ActividadPromedio {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner teclado=new Scanner(System.in);
		int nota1=0; 
		int nota2=0;
		int nota3=0;
		int promedio=0;

		//Inicio
		System.out.println("Introduce la nota 1: ");
		nota1=teclado.nextInt();
		System.out.println("Introduce la nota 2: ");
		nota2=teclado.nextInt();
		System.out.println("Introduce la nota 3: ");
		nota3=teclado.nextInt();

		promedio=((nota1+nota2+nota3)/3);

		if (promedio<4) {
			System.out.println("Tu promedio es: " + promedio+ ". Reprobado.");			
		}

		if (promedio>=4 && promedio<7) { // Las || se le como O. Las && es una Y. 
			System.out.println("Tu promedio es: " + promedio+ ". Regular.");
		}

		if (promedio>=7) {
			System.out.println("Tu promedio es: " + promedio+ ". Promocionado.");
		}


	}//Main
}//Class