/*
	PROGRAMA:
		PRO08PPM_TresEnRayaBucle

	DESCRIPCION:
		Tres En Raya

	AUTOR:
		Pablo Pérez

	*/

import java.util.Scanner;

class PRO08PPM_TresEnRayaBucle {
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

		//Tiradas
		for (int i=1;i<=9;i++) {
			if (i==1||i==3||i==5||i==7||i==9) {
				
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

				if (c1==c2&&c1==c3){
					System.out.println();
					System.out.println("HAS GANADO");
					System.out.println();
					System.out.println("*** FIN ***");
					System.out.println();
					System.exit(0);
				}else if (c4==c5&&c4==c6){
					System.out.println();
					System.out.println("HAS GANADO");
					System.out.println();
					System.out.println("*** FIN ***");
					System.out.println();
					System.exit(0);
				}else if (c7==c8&&c7==c9){
					System.out.println();
					System.out.println("HAS GANADO");
					System.out.println();
					System.out.println("*** FIN ***");
					System.out.println();
					System.exit(0);
				}else if (c1==c4&&c1==c7){
					System.out.println();
					System.out.println("HAS GANADO");
					System.out.println();
					System.out.println("*** FIN ***");
					System.out.println();
					System.exit(0);
				}else if (c2==c5&&c2==c8){
					System.out.println();
					System.out.println("HAS GANADO");
					System.out.println();
					System.out.println("*** FIN ***");
					System.out.println();
					System.exit(0);
				}else if (c3==c6&&c3==c9){
					System.out.println();
					System.out.println("HAS GANADO");
					System.out.println();
					System.out.println("*** FIN ***");
					System.out.println();
					System.exit(0);
				}else if (c1==c5&&c1==c9){
					System.out.println();
					System.out.println("HAS GANADO");
					System.out.println();
					System.out.println("*** FIN ***");
					System.out.println();
					System.exit(0);
				}else if (c7==c5&&c7==c3){
					System.out.println();
					System.out.println("HAS GANADO");
					System.out.println();
					System.out.println("*** FIN ***");
					System.out.println();
					System.exit(0);
				};

			}else if (i==2||i==4||i==6||i==8) {

				System.out.print("Selecciona celda para valor O:");
				celdaSeleccionada=teclado.nextLine().charAt(0);//En esta secuencia de IFs tiene que chequear todos los IFs.
				if (celdaSeleccionada==c1){c1='O';}
				if (celdaSeleccionada==c2){c2='O';}
				if (celdaSeleccionada==c3){c3='O';}
				if (celdaSeleccionada==c4){c4='O';}	
				if (celdaSeleccionada==c5){c5='O';}
				if (celdaSeleccionada==c6){c6='O';}
				if (celdaSeleccionada==c7){c7='O';}
				if (celdaSeleccionada==c8){c8='O';}
				if (celdaSeleccionada==c9){c9='O';}

				//Imprimimos tablero vacio
				System.out.println();
				System.out.println("-------------");
				System.out.println("| "+c1+" | "+c2+" | "+c3+" |");
				System.out.println("-------------");
				System.out.println("| "+c4+" | "+c5+" | "+c6+" |");
				System.out.println("-------------");
				System.out.println("| "+c7+" | "+c8+" | "+c9+" |");
				System.out.println("-------------");

				if (c1==c2&&c1==c3){
					System.out.println();
					System.out.println("HAS GANADO");
					System.out.println();
					System.out.println("*** FIN ***");
					System.out.println();
					System.exit(0);
				}else if (c4==c5&&c4==c6){
					System.out.println();
					System.out.println("HAS GANADO");
					System.out.println();
					System.out.println("*** FIN ***");
					System.out.println();
					System.exit(0);
				}else if (c7==c8&&c7==c9){
					System.out.println();
					System.out.println("HAS GANADO");
					System.out.println();
					System.out.println("*** FIN ***");
					System.out.println();
					System.exit(0);
				}else if (c1==c4&&c1==c7){
					System.out.println();
					System.out.println("HAS GANADO");
					System.out.println();
					System.out.println("*** FIN ***");
					System.out.println();
					System.exit(0);
				}else if (c2==c5&&c2==c8){
					System.out.println();
					System.out.println("HAS GANADO");
					System.out.println();
					System.out.println("*** FIN ***");
					System.out.println();
					System.exit(0);
				}else if (c3==c6&&c3==c9){
					System.out.println();
					System.out.println("HAS GANADO");
					System.out.println();
					System.out.println("*** FIN ***");
					System.out.println();
					System.exit(0);
				}else if (c1==c5&&c1==c9){
					System.out.println();
					System.out.println("HAS GANADO");
					System.out.println();
					System.out.println("*** FIN ***");
					System.out.println();
					System.exit(0);
				}else if (c7==c5&&c7==c3){
					System.out.println();
					System.out.println("HAS GANADO");
					System.out.println();
					System.out.println("*** FIN ***");
					System.out.println();

					System.exit(0);
				};
					
			}//Else If


		}//For

		System.out.println();
		System.out.println("*** FIN ***");
		

	}//Main

}//Class