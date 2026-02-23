/*
	PROGRAMA:
		PRO08PPM_mayus

	DESCRIPCION:
		Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
	AUTOR:
		Pablo Pérez

	*/

import java.util.Scanner;

class PRO08PPM_Ejercicio01 {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc=new Scanner(System.in);

		int iContador=1;
		int inota=0;
		int iNotaMenor=0;
		int iNotasMayorIgual=0;


		//Inicio

		while (iContador<=10) {
			System.out.print("Introduce la nota del alumno (" +iContador + "): ");
			inota=sc.nextInt();
			iContador++;
			if (inota>=7) {
				iNotasMayorIgual++;
			} else {
				iNotaMenor++;
			
			}//If

		}//While

		System.out.println("hay " + iNotasMayorIgual + " notas mayores o iguales que 7.");
		System.out.println("Hay " + iNotaMenor + " notas menores que 7.");
		
	}//Main

}//Class