class PRO08PPM_Marco {
	
	//Atributos
	String id="";
	int iX=0, iY=0;º
	int iAlto=0;
	int iAncho=0;

	//Constructores

	
	public PRO08PPM_Marco(String str, int x, int y, int alto, int ancho){
		this.id=str;
		this.iX=x;
		this.iY=y;
		this.iAlto=alto;
		this.iAncho=ancho;
	}

	//Set, get, is
	public int getX(){
		return this.iX;
	}

	public int getY(){
		return this.iY;
	}

	public int getAlto(){
		return this.iAlto;
	}

	public int getAncho(){
		return this.iAncho;
	}

	public void setX(int x){
		this.iX=x;
	}

	public void setY(int y){
		this.iY=y;
	}

	public void setAlto(int alto){
		this.iAlto=alto;
	}

	public void setAncho(int ancho){
		this.iAncho=ancho;
	}

	//Métodos

	public void desplazamientoAbsoluto(int x, int y){
		this.iX=x;
		this.iY=y;
		System.out.println("Se ha desplazado a --> X:" + iX + ", " +" Y: " + iY);
	}

	public void desplazamientoRelativo(int x, int y){
		this.iX+=x;
		this.iY+=y;
		System.out.println("Se ha desplazado a --> X:" + iX + ", " +" Y: " + iY);

	}

	public void dibujaMe(){

	}


}