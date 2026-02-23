/*
	PROGRAMA:
		PRO08PPM_Actividad03

	DESCRIPCION:
		Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo o negativo. 

	AUTOR:
		Pablo Pérez

	*/

import java.util.Scanner;

class PRO08PPM_Actividad06 {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		float nota1=0; 
		float nota2=0;
		float nota3=0;
		float promedio=0f;
		
		//Inicio
		System.out.print("Introduce la nota 1: ");
		nota1=sc.nextFloat();
		System.out.print("Introduce la nota 2: ");
		nota2=sc.nextFloat();
		System.out.print("Introduce la nota 3: ");
		nota3=sc.nextFloat();

		promedio=((nota1+nota2+nota3)/3);

		System.out.println("Tu nota media es: "+ promedio);

		if (promedio<5) {
			System.out.println("Has obtenido un suspenso. Sigue estudiando.");
		}else{
			if (promedio>=5 && promedio<6) {
				System.out.println("Has obtenido un aprobado. Tu puedes más.");	
			}else{
				if (promedio>=6 && promedio<7) {
					System.out.println("Has obtenido un bien. Confio en tu potencial.");	
				}else{
					if (promedio>=7 && promedio<8) {
						System.out.println("Has obtenido un notable. Muy bien!!!");	
					}else{
						if (promedio>=9 && promedio<=10) {
							System.out.println("Has obtenido un sobresaliente. Enhorabuena!!.");
						}//If
					}//If
				}//If
			}//If
		}//If

	}//Main
}//Class