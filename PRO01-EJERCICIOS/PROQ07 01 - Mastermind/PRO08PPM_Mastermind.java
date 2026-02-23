/*
	PROGRAMA:
		PRO08PPM_Mastermind

	DESCRIPCION:
		Juego Mastermind
		
	MÉTODOS:

	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;
import java.util.Random;

class PRO08PPM_Mastermind {
	public static void main(String[] args) {
	
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		int[][] sTablero=new int[11][9];


		//Inicio

		//presentacion();
		sTablero=iniciarlizarTablero(sTablero);
		System.out.println();
		
		System.out.println();
		cargarDatos(sTablero);
		mostrarTablero(sTablero);
		tiradas(sTablero);
		mostrarTablero(sTablero);
		
		
		

	}//Main

	public static void presentacion(){

		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("--BIENVENIDOS AL MASTERMIND--");
		System.out.println();
		System.out.println("¿Estais preparados para jugar?");

	}//Presentacion

	public static int[][] iniciarlizarTablero(int[][] tablero){
		for (int i=1;i<tablero.length;i++) {
			
			for (int j=1;j<tablero[i].length;j++) {
				tablero[i][0]=i;
				tablero[i][j]=0;
			}
	
		}
		return tablero;
	}//iniciarlizartablero

	public static void mostrarTablero(int[][] tablero){
		for (int i=0;i<tablero.length;i++) {
			
			for (int j=0;j<tablero[i].length;j++) {

				System.out.print(tablero[i][j]+"\t");
				
			}
			System.out.println();
		}
	}

	public static int[][] cargarDatos(int[][] tablero){
	
		tablero[0][1]=(int)(Math.random()*10);
		tablero[0][2]=(int)(Math.random()*10);
		tablero[0][3]=(int)(Math.random()*10);
		tablero[0][4]=(int)(Math.random()*10);
	 return tablero;
	}

	public static int[][] tiradas(int[][] tablero){
		Scanner sc=new Scanner(System.in);
		System.out.print("Dime tu primer dígito: ");
		tablero[1][1]=sc.nextInt();
		System.out.print("Dime tu segundo dígito: ");
		tablero[1][2]=sc.nextInt();
		System.out.print("Dime tu tercero dígito: ");
		tablero[1][3]=sc.nextInt();
		System.out.print("Dime tu cuarto dígito: ");
		tablero[1][4]=sc.nextInt();
		return tablero;
	}


}//Class