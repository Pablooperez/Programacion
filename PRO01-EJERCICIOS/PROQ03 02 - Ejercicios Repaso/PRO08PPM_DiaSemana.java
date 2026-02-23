/*
	PROGRAMA:
		PRO08PPM_DiaSemana

	DESCRIPCION:
		Solicita por pantalla un dia del 1 al 7 y escribir el dia de la semana.

	AUTOR:
		Pablo Pérez

	*/

import java.util.Scanner;
class PRO08PPM_DiaSemana {
	public static void main(String[] args) {
		

		//Declaraciones
		Scanner sc=new Scanner(System.in);
		int iDia=0;//Variable

		//Inicio
		
		//Pedir introducir dia
		System.out.println("Escribe un dia del 1 al 7: ");
		iDia=sc.nextInt();//La variable iDia pasa a tener el valor del teclado

		//Escribe dia
		switch	(iDia) {//Ubicamos dentro la variable
			case 1:
				System.out.println("Dia de la semana: Lunes");
				break;
			case 2:
				System.out.println("Dia de la semana: Martes");
				break;
			case 3:
				System.out.println("Dia de la semana: Miércoles");
				break;
			case 4:
				System.out.println("Dia de la semana: Jueves");
				break;
			case 5:
				System.out.println("Dia de la semana: Viernes");
				break;
			case 6:
				System.out.println("Dia de la semana: Sábado");
				break;
			case 7:
				System.out.println("Dia de la semana: Domingo");
				break;
			default:
				System.out.println("ERROR");

		}//Switch

	}//Main

}//Class