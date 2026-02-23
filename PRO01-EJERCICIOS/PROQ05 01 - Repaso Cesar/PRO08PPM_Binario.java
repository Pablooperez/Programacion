/*
	PROGRAMA:
		PRO08PPM_Binario

	DESCRIPCION:
		Codificación a Binario.
		
	MÉTODOS:
		public static void main(String[] args) {
		public static int solicitarNumero()
		public static String codifica(int iNumero, int iResto, String sBinario)

	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO08PPM_Binario {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		int iNumero=0;
		int iResto=0;
		String sBinario="";
	
		//Inicio
		iNumero=solicitarNumero();
		
		System.out.println("El binario es: "+codifica(iNumero,iResto,sBinario));


	}//Main

	public static int solicitarNumero(){
		Scanner sc=new Scanner(System.in);
		int iNumero;

		System.out.println("Escribe un número: ");
		iNumero=sc.nextInt();
		return iNumero;
	}

	public static String codifica(int iNumero, int iResto, String sBinario){
		while(iNumero>0) {
			iResto=iNumero%2;
			sBinario= iResto+sBinario;
			iNumero=iNumero/2;
		}

		return sBinario;
	}

	
}//Class