/*
	PROGRAMA:
		PRO08PPM_Ahoracado
/*
	PROGRAMA:
		PRO08PPM_StringPracticar5

	DESCRIPCION:
		Practicar strings y bucles. Pide una palabra y dos letras: una a buscar y otra para reemplazar.
		Muestra la palabra modificada.

	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO08PPM_StringPracticar5 {
	public static void main(String[] args) {

		// Declaraciones
		Scanner sc = new Scanner(System.in);
		String sPalabra = "";
		String sPalabraNueva = "";
		String sLetra1 = "";
		String sLetra2 = "";

		// Inicio
		System.out.print("Dime una palabra: ");
		sPalabra = sc.nextLine();

		System.out.print("Dime una letra de la palabra: ");
		sLetra1 = sc.nextLine();

		System.out.print("Dime una letra para reemplazar la anterior: ");
		sLetra2 = sc.nextLine();

		// Recorremos cada letra de la palabra original
		for (int i = 0; i < sPalabra.length(); i++) {

			char c = sPalabra.charAt(i); // obtenemos la letra actual

			// Si la letra actual es igual a la que queremos reemplazar
			if (c == sLetra1.charAt(0)) {
				sPalabraNueva = sPalabraNueva + sLetra2; // añadimos la letra nueva
			} else {
				sPalabraNueva = sPalabraNueva + c; // añadimos la letra original

			}//Else

		}//For

		// Mostramos la palabra final
		System.out.println("La palabra modificada es: " + sPalabraNueva);

	}//Main
	
}//Class



