/*
	PROGRAMA:
		PRO00PPM_HolaMundo

	DESCRIPCION:
		Mi primer programa para poner en funcionamiento java

	AUTOR:
		Pablo Pérez

	*/


class PRO00PPM_HolaMundo {
	public static void main(String[] args) {
		//Declaraciones
		byte miDatoByte=121;
		short miDatoShort=2654;
		int miDatoInt=2534;
		long miDatoLong=234234233;
		float miDatoFloat=0;
		double miDatoDouble=0;
		boolean miDatoBoolean=false; //(true or false)
		char miDatoChar='7';
	
		//Inicio
		System.out.println("-----------"); //Separador para hacer bonito
		System.out.println("Hola mundo."); //Imprimo "Hola Mundo"

		//Imprimir Datos Simples
		System.out.println("Tipo de dato byte: \t"+miDatoByte);
		System.out.println("Tipo de dato short: \t"+miDatoShort);
		System.out.println("Tipo de dato int: \t"+miDatoInt);
		System.out.println("Tipo de dato long: \t"+miDatoLong);
		System.out.println("Tipo de dato float: \t"+miDatoFloat);
		System.out.println("Tipo de dato double: \t"+miDatoDouble);
		System.out.println("Tipo de dato boolean: \t"+miDatoBoolean);
		System.out.println("Tipo de dato char: \t"+(int)miDatoChar);

		System.out.println("-----------"); //Separador para hacer bonito

		//Operaciones matemáticas
		int num1=100;
		int num2=5;

		System.out.println(num1/num2);
		System.out.println(num1%num2);
		System.out.println(miDatoChar+10);
		
		miDatoInt=1;
		miDatoInt++; // Sumamos 1 a miDatoInt. Es lo mismo que: miDatoInt=miDatoInt + 1.
		miDatoInt*=5;// miDatoInt * 5 y te el resultado. Es lo mismo que: miDatoInt=miDatoInt*5
		System.out.println(miDatoInt);

		System.out.println(3>5 && 6<9 || 10==3); //¡¡Memorizarse la tabla de la verdad!!



		System.out.println("\n");

	}//main
}//class