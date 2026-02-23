/*
	PROGRAMA:
		PRO08PPM_Arrays

	DESCRIPCION:
		Arrays
		
	MÉTODOS:

	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO08PPM_BlocNotas {
	public static void main(String[] args) {
		

		//Declaraciones
		Scanner sc=new Scanner(System.in);
		String[][] sNotas= new String[101][4];
		int iMenu=0;
		int iNota=0;


		//Inicio

		iMenu=menu();
		
			switch (iMenu){
				case 1:
					introducirNota(sNotas);
				case 2:
					solicitarNota(sNotas);
				case 0:
					break;
			}
		
		

		//ImprimirNotas(sNotas);

		sNotas=iniciarVariables(sNotas);
		//System.out.println();
		//ImprimirNotas(sNotas);


	}//Main


	



	private static void ImprimirNotas(String[][] tabla){
		for (int i=0;i<tabla.length;i++) {
			for (int j=0;j<tabla[i].length;j++) {
				System.out.print(tabla[i][j] +"\t");
			}
			System.out.println();
		}
	}

	private static String[][] iniciarVariables(String[][] tabla){
		tabla[0][0]="Núm";
		tabla[0][1]="Usuario";
		tabla[0][2]="Título";
		tabla[0][3]="Nota";
		
		for (int i=1;i<tabla.length;i++) {
			tabla[i][0]=String.valueOf(i);
		}

		return tabla;
	}

	public static int menu(){
	Scanner sc=new Scanner(System.in);
	int iMenu;

	System.out.println("----------MENÚ----------");
	System.out.println("Selecciona una opción:");
	System.out.println("1. Ingresar nota.");
	System.out.println("2. Solicitar nota.");
	System.out.println("0. Salir.");
	System.out.println("------------------------");

	iMenu=sc.nextInt();
	return iMenu;
	}

	public static String introducirNota(String[][] tabla){
		Scanner sc=new Scanner(System.in);
		String sUsuario=" ";
		String sTitulo=" ";
		String sNota=" ";
		System.out.println("Inserta Usuario: ");
		sUsuario=sc.nextLine();
		for (int i=1;i<tabla.length;i++) {
			tabla[1][1]=sUsuario;
		}
		System.out.println("Insert un título: ");
		sTitulo=sc.nextLine();
		for (int j=1;j<tabla.length;j++) {
			tabla[1][2]=sTitulo;
		}
		System.out.println("Introduce la nota: ");
		sNota=sc.nextLine();
		for (int x=1;x<tabla.length;x++) {
			tabla[1][3]=sNota;
		}
		System.out.println("Nota introducida correctamente.");
		return sUsuario+sTitulo+sNota;
	
	}

	public static void solicitarNota(String[][] tabla){
		Scanner sc=new Scanner(System.in);
		int iNumNota;
		System.out.println("¿Que nota deseas ver:? ");
		iNumNota=sc.nextInt();
		System.out.println(tabla[iNumNota]);
		
	}

		


}//Class