/*
* Titulo
    Terrestre

* Descripcion
    

* Metodos
    public Terrestre()
	public Terrestre(String mat, int pMax, int pMin, int numRue)
	public void setTipoCarroceria(String tipoCarroceria)
	public void setTipoMotor(String tipoMotor)
	public void setCombustibleTipo(String combustibleTipo)
	public void setCombustibleVolumen(int combustibleVolumen)
	public void setPotencia(int potencia)
	protected int[] iniNeumaticos(int numRue, int [] neumaticos)
	private int[] cambiarNeumaticos(int iNumNeumaticos,int[] neumaticos)
	public void imprimeDatos()
	private void imprimirEstadoNeumaticos(int[] neumaticos)
*/

class Terrestre extends Vehiculo{
		
	//Atributos

	private String sTipoCarroceria="MIXTA";
	private int iNumPuertas=5;
	private int iLongitud=0;
	private int iAltura=0;
	private int iBatalla=0;
	private int iNumNeumaticos=4;
	protected int[] estadoNeumaticos;
	private String sTipoMotor="V4";
	private String sCombustible="S95/S98";
	private int iDepositoVolumen=50;
	private int iDepositoCapacidad=0;
	private int iConsumoMedio=0;
	private int iPotencia=0;

	//Constructores

	public Terrestre()
public Terrestre(String mat, int pMax, int pMin, int numRue)
public void setTipoCarroceria(String tipoCarroceria)
public void setTipoMotor(String tipoMotor)
public void setCombustibleTipo(String combustibleTipo)
public void setCombustibleVolumen(int combustibleVolumen)
public void setPotencia(int potencia)
protected int[] iniNeumaticos(int numRue, int [] neumaticos)
private int[] cambiarNeumaticos(int iNumNeumaticos,int[] neumaticos)
public void imprimeDatos()
private void imprimirEstadoNeumaticos(int[] neumaticos){
		super(1,1);
	}

	public Terrestre()
public Terrestre(String mat, int pMax, int pMin, int numRue)
public void setTipoCarroceria(String tipoCarroceria)
public void setTipoMotor(String tipoMotor)
public void setCombustibleTipo(String combustibleTipo)
public void setCombustibleVolumen(int combustibleVolumen)
public void setPotencia(int potencia)
protected int[] iniNeumaticos(int numRue, int [] neumaticos)
private int[] cambiarNeumaticos(int iNumNeumaticos,int[] neumaticos)
public void imprimeDatos()
private void imprimirEstadoNeumaticos(int[] neumaticos){
		super(mat,pMin,pMax);
		this.sTipoCarroceria="MIXTA";
		this.iNumPuertas=5;
		this.iLongitud=0;
		this.iAltura=0;
		this.iBatalla=0;
		this.iNumNeumaticos=numRue;
		this.sTipoMotor="v4";
		this.sCombustible="S95/S98";
		this.iDepositoVolumen=50;
		this.iDepositoCapacidad=0;
		this.iConsumoMedio=0;
		this.iPotencia=0;
		estadoNeumaticos=iniNeumaticos(numRue,estadoNeumaticos);

	}

	//Getter and setter

	public Terrestre()
public Terrestre(String mat, int pMax, int pMin, int numRue)
public void setTipoCarroceria(String tipoCarroceria)
public void setTipoMotor(String tipoMotor)
public void setCombustibleTipo(String combustibleTipo)
public void setCombustibleVolumen(int combustibleVolumen)
public void setPotencia(int potencia)
protected int[] iniNeumaticos(int numRue, int [] neumaticos)
private int[] cambiarNeumaticos(int iNumNeumaticos,int[] neumaticos)
public void imprimeDatos()
private void imprimirEstadoNeumaticos(int[] neumaticos){
		this.sTipoCarroceria=tipoCarroceria;
	}

	public Terrestre()
public Terrestre(String mat, int pMax, int pMin, int numRue)
public void setTipoCarroceria(String tipoCarroceria)
public void setTipoMotor(String tipoMotor)
public void setCombustibleTipo(String combustibleTipo)
public void setCombustibleVolumen(int combustibleVolumen)
public void setPotencia(int potencia)
protected int[] iniNeumaticos(int numRue, int [] neumaticos)
private int[] cambiarNeumaticos(int iNumNeumaticos,int[] neumaticos)
public void imprimeDatos()
private void imprimirEstadoNeumaticos(int[] neumaticos){
		this.sTipoMotor=tipoMotor;
	}

	public Terrestre()
public Terrestre(String mat, int pMax, int pMin, int numRue)
public void setTipoCarroceria(String tipoCarroceria)
public void setTipoMotor(String tipoMotor)
public void setCombustibleTipo(String combustibleTipo)
public void setCombustibleVolumen(int combustibleVolumen)
public void setPotencia(int potencia)
protected int[] iniNeumaticos(int numRue, int [] neumaticos)
private int[] cambiarNeumaticos(int iNumNeumaticos,int[] neumaticos)
public void imprimeDatos()
private void imprimirEstadoNeumaticos(int[] neumaticos){
		this.sCombustible=combustibleTipo;
	}

