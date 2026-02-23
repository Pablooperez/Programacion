/* Clase Tarea

-Una tarea tiene:

Un título

Una descripción

Un estado que indica si está completada o no

-Debe permitir:

Crear una tarea solo con título (no completada)

Crear una tarea con título y descripción

Marcar la tarea como completada

Mostrar los datos de la tarea */

public class Tarea {
	
	//Atributos

	private String sTitulo;
	private String sDescripcion;
	private String iFchAlta;
	private String iFchBaja;
	private boolean bCompletada=false;

	//Constructor

	public Tarea(String titulo){
		this.sTitulo=titulo;
		this.sDescripcion=null;
		this.bCompletada=false;
		this.iFchAlta=null;
		this.iFchBaja=null;
	}

	public Tarea(String titulo, String descripcion){
		this.sTitulo=titulo;
		this.sDescripcion=descripcion;
		this.bCompletada=false;
		this.iFchAlta=null;
		this.iFchBaja=null;
	}

	//Getter and setter

	public String getTitulo(){
		return this.sTitulo;
	}

	public String getDescripcion(){
		return this.sDescripcion;
	}

	public String getFchAlta(){
		return this.iFchAlta;
	}

	public String getFchBaja(){
		return this.iFchBaja;
	}

	public void setTitulo(String s){
		this.sTitulo=s;
	}

	public void setDescripcion(String s){
		this.sDescripcion=s;
	}

	public boolean isCompletada(){
		if (bCompletada) {
			return this.bCompletada;
		}else{
			return this.bCompletada;
		}
	}

	//Métodos

	public void tareaCompletada(){
		if (!bCompletada) {
			bCompletada=true;
			
		}
	}

	public void mostrarDatos(){
		System.out.println("Título: " + sTitulo);
		System.out.println("Descripción: " + sDescripcion);
		if (bCompletada) {
			System.out.println("Estado: Completada");
		}else{
			System.out.println("Estado: Incompleta");
		}
	}

	public void darBajaTarea(String fecha){
		if (this.iFchBaja==null) {
			this.iFchBaja=fecha;
		}
	}

	public void darAltaTarea(String fecha){
		if (this.iFchAlta==null) {
			this.iFchAlta=fecha;
		}
	}

}
