/*
Titulo:

Descripción:

Métodos:
	public PRO08PPM_Circulo (double x, double y, double radio)

Autor:

*/

class PRO08PPM_Circulo extends PRO08PPM_Figura implements PRO08PPM_Rotable, PRO08PPM_Dibujable {
	
	//Atributos
	double radio=0;
	

	//Constructores
	public PRO08PPM_Circulo(String str,double r){
		this.sId=str+String.valueOf(((int)(Math.random()*10000)));
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

	public void rotarDcha(double grados){
		System.out.println("Ha rotado hacia la derecha: " + (anguloDesvio + grados));
	}

	public void rotarIzq(double grados){
		System.out.println("Ha rotado hacia la izquierda: " + (anguloDesvio + grados));
	}
	
	public void dibujar(String id){
		if (this.sId.equals(id)) {
			System.out.println(this.sId+" se está dibujando");
		}else{
			System.out.println("No se encontró el ID.");
		}
		
	}

}//PRO08PPM_Circulo