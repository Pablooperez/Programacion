/*
	PROGRAMA:
		PRO08PPM_DiaSemana

	DESCRIPCION:
		Programa que lea la temperatura en centígrados del día e imprima el tipo de clima de acuerdo a la siguiente tabla.
	AUTOR:
		Pablo Pérez

	*/

import java.util.Scanner;
class PRO08PPM_Clima {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner teclado=new Scanner(System.in);
		int itemperatura=0;

		//Inicio
		System.out.println("Introduce la temperatura en centígrados: ");
		itemperatura=teclado.nextInt();

		if (itemperatura<=10) {
			System.out.println("El clima es fío");
		}else if(itemperatura>10&&itemperatura<=20){
			System.out.println("El clima es nublado");
		}else if (itemperatura>20&&itemperatura<=30){
			System.out.println("El clima es caluroso");
		}else if (itemperatura>30){
			System.out.println("El clima es tropical");
		}//If

	}//Main

}//Class
