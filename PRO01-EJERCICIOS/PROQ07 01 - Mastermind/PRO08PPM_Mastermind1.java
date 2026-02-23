/*
	PROGRAMA:
		PRO08PPM_Mastermind1

	DESCRIPCION:
		Juego Mastermind
		
	MÉTODOS:

	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;
import java.util.Random;

class PRO08PPM_Mastermind1 {
	public static void main(String[] args) {
	


		//Declaraciones
		Scanner sc=new Scanner(System.in);
		int iRandom=(int) (Math.random()*10000);
		String sRandomString=String.valueOf(iRandom);
		String sNumero="";
		
		String sRespuesta="";
		int iIntentos=10;

		//Inicio

		System.out.println();
		System.out.println("--BIENVENIDOS AL MASTERMIND--");
		System.out.println();
		System.out.println("¿Estás preparados para jugar?");
		System.out.println("Si / No");
		sRespuesta=sc.nextLine();


		if (sRespuesta.equals("Si")) {
				
				System.out.println("El número aleatorio es: " + iRandom);
				System.out.println();
			for (int i=0;i<10;i++) {
				int iAciertos=0;
				System.out.print("Dime tu número: ");
				sNumero=sc.nextLine();

				if (sRandomString.charAt(0)==sNumero.charAt(0)) {
					iAciertos++;
					
				}
				if (sRandomString.charAt(1)==sNumero.charAt(1)) {
					iAciertos++;
					
				}
				if (sRandomString.charAt(2)==sNumero.charAt(2)) {
					iAciertos++;
					
				}
				if (sRandomString.charAt(3)==sNumero.charAt(3)) {
					iAciertos++;
					
				}


				if (sRandomString.equals(sNumero)) {
					System.out.println("Enhorabuena, has ganado");
					System.exit(0);
				}
				System.out.println("Tienes " + iAciertos + " aciertos.");
				iIntentos--;
				System.out.println("Te quedan " + iIntentos + " ");
				if (iIntentos==0) {
					System.out.println("Ya no tienes mas intentos. Has perdido.");

				
				}
			}
					
		}else{
		System.out.println("Hasta la próxima.");
		}
		
		
		


















	}//main

}//class