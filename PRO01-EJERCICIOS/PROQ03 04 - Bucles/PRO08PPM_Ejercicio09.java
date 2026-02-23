/*
	PROGRAMA:
		PRO08PPM_mayus

	DESCRIPCION:
		En un banco se procesan datos de las cuentas corrientes de sus clientes.
		De cada cuenta corriente se conoce: Nombre, Apellidos y CCC (número de cuenta),
		datos que introducirá el usuario. El salado parte de 0 y se va calculado mientras
		se van introduciendo ingresos y gastos con un bucle, el cual finalizar al ingresar
		un valor de importe 0, lo que provocará la impresión de los daros de la cuenta,
		(Nombre, Apellidos, CCC e importe. Una vez mostrada la información, preguntará
		al usuario si quiere calcular el estado de otra cuenta contestando este con s/n.

		Introduce tu nombre: --------
		Introduce tus apellidos: --------
		Introduce tu CCC: ES 62 9999 1234 96 1234567890
		nº cuenta: ES 62 9999 1234 96 1234567890
		Nombre: --------
		Apellidos: --------
		CCC: ES 62 9999 1234 96 1234567890
		Importe: 21.345€
	AUTOR:
		Pablo Pérez

	*/

import java.util.Scanner;

class PRO08PPM_Ejercicio09 {
	public static void main(String[] args) {

		//Declaraciones
		Scanner sc= new Scanner(System.in);
		String sNombre="", sApellidos="";
		String sCuenta="";
		float fsaldo=0;
		float fimporte=0;

		//Inicio
		System.out.println("Introduce tu nombre: ");
		sNombre=sc.nextLine();
		System.out.println("Introduce tus apellidos: ");
		sApellidos=sc.nextLine();
		System.out.println("Introduce tu CCC: ");
		sCuenta=sc.nextLine();

		//Actividad de la cuenta
		do {
			System.out.print("Introduce un importe (ingreso/Gasto(-)): ");
			fimporte=sc.nextFloat();
			fsaldo+=fimporte;

		}while (fimporte!=0);





		//Resumen
		System.out.println("-------------");
		System.out.println("RESUMEN");
		System.out.println("-------------");
		System.out.println("Nº cuenta: \t" + sCuenta);
		System.out.println("");
		System.out.println("Nombre: \t" + sNombre);
		System.out.println("Apellidos: \t" + sApellidos);
		System.out.println("CCC: 	   \t" + sCuenta);
		System.out.println("Importe: \t" + fsaldo);





	}//Main


}//Class