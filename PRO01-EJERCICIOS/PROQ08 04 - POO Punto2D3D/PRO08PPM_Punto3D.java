class PRO08PPM_Punto3D extends PRO08PPM_Punto2D {
	//Declaraciones
	private long z=0;

	//Constructores
	public PRO08PPM_Punto3D(){
		this.x=0;
		this.y=0;
		this.z=0;

	}

	public PRO08PPM_Punto3D(long x, long y, long z){
		super(x,y);
		this.z=z;
	}

	public PRO08PPM_Punto3D(long x, long y, long z, String c){
		super(x,y,c);
		this.z=z;

	}


	//Getter and setter

	public long getZ(){
		return this.z;
	}

	public void setColor(String c){
		this.sColor=c;
	}

	public void setVisible(boolean b){
		this.visible=b;
	}

	//Métodos

	public void desplazamientoAbsoluto(int x, int y, int z){
		super.desplazamientoAbsoluto(x,y);
		this.z=z;
	}

	public void desplazamientoRelativo(int x, int y, int z){
		super.desplazamientoRelativo(x,y);
		this.z=z;
	}


	public void imprimirDatos(){
        System.out.println("Ubicacion: ("+this.x+","+this.y+","+this.z+")");
        System.out.println("Punto X: " + this.x);
        System.out.println("Punto Y: " + this.y);
        System.out.println("Color: " + this.sColor);
        System.out.println("¿Esta visible? " + this.visible);
    }

    public void pintar(){
    	c.activarColor(this.sColor);
        if (this.isVisible()) {
            System.out.print("X");
        }else{
            System.out.print(".");
        }
    }
}