/*
	PROGRAMA:
		PRO08PPM_ContadorToken

	DESCRIPCION:
		Creamos un programa para añadir por teclado, y contamos la cantidad de palabras que hay y dicha palabra.
		
	MÉTODOS:

	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;
import java.util.StringTokenizer;

class PRO08PPM_ContadorToken {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		String str="";
		String del="";

		


		//Inicio
		//System.out.print("Dime una frase: ");
		//str=sc.nextLine();
		//StringTokenizer st=new StringTokenizer(str);
		

		//for (int i=0;i<str.length();i++) {
		//	while(st.countTokens()>0){
		//		System.out.print(st.countTokens());
		//	System.out.print(st.nextToken());
		//	System.out.println();
		//	}
		//	
		//}

		//System.out.print("Dime un delimitador: ");
		//del=sc.nextLine();
		//StringTokenizer st1=new StringTokenizer(str,del);
		//
		//for (int i=0;i<str.length();i++) {
		//	while(st1.countTokens()>0){
		//		System.out.println(st1.countTokens());
		//		System.out.println(st1.nextToken());
		//	}
		//}

		System.out.print("Dime un texto(voy a contar cuentas vocales hay): ");
		str=sc.nextLine();


		StringTokenizer st1=new StringTokenizer(str,"a");
		System.out.println("A: " + st1.countTokens());
		StringTokenizer st2=new StringTokenizer(str,"e");
		System.out.println("E: " + st2.countTokens());
		StringTokenizer st3=new StringTokenizer(str,"i");
		System.out.println("I: " + st3.countTokens());
		StringTokenizer st4=new StringTokenizer(str,"o");
		System.out.println("O: " + st4.countTokens());
		StringTokenizer st5=new StringTokenizer(str,"u");
		System.out.println("U: " + st5.countTokens());
		StringTokenizer st6=new StringTokenizer(str,"b");
		System.out.println("B: " + st6.countTokens());
		StringTokenizer st7=new StringTokenizer(str,"c");
		System.out.println("C: " + st7.countTokens());
		StringTokenizer st8=new StringTokenizer(str,"d");
		System.out.println("D: " + st8.countTokens());
		StringTokenizer st9=new StringTokenizer(str,"f");
		System.out.println("F: " + st9.countTokens());
		StringTokenizer st10=new StringTokenizer(str,"g");
		System.out.println("G: " + st10.countTokens());
		StringTokenizer st11=new StringTokenizer(str,"h");
		System.out.println("H: " + st11.countTokens());
		StringTokenizer st12=new StringTokenizer(str,"j");
		System.out.println("J: " + st12.countTokens());
		StringTokenizer st13=new StringTokenizer(str,"k");
		System.out.println("K: " + st13.countTokens());
		StringTokenizer st14=new StringTokenizer(str,"l");
		System.out.println("L: " + st14.countTokens());
		StringTokenizer st15=new StringTokenizer(str,"m");
		System.out.println("M: " + st15.countTokens());
		StringTokenizer st16=new StringTokenizer(str,"n");
		System.out.println("N: " + st16.countTokens());
		StringTokenizer st17=new StringTokenizer(str,"ñ");
		System.out.println("Ñ: " + st17.countTokens());
		StringTokenizer st18=new StringTokenizer(str,"p");
		System.out.println("P: " + st18.countTokens());
		StringTokenizer st19=new StringTokenizer(str,"q");
		System.out.println("Q: " + st19.countTokens());
		StringTokenizer st20=new StringTokenizer(str,"r");
		System.out.println("R: " + st20.countTokens());
		StringTokenizer st21=new StringTokenizer(str,"s");
		System.out.println("S: " + st21.countTokens());
		StringTokenizer st22=new StringTokenizer(str,"t");
		System.out.println("T: " + st22.countTokens());
		StringTokenizer st23=new StringTokenizer(str,"v");
		System.out.println("V: " + st23.countTokens());
		StringTokenizer st24=new StringTokenizer(str,"w");
		System.out.println("W: " + st24.countTokens());
		StringTokenizer st25=new StringTokenizer(str,"x");
		System.out.println("X: " + st25.countTokens());
		StringTokenizer st26=new StringTokenizer(str,"y");
		System.out.println("Y: " + st26.countTokens());
		StringTokenizer st27=new StringTokenizer(str,"z");
		System.out.println("Z: " + st27.countTokens());










	}//main
}//class