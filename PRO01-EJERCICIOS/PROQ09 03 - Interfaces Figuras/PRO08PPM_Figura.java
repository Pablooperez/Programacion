/*
Titulo:

Descripción:

Métodos:
	public PRO08PPM_Figura (long x, long y)
	public abstract double area ()
	public abstract double perimetro()
Autor:

*/

abstract class PRO08PPM_Figura {
	
	//Atributos
	long x=0,y=0;
	String sId="";

	//Constructores

	public PRO08PPM_Figura (){
		this.x=0;
		this.y=0;

	}

	public PRO08PPM_Figura (long x, long y){
		this.x=x;
		this.y=y;

	}

	//Setter getter is
	public long getX(){
		return this.x;
	}

	public long getY(){
		return this.y;
	}

	//Métodos
	public abstract double area();
	public abstract double perimetro();


}//PRO08PPM_Figura
