/* 
	PROGRAMA:

	DESCRIPCIÓN:

	AUTOR: 
		Pablo Pérez

*/


import java.util.Scanner;
class PRO00PPM_HolaMundoMain {
	public static void main(String[] args) {
		
		//Declaraciones
		PRO00PPM_HolaMundo f01=new PRO00PPM_HolaMundo();
		Scanner sc=new Scanner(System.in);

		//Inicio
		f01.setBounds(100,100,300,200);
		f01.setVisible(true);

		System.out.println("Este es el texto actual: ");
		System.out.println(f01.jlTexto.getText());


		System.out.println("Introduce nuevo texto: ");
		String texto=sc.nextLine();
		f01.jlVersion.setText(texto);
		


	}
}