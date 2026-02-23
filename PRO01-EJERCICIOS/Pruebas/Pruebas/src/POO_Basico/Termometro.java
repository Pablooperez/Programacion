package POO_Basico;

class Termometro {

    //Atributos

    private int iTemperatura=0;
    private String sUbicacion="";

    //Constructores

    public Termometro(String ubicacion,int temperatura){
        this.iTemperatura=temperatura;
        this.sUbicacion=ubicacion;
    }

    //Getter and Setters

    public int getTemperatura(){
        return this.iTemperatura;
    }

    public String getUbicacion(){
        return this.sUbicacion;
    }

    public void setTemperatura(int temperatura){
        this.iTemperatura=temperatura;
    }

    public void setUbicacion(String ubicacion){
        this.sUbicacion=ubicacion;
    }

    //Métodos

    public void temperaturaActual(int temperatura){
        this.iTemperatura=temperatura;
    }//temperaturaActual

    public void subirTemperatura(int temperatura){
        this.iTemperatura+=temperatura;
    }//subirTemperatura

    public void bajarTemperatura(int temperatura){
        this.iTemperatura-=temperatura;
    }//bajarTemperatura

    public void reiniciarTemperatura(){
        this.iTemperatura=15;
    }//reiniciarTemperatura

    public void nivelTemperatura(){

        if (iTemperatura<10) {
            System.out.println("Temperatura baja.");
        }else if(iTemperatura>=10&&iTemperatura<25) {
            System.out.println("Temperatura normal.");
        }else{
            System.out.println("Temperatura alta.");
        }

    }//nivelTemperatura

    public void mostrarDatos(){

        System.out.println("Ubicacion: " + sUbicacion);
        System.out.println("Temperatura: " + iTemperatura);

    }

}