	public Terrestre()
public Terrestre(String mat, int pMax, int pMin, int numRue)
public void setTipoCarroceria(String tipoCarroceria)
public void setTipoMotor(String tipoMotor)
public void setCombustibleTipo(String combustibleTipo)
public void setCombustibleVolumen(int combustibleVolumen)
public void setPotencia(int potencia)
protected int[] iniNeumaticos(int numRue, int [] neumaticos)
private int[] cambiarNeumaticos(int iNumNeumaticos,int[] neumaticos)
public void imprimeDatos()
private void imprimirEstadoNeumaticos(int[] neumaticos){
		this.iDepositoVolumen=combustibleVolumen;
	}

	public Terrestre()
public Terrestre(String mat, int pMax, int pMin, int numRue)
public void setTipoCarroceria(String tipoCarroceria)
public void setTipoMotor(String tipoMotor)
public void setCombustibleTipo(String combustibleTipo)
public void setCombustibleVolumen(int combustibleVolumen)
public void setPotencia(int potencia)
protected int[] iniNeumaticos(int numRue, int [] neumaticos)
private int[] cambiarNeumaticos(int iNumNeumaticos,int[] neumaticos)
public void imprimeDatos()
private void imprimirEstadoNeumaticos(int[] neumaticos){
		this.iPotencia=potencia;
	}

	//Métodos

	public Terrestre()
public Terrestre(String mat, int pMax, int pMin, int numRue)
public void setTipoCarroceria(String tipoCarroceria)
public void setTipoMotor(String tipoMotor)
public void setCombustibleTipo(String combustibleTipo)
public void setCombustibleVolumen(int combustibleVolumen)
public void setPotencia(int potencia)
protected int[] iniNeumaticos(int numRue, int [] neumaticos)
private int[] cambiarNeumaticos(int iNumNeumaticos,int[] neumaticos)
public void imprimeDatos()
private void imprimirEstadoNeumaticos(int[] neumaticos){
		neumaticos=new int[iNumNeumaticos];
		for (int i=0;i<neumaticos.length;i++) {
			neumaticos[i]=100;
		}

		return neumaticos;
	}

	public Terrestre()
public Terrestre(String mat, int pMax, int pMin, int numRue)
public void setTipoCarroceria(String tipoCarroceria)
public void setTipoMotor(String tipoMotor)
public void setCombustibleTipo(String combustibleTipo)
public void setCombustibleVolumen(int combustibleVolumen)
public void setPotencia(int potencia)
protected int[] iniNeumaticos(int numRue, int [] neumaticos)
private int[] cambiarNeumaticos(int iNumNeumaticos,int[] neumaticos)
public void imprimeDatos()
private void imprimirEstadoNeumaticos(int[] neumaticos){
		neumaticos[iNumNeumaticos]=100;
		return neumaticos;
	}

	private void neumaticosNuevos(){

	}

	public Terrestre()
public Terrestre(String mat, int pMax, int pMin, int numRue)
public void setTipoCarroceria(String tipoCarroceria)
public void setTipoMotor(String tipoMotor)
public void setCombustibleTipo(String combustibleTipo)
public void setCombustibleVolumen(int combustibleVolumen)
public void setPotencia(int potencia)
protected int[] iniNeumaticos(int numRue, int [] neumaticos)
private int[] cambiarNeumaticos(int iNumNeumaticos,int[] neumaticos)
public void imprimeDatos()
private void imprimirEstadoNeumaticos(int[] neumaticos){
		super.imprimeDatos();
		System.out.println("Tipo de carrocería: " +sTipoCarroceria);
		System.out.println("Número de puertas: " + iNumPuertas);
		System.out.println("Longitud: " + iLongitud);
		System.out.println("Altura: " + iAltura);
		System.out.println("Batalla: " + iBatalla);
		System.out.println("Número neumáticos: " + iNumNeumaticos);
		System.out.println("Tipo motor: " + sTipoMotor);
		System.out.println("Combustible: " + sCombustible);
		System.out.println("Volumen del deposito: " + iDepositoVolumen);
		System.out.println("Capacidad del deposito: " + iDepositoCapacidad);
		System.out.println("Consumo medio: " + iConsumoMedio);
		System.out.println("Potencia: " + iPotencia);
		System.out.println("Num neumaticos: "+this.iNumNeumaticos);
		imprimirEstadoNeumaticos(this.estadoNeumaticos);
	}

	public Terrestre()
public Terrestre(String mat, int pMax, int pMin, int numRue)
public void setTipoCarroceria(String tipoCarroceria)
public void setTipoMotor(String tipoMotor)
public void setCombustibleTipo(String combustibleTipo)
public void setCombustibleVolumen(int combustibleVolumen)
public void setPotencia(int potencia)
protected int[] iniNeumaticos(int numRue, int [] neumaticos)
private int[] cambiarNeumaticos(int iNumNeumaticos,int[] neumaticos)
public void imprimeDatos()
private void imprimirEstadoNeumaticos(int[] neumaticos){
		for (int i=0;i<neumaticos.length;i++) {
			System.out.println("Neumático " + i +": " + neumaticos[i]);
		}
	}
}