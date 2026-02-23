/*
	PROGRAMA:
		PRO08PPM_Ejercicio16

	DESCRIPCION:
		Escribir un programa que pida ingresar coordenadas (x,y) que representan puntos en el
		plano. Informar cuántos puntos se han ingresado en el primer, segundo, tercer y cuarto
		cuadrante. Al comenzar el programa se pide que se ingrese la cantidad de puntos a procesar.
	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO08PPM_Ejercicio16 {
	public static void main(String[] args) {
		
		// Declaraciones
		Scanner sc = new Scanner(System.in);
		int ix = 0;
		int iy = 0;
		int ipuntos = 0;
		int iEje1 = 0;
		int iEje2 = 0;
		int iEje3 = 0;
		int iEje4 = 0;
		int iEjes = 0;

		// Inicio
		System.out.print("¿Cuántos puntos quieres procesar? ");
		ipuntos = sc.nextInt();

		for (int i = 1; i <= ipuntos; i++) {
			System.out.println("\nPunto " + i);
			System.out.println();
			System.out.print("Ingresa la coordenada X: ");
			ix = sc.nextInt();
			System.out.print("Ingresa la coordenada Y: ");
			iy = sc.nextInt();

			if (ix > 0 && iy < 0) {
				System.out.println();
				System.out.println("Pertenece al Cuadrante 1.");	
				iEje1++;	
			} else if (ix < 0 && iy > 0) {
				System.out.println();
				System.out.println("Pertenece al Cuadrante 2.");
				iEje2++;
			} else if (ix < 0 && iy < 0) {
				System.out.println();
				System.out.println("Pertenece al Cuadrante 3.");
				iEje3++;
			} else if (ix > 0 && iy < 0) {
				System.out.println();
				System.out.println("Pertenece al Cuadrante 4.");
				iEje4++;
			} else {
				System.out.println();
				System.out.println("Pertenece a los Ejes.");
				iEjes++; // puntos sobre los ejes
			}

		}//For

		// Resultados (fuera del bucle)
		System.out.println("\n--- RESULTADOS ---");
		System.out.println();
		System.out.println("Puntos en el Primer cuadrante: " + iEje1);
		System.out.println("Puntos en el Segundo cuadrante: " + iEje2);
		System.out.println("Puntos en el Tercer cuadrante: " + iEje3);
		System.out.println("Puntos en el Cuarto cuadrante: " + iEje4);
		System.out.println("Puntos sobre los ejes: " + iEjes);

	}//Main

}//Class
