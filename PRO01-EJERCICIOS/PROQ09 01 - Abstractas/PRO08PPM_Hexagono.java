/*
Titulo:

Descripción:

Métodos:
	public Hexagono (double l)
Autor:

*/

class PRO08PPM_Hexagono extends PRO08PPM_Figura{
	
	//Atributos
	double lado=0;

	//Constructores
	public PRO08PPM_Hexagono(double l){
		this.lado=l;
	}

	//Setter getter is


	//Métodos
	public  double area(){
		return ((3*Math.sqrt(3))/2)*(this.lado*this.lado);
	}

	public  double perimetro(){
		return this.lado*6;
	}

}