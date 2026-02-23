/*
Titulo:

Descripción:

Métodos:
	public Hexagono (double l)
Autor:

*/

class PRO08PPM_Hexagono extends PRO08PPM_Figura implements PRO08PPM_Rotable, PRO08PPM_Dibujable{
	
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

}