/*
	PROGRAMA:
		PRO08PPM_String

	DESCRIPCION:
		

	AUTOR:
		Pablo Pérez
*/


class PRO08PPM_String {
	public static void main(String[] args) {


		//Declaraciones
		final double MI_PI=3.14;
		int cont=0;
		Integer miInt=0;
		String miNombre="Pablo";

		//Inicio
		System.out.println(miNombre.charAt(0)); 
		System.out.println(miNombre.charAt(3));
		System.out.println("Hola a todos".charAt(11));
		System.out.println();
		for (int i=0;i<=miNombre.length();i++) {
			System.out.println(miNombre.charAt(i));
		}

		//System.out.println(Math.random());
		//System.out.println("Máx "+Math.max(3,50));
		//System.out.println(Math.PI);
		//System.out.println(MI_PI);


	}//Main 

}//Class