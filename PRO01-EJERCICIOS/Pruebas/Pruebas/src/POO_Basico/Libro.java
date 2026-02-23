package POO_Basico;

public class Libro {

    //Atributos
    private String sTitulo="";
    private String sAutor="";
    private int numPaginas=0;
    private boolean bPrestado=false;

    //Constructores
    public Libro(String titulo,String autor){
        this.sTitulo=titulo;
        this.sAutor=autor;
        this.numPaginas=0;
        this.bPrestado=false;
    }
    public Libro(String titulo,String autor,int numPaginas){
        this.sTitulo=titulo;
        this.sAutor=autor;
        this.numPaginas=numPaginas;
        this.bPrestado=false;
    }


    //Getter and Setters

    //Métodos
    public void prestar(){
        if (bPrestado){
            System.out.println("El libro ya estaba prestado.");
        }else{
            this.bPrestado=true;
        }
    }

    public void devolver(){
        if (bPrestado){
            this.bPrestado=false;
        }else{
            System.out.println("El libro no estaba prestado.");
        }
    }

    public void mostrarDatos(){
        System.out.println("Título: " + sTitulo);
        System.out.println("Autor: " + sAutor);
        System.out.println("Número de páginas: " + numPaginas);
        System.out.println("¿Está prestado?: " + bPrestado);
    }

}
