

public class Pelicula {

    //Atributos
    private String sTitulo;
    private String sDirector;
    private int iDuracion;
    private boolean bVisto;

    //Constructor
    public Pelicula(String titulo,String director,int duracion){
        this.sTitulo=titulo;
        this.sDirector=director;
        this.iDuracion=duracion;
        this.bVisto=false;
    }

    //Getter and setter
    public String getTitulo(){
        return this.sTitulo;
    }

    public String getDirector(){
        return this.sDirector;
    }

    public int getDuracion(){
        return this.iDuracion;
    }

    public boolean getVisto(){
        return this.bVisto;
    }

    //Métodos
    public void marcarVisto(){

        if (!bVisto){
            System.out.println("Película: " +sTitulo+" marcada como visto.");
            this.bVisto=true;
        }
    }

    public void mostrarDatos(){
        System.out.println("Título: " +sTitulo);
        System.out.println("Director: " + sDirector);
        System.out.println("Duración: " + iDuracion);
        System.out.println("Visto: " + bVisto);
    }

}
