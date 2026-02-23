/*
	PROGRAMA:
		PRO08PPM_Butaca

	DESCRIPCION:
		//Constructores
		public PRO08PPM_Punto2D();
		public PRO08PPM_Punto2D(long x, long y);
		public PRO08PPM_Punto2D(long x, long y, String c);

		//**SET/GET/IS**************************************
		public long getX();
		public long getY();
		public boolean getVisible();
		public String getColor();
		public void setColor(String c);
		public void setVisible(boolean v);

		//**MÉTODOS******************************************
		public void desplazamientoAbsoluto(long xAb, long yAb);
		public void desplazamientoRelativo(long xRel, long yRel);
		public void imprimirDatos();

	MÉTODOS:


	AUTOR:
		Pablo Pérez
*/

class PRO08PPM_Punto2D {

    //Atributos
    Color c=new Color();
    protected long x=0;
    protected long y=0;
    protected String sColor="";
    protected boolean visible=false;

    //Constructores

    public PRO08PPM_Punto2D(){
        this.x=x;
        this.y=y;
        this.sColor="Blanco";
    }

    public PRO08PPM_Punto2D(long x, long y){
        this.x=x;
        this.y=y;
        this.sColor="Blanco";
    }

    public PRO08PPM_Punto2D(long x, long y, String c){
        this.x=x;
        this.y=y;
        this.sColor=c;
    }

    //Constantes
    //private static final String ANSI_BLACK 	= "\u001B[30m";
    //private static final String ANSI_RED 	= "\u001B[31m";
    //private static final String ANSI_GREEN 	= "\u001B[32m";
    //private static final String ANSI_YELLOW = "\u001B[33m";
    //private static final String ANSI_BLUE 	= "\u001B[34m";
    //private static final String ANSI_PURPLE = "\u001B[35m";
    //private static final String ANSI_CYAN 	= "\u001B[36m";
    //private static final String ANSI_WHITE 	= "\u001B[37m";



    //**SET/GET/IS**************************************

    public long getX(){
        return this.x;
    }

    public long getY(){
        return this.y;
    }

    public boolean isVisible(){
        return this.visible;
    }

    public String getColor(){
        return this.sColor;
    }

    public void setColor(String c){
        this.sColor=c;
    }

    public void setVisible(boolean v){
        this.visible=v;
    }

    //**MÉTODOS******************************************

    public void desplazamientoAbsoluto(long xAb, long yAb){
        this.x=xAb;
        this.y=yAb;
    }

    public void desplazamientoRelativo(long xRel, long yRel){
        this.x=x+xRel;
        this.y=y+yRel;
    }

    public void imprimirDatos(){
        System.out.println("Ubicacion: ("+this.x+","+this.y+")");
        System.out.println("Punto X: " + this.x);
        System.out.println("Punto Y: " + this.y);
        System.out.println("Color: " + this.sColor);
        System.out.println("¿Esta visible? " + this.visible);
    }

    public void pinta(){
        c.activarColor(this.sColor);
        if (this.isVisible()) {
            System.out.print("X");
        }else{
            System.out.print(".");
        }

    }

}