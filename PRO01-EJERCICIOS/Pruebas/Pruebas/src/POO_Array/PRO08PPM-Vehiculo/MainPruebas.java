class MainPruebas {
	public static void main(String[] args) {
		//Declaraciones
		Vehiculo v1=new Vehiculo("1234ABC",1,2);
		Terrestre t1=new Terrestre("1234DEF",5,1,4);
		LibreriaCarrera lb=new LibreriaCarrera();
		Aereo a1=new Aereo();
		F1 f1=new F1(100,"Renault","Fernando Alonso", 4);

		//Pruebas
		v1.imprimeDatos();
		System.out.println();
		t1.imprimeDatos();
		System.out.println();
		a1.imprimeDatos();
		System.out.println();
		f1.imprimeDatos();

	}
}