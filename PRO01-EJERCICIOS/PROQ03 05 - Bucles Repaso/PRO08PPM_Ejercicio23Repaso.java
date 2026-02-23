/*
	PROGRAMA:
		PRO08PPM_Ejercicio23Repaso

	DESCRIPCION:
		Realiza un programa que dado un número te calcule cuantos 
		números perfectos hay entre 0 y el numero dado. 

	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO08PPM_Ejercicio23Repaso {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		int iNumero=0;
		int iContadorNumerosPerfectos=0;

		//Inicio
		System.out.println("Dime un número: ");
		iNumero=sc.nextInt();

		System.out.println("Los números perfectos que hay entre 0 y " + iNumero +" son: ");
		for (int i=1;i<=iNumero;i++) {

			int iSumaDivisores=0;

			for (int x=1;x<i;x++) {
				if (i%x==0) {
					iSumaDivisores=iSumaDivisores+x;
				}//If

			}//for

			if (iSumaDivisores==i) {
					System.out.println("--> "+ i);
					iContadorNumerosPerfectos++;
				}//if

		}//for

		if (iContadorNumerosPerfectos>1) {
			System.out.println("Tenemos un total de " + iContadorNumerosPerfectos + " números perfectos.");

		}else if (iContadorNumerosPerfectos<=1) {
			System.out.println("Tenemos un total de " + iContadorNumerosPerfectos + " número perfecto.");
			
		}//Else If
		
	}//Main

}//Class