class PRO08PPM_TextoCampo extends PRO08PPM_Marco {
	//Atributos

	String sTexto;

	//Constructores

	public PRO08PPM_TextoCampo(String nom,int x, int y, int alto, int ancho){
		super(nom,x,y,alto,ancho);
		this.sTexto="Introduce datos...";
	}

	//Set, get, is
	
	public void setTexto(String texto){
		this.sTexto=texto;
	}

	public String getTexto(){
		return this.sTexto;
	}

	//Métodos

}