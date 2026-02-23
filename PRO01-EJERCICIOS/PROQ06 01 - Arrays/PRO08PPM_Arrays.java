/*
	PROGRAMA:
		PRO08PPM_Arrays

	DESCRIPCION:
		Arrays
		
	MÉTODOS:

	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO08PPM_Arrays {
	public static void main(String[] args) {
	
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		int[] miArrayEnteros = new int[50];
		int[] contadores;
		int longitud=0;
		int[][] tablero=new int[10][10];
		//Inicio

		//System.out.println("Hola mundo");
		//System.out.println("De cuanto quieres el array de enteros aleatorios?: ");
		//longitud=sc.nextInt();
        //contadores=new int[longitud];

		//for (int i=0;i<longitud;i++) {
		//	contadores[i]=(int)(Math.random()*100);
		//	System.out.println(i + " " + contadores[i]);
//
		//}//for

		//contadores[4]=12343;

		//System.out.println("-------------------------------------");

		//for (int i=0;i<contadores.length;i++) {
		//	System.out.println(i + " " + contadores[i]);
		
		//}//for

		//Array Bidimensional
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				System.out.print(tablero[i][j]+" ");
			}
			System.out.println();
		}








	}//Main

}//Class