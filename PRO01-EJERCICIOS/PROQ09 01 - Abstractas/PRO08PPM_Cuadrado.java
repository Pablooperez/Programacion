/*
Titulo:

Descripción:

Métodos:
	public PRO08PPM_Cuadrado (double x, double y, double radio)
Autor:

*/

class PRO08PPM_Cuadrado extends PRO08PPM_Figura {
	
	//Atributos
	double lado=0;

	//Constructores
	public PRO08PPM_Cuadrado(double l){
		this.lado=l;
	}

	//Setter getter is


	//Métodos
	public  double area(){
		return Math.pow(this.lado,2);
		//return this.lado*this.lado;
	}
	public  double perimetro(){
		return this.lado*4;
	}

}//PRO08PPM_Cuadrado