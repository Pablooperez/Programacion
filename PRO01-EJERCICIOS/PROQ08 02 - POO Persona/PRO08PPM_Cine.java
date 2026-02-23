/*
	PROGRAMA:
		PRO08PPM_Cine

	DESCRIPCION:
		
		
	MÉTODOS:
		
		
	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO08PPM_Cine {
	
	public static void main(String[] args) {
		
		//Declaraciones
		//PRO08PPM_Butaca[][] 

		//Scanner sc=new Scanner(System.in);
		//PRO08PPM_Butaca butaca1=new PRO08PPM_Butaca(1,1,"qwer","azul");
		//butaca1.setColor("Azul");
		//System.out.println(butaca1.getColor());
		//butaca1.imprimirDatos();
		//System.out.println();
		//butaca1.reservarButaca("Pablo");
		//butaca1.imprimirDatos();
		//butaca1.bajarButaca();
		//butaca1.imprimirDatos();
		//System.out.println();
		//butaca1.subirButaca();
		//butaca1.imprimirDatos();
		//System.out.println();
		//butaca1.borrarReserva();
		//butaca1.imprimirDatos();
		//System.out.println(butaca1.getColor());
		//System.out.println(butaca1.getModelo());
		//System.out.println(butaca1.isPlegada());
		//System.out.println(butaca1.isReservada());

		//Inicio
		Scanner sc=new Scanner(System.in);
		PRO08PPM_Butaca[][] cineSala01;
		int sala01Fil=0, sala01Col=0;



		//Inicializaciones
		System.out.print("Dime el número de filas de la sala 01: ");
		sala01Fil=sc.nextInt();
		System.out.print("Dime el número de columnas de la sala 01: ");
		sala01Col=sc.nextInt();
		System.out.println();





		//Creación de las butacas. 

		cineSala01=new PRO08PPM_Butaca[sala01Fil][sala01Col];
		for (int i=0;i<sala01Fil;i++) {
			for (int j=0;j<sala01Col;j++) {
				cineSala01[i][j]=new PRO08PPM_Butaca(i+1,j+1);
				
			}
		}//for

		

		//Puesta en marcha del menú
		int iOpcion=0;
		
		do {
			//Menú
			
			System.out.println("*****MENÚ*****");
			System.out.println("1. Reservar butaca.");
			System.out.println("2. Borrar reserva.");
			System.out.println("3. Imprimir datos.");
			System.out.println("4. Dibujar butacas.");
			System.out.println("5. Salir del programa.");
			System.out.println("Selecciona una opción: ");
			iOpcion=sc.nextInt();

			switch (iOpcion){
				case 1: //Crear reserva
					System.out.print("Dime la fila de la butaca: ");
					int i=sc.nextInt();
					System.out.print("Dime la columna de la butaca: ");
					int j=sc.nextInt();
					sc.nextLine();
					System.out.print("Dime el nombre de la reserva: ");
					String sNombre=sc.nextLine();
					System.out.println();
					cineSala01[i-1][j-1].reservarButaca(sNombre);
					break;
				case 2: //Borrar reserva
					System.out.print("Dime la fila de la butaca que deseas borrar: ");
					int ifil=sc.nextInt();
					System.out.print("Dime la columna de la butaca que deseas borrar: ");
					int jcol=sc.nextInt();
					cineSala01[ifil-1][jcol-1].borrarReserva(); 
					break;
				case 3: //Imprimir datos
					for (int iF=0;iF<sala01Fil;iF++) {
						for (int jC=0;jC<sala01Col;jC++) {
							cineSala01[iF][jC].imprimirDatos();
						System.out.println();
						}
					}//for
					break;
				case 4: //Dibujar butacas
					System.out.println();
					System.out.println("SALA");
					for (int iFi=0;iFi<sala01Fil;iFi++) {
						for (int jCo=0;jCo<sala01Col;jCo++) {
							cineSala01[iFi][jCo].dibujarButaca();
						}
					System.out.println();
					}//for
					break;
				case 5:
					System.out.print("Saliendo del programa...");
					break;

			}

		}while(iOpcion!=5);
		System.out.println();


	}

}


