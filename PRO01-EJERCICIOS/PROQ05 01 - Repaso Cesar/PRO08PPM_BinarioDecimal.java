/*
	PROGRAMA:
		PRO08PPM_Binario

	DESCRIPCION:
		Codificación de Decimal a Binario.
		
	MÉTODOS:
	

	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO08PPM_BinarioDecimal {
	public static void main(String[] args) {
	

		//Declaraciones
		Scanner sc=new Scanner(System.in);
		String sBinario="";
		String sBinarioReverse="";
	



		//Inicio
		System.out.println("Dime un número Binario: ");
		sBinario=sc.nextLine();
		for (int i=0;i<sBinario.length();i++) {
			sBinarioReverse=sBinario.charAt(i)+sBinarioReverse;
		}

		int iNumero=0;

		for (int i=0;i<sBinarioReverse.length();i++) {
			
			
				int bit = sBinarioReverse.charAt(i);
				iNumero+=bit*(Math.pow(2,i));
				System.out.println(bit*(Math.pow(2,i)));
				System.out.println("Decimal: " + iNumero);
			}	
		
		

		






	}//Main

}//Class