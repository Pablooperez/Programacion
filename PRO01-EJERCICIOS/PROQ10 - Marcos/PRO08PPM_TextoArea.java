class PRO08PPM_TextoArea extends PRO08PPM_Marco implements PRO08PPM_Color {
	//Atributos

	String sTexto;

	//Constructores

	public PRO08PPM_TextoArea(String nom,int x, int y, int alto, int ancho){
		super(nom,x,y,alto,ancho);
		this.sTexto="Introduce texto";
	}

	//Set, get, is
	
	public void setTexto(String texto){
		this.sTexto=texto;
	}

	public String getTexto(){
		return this.sTexto;
	}

	//Métodos

	public void color(String color){
		System.out.println("Me he cambiado el color a " + color);
	}

}