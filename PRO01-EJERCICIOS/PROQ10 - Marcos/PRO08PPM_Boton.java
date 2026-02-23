class PRO08PPM_Boton extends PRO08PPM_Marco implements PRO08PPM_Accion, PRO08PPM_Color {
	//Atributos
	String sTexto="";
	
	//Constructores

	public PRO08PPM_Boton(String nom,String text, int x, int y, int alto, int ancho){
		super(nom,x,y,alto,ancho);
		this.sTexto=text;
	}

	//Set, get, is

	public void setTexto(String texto){
		this.sTexto=texto;
	}

	public String getTexto(){
		return this.sTexto;
	}

	//Métodos
	public void pulsar(String obj, String accion){
		if (this.id==obj) {
			System.out.print(this.id + " Me han pulsado ");
			System.out.print(" -> ");
			System.out.println("Ejecuto acciones: " + accion);
		}
	}

	public void color(String color){
		System.out.println(this.id+ " Me he cambiado el color a " + color);
	}

}