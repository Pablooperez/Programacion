/*
	PROGRAMA:
		PRO00PPM_Ejercicio02

	DESCRIPCION:
		Realiza un programa que solicite por pantalla el tamaño de una matriz bidimensional cuadrada de enteros, que automaticamente
		se rellene con la matriz identidad y por último muestre por pantalla la matriz. Realizar ambos en bucles separados. La matriz
		identidad es aquella que tiene ceros en todas sus posiciones menos en la diagonal que tiene unos.
		
	MÉTODOS:

	AUTOR:
		Pablo Pérez
*/
import java.util.Scanner;

class PRO00PPM_Ejercicio02 {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		int[][] iMatriz;
		int iNum=0;

		//Inicio
		System.out.print("Dime el tamaño de la matriz: ");
		iNum=sc.nextInt();

		iMatriz=new int [iNum][iNum];
		
		for (int fila=0;fila<iMatriz.length;fila++) {
			for (int columna=0;columna<iMatriz[fila].length;columna++) {
				if (fila==columna) {
					iMatriz[fila][columna]=1;
				}else{
					iMatriz[fila][columna]=0;
				}
			}	
		}

		for (int fila=0;fila<iMatriz.length;fila++) {
			for (int columna=0;columna<iMatriz[fila].length;columna++) {
				System.out.print(iMatriz[fila][columna]+"\t");
			}
			System.out.println();
		}

	}//main

}//class