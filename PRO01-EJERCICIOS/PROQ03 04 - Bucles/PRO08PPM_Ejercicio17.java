/*
	PROGRAMA:
		PRO08PPM_Ejercicio16

	DESCRIPCION:
		Realiza la carga de 10 valores enteros por teclado. Se desea conocer:
		a. La cantidad de valores ingresados negativos.
		b. La cantidad de valores ingresados positivos.
		c. La cantidad de múltiplos de 15.
		d. El valor acumulado de los números ingresados que son pares
	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO08PPM_Ejercicio17 {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		int iValores=0;
		int iContNega=0;
		int iContPosi=0;
		int iContMulti=0;
		int iPares=0;
		int iContPares=0;

		//Inicio

		for (int i=1;i<=10;i++) {
			System.out.print("Introduce el valor " + i + ": ");
			iValores=sc.nextInt();
			if (iValores<0) {
				iContNega++;
				System.out.println("Es negativo.");
			}else if(iValores>0) {
				iContPosi++;
				System.out.println("Es positivo.");
			}
			if(iValores%15==0) {
				iContMulti++;
				System.out.println("Es múltiplo de 15.");
			}
			if(iValores%2==0) {
				iPares+=iValores;
				iContPares++;
				System.out.println("Es par.");
			}

		}//For

		System.out.println("----------------------------------------------------");
		System.out.println();
		System.out.println("                    RESULTADOS                      ");
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();
		System.out.println("La cantidad de valores negativos es de: " + iContNega);
		System.out.println();
		System.out.println("La cantidad de valores positivos es de: " + iContPosi);
		System.out.println();
		System.out.println("La cantidad de múltiplos de 15 es de: " + iContMulti);
		System.out.println();
		System.out.println("La cantidad de valores pares es de: " + iContPares);
		System.out.println();
		System.out.println("El valor acumulado de pares es de: " + iPares);
		System.out.println();
		System.out.println("----------------------------------------------------");
	
	}//Main

}//Class
