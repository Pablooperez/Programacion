/* 
Titulo:
	PRUEBAS MAIN

*/

class PRO08PPM_Pruebas {
	public static void main(String[] args) {
	//Declaraciones
	PRO08PPM_Cuadrado cua1;
	PRO08PPM_Circulo cir1;
	PRO08PPM_Pentagono pen1;
	PRO08PPM_Hexagono hex1;
	//Inicio
	cua1=new PRO08PPM_Cuadrado(10);
	cir1=new PRO08PPM_Circulo("Cir",1334);
	pen1=new PRO08PPM_Pentagono(5);
	hex1=new PRO08PPM_Hexagono(5);

	System.out.println(cua1.area());
	System.out.println(cua1.perimetro());
	System.out.println();
	System.out.println(cir1.area());
	System.out.println(cir1.perimetro());
	System.out.println();
	System.out.println(pen1.area());
	System.out.println("~"+pen1.perimetro());
	System.out.println();
	System.out.println(hex1.area());
	System.out.println(hex1.perimetro());
	System.out.println();
	cir1.rotarDcha(100);
	cir1.dibujar("qwer");



	}	

}