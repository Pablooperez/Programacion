package POO_Basico;

class TermometroMain {
    public static void main(String[] args) {

        Termometro termometro1=new Termometro("Valencia",25);
        Termometro termometro2=new Termometro("Madrid",20);

        termometro1.mostrarDatos();
        termometro2.mostrarDatos();

        termometro1.temperaturaActual(22);
        termometro1.mostrarDatos();

        termometro1.subirTemperatura(2);
        termometro1.mostrarDatos();

        termometro1.bajarTemperatura(2);
        termometro1.mostrarDatos();

        termometro1.reiniciarTemperatura();
        termometro1.mostrarDatos();

        termometro1.nivelTemperatura();














    }//main

}//class