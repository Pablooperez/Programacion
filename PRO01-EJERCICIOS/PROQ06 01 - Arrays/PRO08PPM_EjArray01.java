/*
	PROGRAMA:
		PRO08PPM_EjArray01

	DESCRIPCION:
		Vamos a plantear y resolver un ejercicio: queremos almacenar en una matriz el número de alumnos con el que cuenta una academia, ordenados en función del nivel y del idioma que se estudia. 
		Tendremos 3 filas que representarán al Nivel básico, medio y de perfeccionamiento y 4 columnas en las que figurarán los idiomas (0 = Inglés, 1 = Francés, 2 = Alemán y 3 = Ruso). 
		Se pide realizar la declaración de la matriz y asignarle unos valores de ejemplo a cada elemento.
		
	MÉTODOS:

	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO08PPM_EjArray01 {
	public static void main(String[] args) {
	
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		String[][] academia=new String[4][5];
		

		//Inicio
		

		
	
		for (int i=0;i<academia.length;i++) {
			for (int j=0;j<academia[i].length;j++) {
				academia[i][j]="0";
			}
		}

		academia[0][0]="";
				academia[0][1]="Inglés";
				academia[0][2]="Francés";
				academia[0][3]="Alemán";
				academia[0][4]="Ruso";
				academia[1][0]="Nivel básico";
				academia[2][0]="Nivel medio";
				academia[3][0]="Nivel perfeccionamiento";

		for (int i=0;i<4;i++) {
	
			for (int j=0;j<5;j++) {

				
				System.out.print(academia[i][j]+"\t");


			}//For
				System.out.println();
		}//For












	}//Main

}//Class