package POO_Basico;

public class LibroMain {
    public static void main(String[] args) {

        Libro libro1=new Libro("El arte de la guerra","XinFu");
        Libro libro2=new Libro("qwer","tyui");
        libro1.prestar();
        System.out.println();
        libro1.prestar();
        System.out.println();
        libro1.devolver();
        System.out.println();
        libro1.mostrarDatos();
        System.out.println();
        libro2.mostrarDatos();





    }//POO_Basico.Main
}//Class
