/*
	PROGRAMA:
		PersonaGrupo

	DESCRIPCION:
		
		
	MÉTODOS:

	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;
class PersonaGrupo{
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		Persona david=new Persona("David","Escrich Blat",31);
		Persona fran=new Persona("Fran","Barber",19);
		Persona sara=new Persona("Sara","Iranzo",18);
		Persona pablo=new Persona("Pablo","Pérez",25);
		Persona corredor;


		//Inicio

		System.out.println("Introduce un nombre: ");
		String sNom=sc.nextLine();
		System.out.println("Introduce un apellidos: ");
		String sApe=sc.nextLine();
		System.out.println("Introduce tu edad: ");
		int iE=sc.nextInt();

		corredor=new Persona(sNom,sApe,iE);

		System.out.println("Me llamo: "+fran.getNombre());
		System.out.println("Me llamo: "+david.getNombre());
		System.out.println("Me llamo: "+sara.getNombre());
		System.out.println("Me llamo: "+pablo.getNombre());
		System.out.println();
	
		david.anda(25);
		fran.anda(2000);
		System.out.println();
		fran.cumplirAnyos();
		System.out.println(fran.getNombre()+ " tiene "+fran.getEdad()+ " años.");
		System.out.println(sara.getNombre()+ " tiene "+sara.getEdad()+ " años.");
		System.out.println(david.getNombre()+ " tiene "+david.getEdad()+ " años.");
		System.out.println(pablo.getNombre()+ " tiene "+pablo.getEdad()+ " años.");
		david.setNombre("Guenceslao");
		
		//System.out.println(david.isNombre("David"));
		
	}//main

}//class