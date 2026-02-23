package POO_Basico;

public class CocheMain {
    public static void main(String[] args) {

        Coche coche1=new Coche("Toyota","Prius");
        coche1.mostrarDatos();
        coche1.acelerar(30);
        coche1.mostrarDatos();
        coche1.frenar(10);
        coche1.mostrarDatos();
        coche1.setMarca("Mercedes");
        coche1.setModelo("AMG");
        coche1.mostrarDatos();



    }//POO_Basico.Main
}//Class
