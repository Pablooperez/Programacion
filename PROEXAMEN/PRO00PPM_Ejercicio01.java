/*
	PROGRAMA:
		PRO00PPM_Ejercicio01

	DESCRIPCION:
		Escribir un programa que muestre eco de todo lo que el usuario introduzca hasta que el usuario escribar "salir" que terminará.
		
	MÉTODOS:

	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO00PPM_Ejercicio01 {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		String sTexto="";
		String sSalida="salir";


		System.out.print("Escribe todo lo que quieras: ");
		while (!sTexto.equals(sSalida)) {
			sTexto=sc.nextLine();
			System.out.println(sTexto);
			if (sTexto.equals(sSalida)) {
				System.exit(0);
			
			}//If

		}//While
		
	}//Main

}//Class