/*
	PROGRAMA:
		PRO08PPM_Actividad03

	DESCRIPCION:
		Tres En Raya

	AUTOR:
		Pablo Pérez

	*/

import java.util.Scanner;

class PRO08PPM_TresEnRaya  {
	public static void main(String[] args) {
		//Declaraciones
		Scanner teclado=new Scanner(System.in);
		char c1='1',c2='2',c3='3';
		char c4='4',c5='5',c6='6';
		char c7='7',c8='8',c9='9';
		char celdaSeleccionada=' ';
		//Inicio
		System.out.println();
		System.out.println("-------------");
		System.out.println("| "+c1+" | "+c2+" | "+c3+" |");
		System.out.println("-------------");
		System.out.println("| "+c4+" | "+c5+" | "+c6+" |");
		System.out.println("-------------");
		System.out.println("| "+c7+" | "+c8+" | "+c9+" |");
		System.out.println("-------------");

		//Primera tirada
		System.out.print("Selecciona celda para valor X:");
		celdaSeleccionada=teclado.nextLine().charAt(0);//En esta secuencia de IFs tiene que chequear todos los IFs.
		if (celdaSeleccionada==c1){c1='X';}
		if (celdaSeleccionada==c2){c2='X';}
		if (celdaSeleccionada==c3){c3='X';}
		if (celdaSeleccionada==c4){c4='X';}	
		if (celdaSeleccionada==c5){c5='X';}
		if (celdaSeleccionada==c6){c6='X';}
		if (celdaSeleccionada==c7){c7='X';}
		if (celdaSeleccionada==c8){c8='X';}
		if (celdaSeleccionada==c9){c9='X';}

		//Imprimimos tablero vacio
		System.out.println();
		System.out.println("-------------");
		System.out.println("| "+c1+" | "+c2+" | "+c3+" |");
		System.out.println("-------------");
		System.out.println("| "+c4+" | "+c5+" | "+c6+" |");
		System.out.println("-------------");
		System.out.println("| "+c7+" | "+c8+" | "+c9+" |");
		System.out.println("-------------");


		System.out.println();
		System.out.println("*** FIN ***");

		//Segunda tirada
		System.out.print("Selecciona celda para valor O: ");
		celdaSeleccionada=teclado.nextLine().charAt(0);//En esta secuencia de IFs tiene que chequear hasta que uno de ellos se ejecute, entonces luego ya no hace más.
		if (celdaSeleccionada==c1){
			c1='O';
		}else if (celdaSeleccionada==c2){
			c2='O';
		}else if (celdaSeleccionada==c3){
			c3='O';
		}else if (celdaSeleccionada==c4){
			c4='O';
		}else if (celdaSeleccionada==c5){
			c5='O';
		}else if (celdaSeleccionada==c6){
			c6='O';
		}else if (celdaSeleccionada==c7){
			c7='O';
		}else if (celdaSeleccionada==c8){
			c8='O';
		}else {
			c9='O';
		}

		//Imprimimos tablero vacio
		System.out.println();
		System.out.println("-------------");
		System.out.println("| "+c1+" | "+c2+" | "+c3+" |");
		System.out.println("-------------");
		System.out.println("| "+c4+" | "+c5+" | "+c6+" |");
		System.out.println("-------------");
		System.out.println("| "+c7+" | "+c8+" | "+c9+" |");
		System.out.println("-------------");


		System.out.println();
		System.out.println("*** FIN ***");


		//Tercera tirada
		System.out.print("Selecciona celda para valor X: ");
		celdaSeleccionada=teclado.nextLine().charAt(0);


		switch (celdaSeleccionada) {
			case '1':
				c1='X';
				break;
			case '2':
				c2='X';
				break;
			case '3':
				c3='X';
				break;
			case '4':
				c4='X';
				break;
			case '5':
				c5='X';
				break;
			case '6':
				c6='X';
				break;
			case '7':
				c7='X';
				break;
			case '8':
				c8='X';
				break;
			case '9':
				c9='X';
				break;
			default:
				System.out.println("Grand ERROR");
		}//Switch


			//Imprimimos tablero vacio
		System.out.println();
		System.out.println("-------------");
		System.out.println("| "+c1+" | "+c2+" | "+c3+" |");
		System.out.println("-------------");
		System.out.println("| "+c4+" | "+c5+" | "+c6+" |");
		System.out.println("-------------");
		System.out.println("| "+c7+" | "+c8+" | "+c9+" |");
		System.out.println("-------------");


		System.out.println();
		System.out.println("*** FIN ***");

		//Cuarta tirada

		System.out.print("Selecciona celda para valor O: ");
		celdaSeleccionada=teclado.nextLine().charAt(0);


		switch (celdaSeleccionada) {
			case '1':
				c1='O';
				break;
			case '2':
				c2='O';
				break;
			case '3':
				c3='O';
				break;
			case '4':
				c4='O';
				break;
			case '5':
				c5='O';
				break;
			case '6':
				c6='O';
				break;
			case '7':
				c7='O';
				break;
			case '8':
				c8='O';
				break;
			case '9':
				c9='O';
				break;
			default:
				System.out.println("Grand ERROR");
		}//Switch

		//Imprimimos tablero vacio
		System.out.println();
		System.out.println("-------------");
		System.out.println("| "+c1+" | "+c2+" | "+c3+" |");
		System.out.println("-------------");
		System.out.println("| "+c4+" | "+c5+" | "+c6+" |");
		System.out.println("-------------");
		System.out.println("| "+c7+" | "+c8+" | "+c9+" |");
		System.out.println("-------------");


		System.out.println();
		System.out.println("*** FIN ***");

		//Quinta tirada

		System.out.print("Selecciona celda para valor X: ");
		celdaSeleccionada=teclado.nextLine().charAt(0);


		switch (celdaSeleccionada) {
			case '1':
				c1='X';
				break;
			case '2':
				c2='X';
				break;
			case '3':
				c3='X';
				break;
			case '4':
				c4='X';
				break;
			case '5':
				c5='X';
				break;
			case '6':
				c6='X';
				break;
			case '7':
				c7='X';
				break;
			case '8':
				c8='X';
				break;
			case '9':
				c9='X';
				break;
			default:
				System.out.println("Grand ERROR");
		}//Switch



		//Imprimimos tablero vacio
		System.out.println();
		System.out.println("-------------");
		System.out.println("| "+c1+" | "+c2+" | "+c3+" |");
		System.out.println("-------------");
		System.out.println("| "+c4+" | "+c5+" | "+c6+" |");
		System.out.println("-------------");
		System.out.println("| "+c7+" | "+c8+" | "+c9+" |");
		System.out.println("-------------");


		System.out.println();
		System.out.println("*** FIN ***");

		//Verificación de tres en raya
		if (c1==c2&&c1==c3){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c4==c5&&c4==c6){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c7==c8&&c7==c9){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c1==c4&&c1==c7){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c2==c5&&c2==c8){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c3==c6&&c3==c9){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c1==c5&&c1==c9){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c7==c5&&c7==c3){
			System.out.println("HAS GANADO");
			System.exit(0);
		};

		//Sexta Tirada

		System.out.print("Selecciona celda para valor O: ");
		celdaSeleccionada=teclado.nextLine().charAt(0);


		switch (celdaSeleccionada) {
			case '1':
				c1='O';
				break;
			case '2':
				c2='O';
				break;
			case '3':
				c3='O';
				break;
			case '4':
				c4='O';
				break;
			case '5':
				c5='O';
				break;
			case '6':
				c6='O';
				break;
			case '7':
				c7='O';
				break;
			case '8':
				c8='O';
				break;
			case '9':
				c9='O';
				break;
			default:
				System.out.println("GRAND ERROR");
		}//Switch



		//Imprimimos tablero vacio
		System.out.println();
		System.out.println("-------------");
		System.out.println("| "+c1+" | "+c2+" | "+c3+" |");
		System.out.println("-------------");
		System.out.println("| "+c4+" | "+c5+" | "+c6+" |");
		System.out.println("-------------");
		System.out.println("| "+c7+" | "+c8+" | "+c9+" |");
		System.out.println("-------------");


		System.out.println();
		System.out.println("*** FIN ***");

		//Verificación de tres en raya
		if (c1==c2&&c1==c3){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c4==c5&&c4==c6){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c7==c8&&c7==c9){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c1==c4&&c1==c7){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c2==c5&&c2==c8){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c3==c6&&c3==c9){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c1==c5&&c1==c9){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c7==c5&&c7==c3){
			System.out.println("HAS GANADO");
			System.exit(0);
		};

		//Séptima tirada

		System.out.print("Selecciona celda para valor X: ");
		celdaSeleccionada=teclado.nextLine().charAt(0);


		switch (celdaSeleccionada) {
			case '1':
				c1='X';
				break;
			case '2':
				c2='X';
				break;
			case '3':
				c3='X';
				break;
			case '4':
				c4='X';
				break;
			case '5':
				c5='X';
				break;
			case '6':
				c6='X';
				break;
			case '7':
				c7='X';
				break;
			case '8':
				c8='X';
				break;
			case '9':
				c9='X';
				break;
			default:
				System.out.println("Grand ERROR");
		}//Switch



		//Imprimimos tablero vacio
		System.out.println();
		System.out.println("-------------");
		System.out.println("| "+c1+" | "+c2+" | "+c3+" |");
		System.out.println("-------------");
		System.out.println("| "+c4+" | "+c5+" | "+c6+" |");
		System.out.println("-------------");
		System.out.println("| "+c7+" | "+c8+" | "+c9+" |");
		System.out.println("-------------");


		System.out.println();
		System.out.println("*** FIN ***");

		//Verificación de tres en raya
		if (c1==c2&&c1==c3){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c4==c5&&c4==c6){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c7==c8&&c7==c9){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c1==c4&&c1==c7){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c2==c5&&c2==c8){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c3==c6&&c3==c9){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c1==c5&&c1==c9){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c7==c5&&c7==c3){
			System.out.println("HAS GANADO");
			System.exit(0);
		};

		//Octava tirada

		System.out.print("Selecciona celda para valor O: ");
		celdaSeleccionada=teclado.nextLine().charAt(0);


		switch (celdaSeleccionada) {
			case '1':
				c1='O';
				break;
			case '2':
				c2='O';
				break;
			case '3':
				c3='O';
				break;
			case '4':
				c4='O';
				break;
			case '5':
				c5='O';
				break;
			case '6':
				c6='O';
				break;
			case '7':
				c7='O';
				break;
			case '8':
				c8='O';
				break;
			case '9':
				c9='O';
				break;
			default:
				System.out.println("Grand ERROR");
		}//Switch



		//Imprimimos tablero vacio
		System.out.println();
		System.out.println("-------------");
		System.out.println("| "+c1+" | "+c2+" | "+c3+" |");
		System.out.println("-------------");
		System.out.println("| "+c4+" | "+c5+" | "+c6+" |");
		System.out.println("-------------");
		System.out.println("| "+c7+" | "+c8+" | "+c9+" |");
		System.out.println("-------------");


		System.out.println();
		System.out.println("*** FIN ***");

		//Verificación de tres en raya
		if (c1==c2&&c1==c3){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c4==c5&&c4==c6){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c7==c8&&c7==c9){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c1==c4&&c1==c7){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c2==c5&&c2==c8){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c3==c6&&c3==c9){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c1==c5&&c1==c9){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c7==c5&&c7==c3){
			System.out.println("HAS GANADO");
			System.exit(0);
		};

		//Novena tirada

		System.out.print("Selecciona celda para valor X: ");
		celdaSeleccionada=teclado.nextLine().charAt(0);


		switch (celdaSeleccionada) {
			case '1':
				c1='X';
				break;
			case '2':
				c2='X';
				break;
			case '3':
				c3='X';
				break;
			case '4':
				c4='X';
				break;
			case '5':
				c5='X';
				break;
			case '6':
				c6='X';
				break;
			case '7':
				c7='X';
				break;
			case '8':
				c8='X';
				break;
			case '9':
				c9='X';
				break;
			default:
				System.out.println("Grand ERROR");
		}//Switch



		//Imprimimos tablero vacio
		System.out.println();
		System.out.println("-------------");
		System.out.println("| "+c1+" | "+c2+" | "+c3+" |");
		System.out.println("-------------");
		System.out.println("| "+c4+" | "+c5+" | "+c6+" |");
		System.out.println("-------------");
		System.out.println("| "+c7+" | "+c8+" | "+c9+" |");
		System.out.println("-------------");


		System.out.println();
		System.out.println("*** FIN ***");

		//Verificación de tres en raya
		if (c1==c2&&c1==c3){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c4==c5&&c4==c6){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c7==c8&&c7==c9){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c1==c4&&c1==c7){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c2==c5&&c2==c8){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c3==c6&&c3==c9){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c1==c5&&c1==c9){
			System.out.println("HAS GANADO");
			System.exit(0);
		}else if (c7==c5&&c7==c3){
			System.out.println("HAS GANADO");
			System.exit(0);
		};


		
	}//main
}//class