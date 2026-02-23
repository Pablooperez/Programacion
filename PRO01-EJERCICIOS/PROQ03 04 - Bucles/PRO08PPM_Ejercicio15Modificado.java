/*
	PROGRAMA:
		PRO08PPM_mayus

	DESCRIPCION:
		Realizar un programa que lea los lados de n triángulos, e informar:
		a. De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales), isósceles (dos lados iguales), o escaleno (ningún lado igual)
		b. Cantidad de triángulos de cada tipo.
		c. Tipo de triángulo que posee menor cantidad.
		Si uno de los lados es negativo, tiene que terminar
	AUTOR:
		Pablo Pérez

	*/

import java.util.Scanner;

class PRO08PPM_Ejercicio15Modificado {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		int iNumTriangulos=0;
		int i1=0, i2=0, i3=0;
		int iContEqui=0, iContIsos=0, iContEsca=0;


		//Inicio
		System.out.println("¿Cuantos triangulos quieres analizar?");
		iNumTriangulos=sc.nextInt();
		System.out.println("");

		for (int i=1;i<=iNumTriangulos; i++) {
			System.out.println("Triángulo " + i);
			System.out.println("");
			System.out.print("Dime el lado 1: ");
			i1=sc.nextInt();
			if (i1<0) {
				System.exit(0);
			}
			System.out.print("Dime el lado 2: ");
			i2=sc.nextInt();
			if (i2<0) {
				System.exit(0);
			}
			System.out.print("Dime el lado 3: ");
			i3=sc.nextInt();
			if (i3<0) {
				System.exit(0);
			}
			System.out.println("");

			if (i1==i2&&i2==i3) {
				iContEqui++;
				System.out.println("Triángulo equilatero");
				System.out.println("");
				
			}else if (i1==i2||i1==i3||i2==i3) {
				iContIsos++;
				System.out.println("Triángulo Isósceles");
				System.out.println("");

			}else{
				iContEsca++;
				System.out.println("Triángulo Escaleno");
				System.out.println("");
				
			}
		}	

		//Resultados finales
		System.out.println("El número de triangulos es: " + iNumTriangulos);
		System.out.println("");
		System.out.println("El número de Equiláteros es: " + iContEqui);
		System.out.println("");
		System.out.println("El número de Isósceles es: " + iContIsos);
		System.out.println("");
		System.out.println("El número de Escalenos es: " + iContEsca);
						
		if (iContEqui<iContEsca&&iContEqui<iContIsos) {
			System.out.println("-------------------------------------------------------");
			System.out.println("El triángulo Equilátero es el que menor cantidad tiene.");
			System.out.println("-------------------------------------------------------");
			System.out.println();
		} else if (iContIsos<iContEqui&&iContIsos<iContEsca) {
			System.out.println("------------------------------------------------------");
			System.out.println("El triángulo Isósceles es el que menor cantidad tiene.");
			System.out.println("------------------------------------------------------");
			System.out.println();
		}else if (iContEsca<iContEqui&&iContEsca<iContIsos) {
			System.out.println("----------------------------------------------------");
			System.out.println("El triángulo Escaleno es el que menor cantidad tiene");
			System.out.println("----------------------------------------------------");	
			System.out.println();
		} else {
			System.out.println("-----------------------------------------------");
			System.out.println("Hay empate entre dos o más tipos de triángulos.");
			System.out.println("-----------------------------------------------");
			System.out.println();
		}

	}//Main

}//Class
