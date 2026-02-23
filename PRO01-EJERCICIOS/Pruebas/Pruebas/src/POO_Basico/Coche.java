package POO_Basico;

public class Coche {
    //Atributos

    private String sMarca="";
    private String sModelo="";
    private int iVelocidad=0;

    //Constructores

    public Coche(String marca, String modelo){
        this.sMarca=marca;
        this.sModelo=modelo;
        this.iVelocidad=0;
    }

    public Coche(String marca, String modelo, int velocidad){
        this.sMarca=marca;
        this.sModelo=modelo;
        this.iVelocidad=velocidad;
    }

    //Getter and setters

    public String getMarca(){
        return this.sMarca;
    }

    public String getModelo(){
        return this.sModelo;
    }

    public int getVelocidad(){
        return this.iVelocidad;
    }

    public void setMarca(String marca){
        this.sMarca=marca;
    }

    public void setModelo(String modelo){
        this.sModelo=modelo;
    }

    public void setVelocidad(int velocidad){
        this.iVelocidad=velocidad;
    }

    //Métodos

    public void acelerar(int incremento){
        this.iVelocidad+=incremento;
    }

    public void frenar(int decremento){
        this.iVelocidad-=decremento;
    }

    public void mostrarDatos(){
        System.out.println("Marca: " + sMarca);
        System.out.println("Modelo: " + sModelo);
        System.out.println("Velocidad: " + iVelocidad);
    }


}
