/*
	PROGRAMA:
		PRO08PPM_DiaSemana

	DESCRIPCION:
		Solicita por pantalla un numero y detecta cuando es divisor de 10
	AUTOR:
		Pablo Pérez

	*/

import java.util.Scanner;
class PRO08PPM_Divisor10 {
	public static void main(String[] args) {

		//Declaraciones
		Scanner teclado = new Scanner(System.in);
		int iNumero = 0;
		

		//Inicio
		System.out.println("Escribe un número: ");
		iNumero=teclado.nextInt();//Darle a la variable el valor escrito por teclado
		int resultado= iNumero%10;//Variable resultado, tiene que ponerse despues de darle el valor de iNumero.

		if (resultado==0) {
			System.out.println("Es divisor de 10");
			
		}else if(resultado!=0){
			System.out.println("No es divisor de 10");

		}//If

	}//Main
	
}//Class