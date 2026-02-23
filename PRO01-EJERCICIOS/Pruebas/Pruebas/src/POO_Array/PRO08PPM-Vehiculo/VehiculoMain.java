public class VehiculoMain {
    public static void main(String[] args) {


        Vehiculo vehiculo1=new Vehiculo();
        Vehiculo vehiculo2=new Vehiculo("1234BDD",0,4);
        vehiculo2.setMarca("Rimac");
        vehiculo2.setModelo("XDX");

        vehiculo1.imprimeDatos();
        System.out.println();
        vehiculo1.arrancar();
        System.out.println();
        vehiculo1.imprimeDatos();
        System.out.println();
        vehiculo1.avanzar(1000);
        System.out.println();
        vehiculo1.imprimeDatos();
        System.out.println();
        vehiculo1.subirPasaj(2);
        System.out.println();
        vehiculo1.bajarPasaj(3);
        System.out.println();
        vehiculo1.getPasMax();
        System.out.println();
        System.out.println(vehiculo1.getPasMax());
        System.out.println();
        vehiculo2.imprimeDatos();
        vehiculo2.arrancar();
        System.out.println();
        vehiculo2.imprimeDatos();


    }
}
