/*
	PROGRAMA:
		PRO08PPM_mayus

	DESCRIPCION:
		Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc. (No se ingresan valores por teclado)
	AUTOR:
		Pablo Pérez

	*/

import java.util.Scanner;

class PRO08PPM_Ejercicio04 {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc= new Scanner(System.in);
		int i11=11;
		int iserie11=0;
		int icontador=1;

		System.out.println("Los 25 términos de la serie 11 son:");
		//Inicio
		while (icontador<=25) {
			iserie11+=i11;
			System.out.println("Término: " + icontador + " -->: " + iserie11);
			icontador++;

		}//While

	}//Main

}//Class