/*
Titulo:

Descripción:

Métodos:
	public PRO08PPM_Pentagono (double l)
Autor:

*/

class PRO08PPM_Pentagono extends PRO08PPM_Figura {
	

	//Atributos
	double lado=0;
	double apotema=1.72048;

	//Constructores
	public PRO08PPM_Pentagono(double l){
		this.lado=l;
	}

	//Setter getter is


	//Métodos
	public double area(){
		return this.apotema*(lado*lado);
	}

	public double perimetro(){
		return this.lado*5;
	}

}//PRO08PPM_Pentagono