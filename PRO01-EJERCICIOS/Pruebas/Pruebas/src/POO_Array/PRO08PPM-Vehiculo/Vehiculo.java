/*
* Titulo
    Vehiculo

* Descripcion
    

* Metodos
    public Vehiculo()
    public Vehiculo(int pMin, int pMax)
    public Vehiculo(String mat, int pMin,int pMax)
    public String getMatricula()
    public String getMarca()
    public String getModelo()
    public String getColor()
    public int getOdo()
    public int getPasMin()
    public int getPasMax()
    public int getPasIn()
    public void setColor(String color)
    public void setMarca(String marca)
    public void setModelo(String modelo)
    public void arrancar()
    public void avanzar(int distancia)
    public void retroceder(int distancia)
    public void subirPasaj(int num)
    public void bajarPasaj(int num)
    public void imprimeDatos()
    private String generarMatricula()
*/

class Vehiculo {
	
	//Atributos

	protected String sMatricula;
	private String sMarca;
	private String sModelo;
    private String sColor;
	private int iOdo; //Cuenta Kilometros
	protected int iNumPasMin;
	protected int iNumPasMax;
	private int iNumPasIn;
	private boolean bEncendido=false;
	private boolean bEstado;
  
  
	//Constructores

	public Vehiculo(){
        this.sMatricula=generarMatricula();
        this.iNumPasMax=1;
        this.iNumPasMin=1;
        this.iNumPasIn=0;
        this.iOdo=0;
        this.bEncendido=false;

	}

	public Vehiculo(int pMin, int pMax){
        this.sMatricula=generarMatricula();
        this.iNumPasMin=pMin;
        this.iNumPasMax=pMax;
        this.iNumPasIn=0;
        this.iOdo=0;
        this.bEncendido=false;
	}

	public Vehiculo(String mat, int pMin,int pMax){
        this.sMatricula=mat;
        this.iNumPasMin=pMin;
        this.iNumPasMax=pMax;
        this.iNumPasIn=0;
        this.iOdo=0;
        this.bEncendido=false;

	}

	//Getter and Setters

	public String getMatricula(){
		return this.sMatricula;
	}

	public String getMarca(){
		return this.sMarca;
	}

	public String getModelo(){
		return this.sModelo;
	}

	public String getColor(){
		return this.sColor;
	}

	public int getOdo(){
		return this.iOdo;
	}

	public int getPasMin(){
		return this.iNumPasMin;
	}

	public int getPasMax(){
		return this.iNumPasMax;
	}

	public int getPasIn(){
		return this.iNumPasIn;
	}

	public void setColor(String color){
		this.sColor=color;
	}

    public void setMarca(String marca){
        this.sMarca=marca;
    }

    public void setModelo(String modelo){
        this.sModelo=modelo;
    }

    //Métodos

    public void arrancar(){
        if (bEncendido){
            System.out.println("El vehículo ya estaba encendido.");
        }else{
            bEncendido=true;
        }
    }

    public void avanzar(int distancia){
        if (!bEncendido){
            System.out.println("Necesitas primero arrancar el coche.");
        }else{
            iOdo+=distancia;
            System.out.println(this.sMatricula+" Has avanzado "+ distancia +"-"+this.iOdo);
        }

    }

    public void retroceder(int distancia){
        if (!bEncendido){
            System.out.println("Necesitas primero arrancar el coche.");
        }else{
            iOdo+=distancia;
            System.out.println("Has retrocedido "+ distancia +" km.");
        }
    }

    public void subirPasaj(int num) {
        if (num > 0 && iNumPasIn + num <= iNumPasMax) {
            iNumPasIn += num;
        } else {
            System.out.println("No se pueden subir más pasajeros.");
        }
    }

    public void bajarPasaj(int num) {
        if (num > 0 && num <= iNumPasIn) {
            iNumPasIn -= num;
        } else {
            System.out.println("Error al bajar pasajeros.");
        }
    }

    public void imprimeDatos(){
        System.out.println("Matrícula: " + sMatricula);
        System.out.println("Marca: " + sMarca);
        System.out.println("Modelo: " + sModelo);
        System.out.println("Color: " + sColor);
        System.out.println("Odómetro: " + iOdo);
        System.out.println("Número de pasajeros mínimos: " + iNumPasMin);
        System.out.println("Número de pasajeros máximos: " + iNumPasMax);
        System.out.println("Número de pasajeros totales: " + iNumPasIn);
        if (bEncendido){
            System.out.println("Vehículo encendido.");
        }else{
            System.out.println("Vehículo apagado.");
        }
    }

    private String generarMatricula() {

        String letras = "BCDFGHJKLMNPRSTVWXYZ";
        String matricula = "";

        int numero = (int)(Math.random() * 10000);
        matricula = String.format("%04d", numero);

        for (int i = 0; i < 3; i++) {
            int pos = (int)(Math.random() * letras.length());
            matricula += letras.charAt(pos);
        }

        return matricula;
    }

}