/*
Titulo:

Descripción:

Métodos:
	public PRO08PPM_Circulo (double x, double y, double radio)

Autor:

*/

class PRO08PPM_Circulo extends PRO08PPM_Figura {
	
	//Atributos
	double radio=0;

	//Constructores
	public PRO08PPM_Circulo(double r){
		this.radio=r;
	}

	//Setter getter is


	//Métodos
	public  double area(){
		return this.radio*this.radio*Math.PI;
	}
	public  double perimetro(){
		return (2*Math.PI*this.radio);
	}

}//PRO08PPM_Circulo