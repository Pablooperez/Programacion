

public class VideotecaMain {
    public static void main(String[] args) {

        Videoteca videoteca=new Videoteca(5);

        Pelicula p1=new Pelicula("El padrino","Francis Ford Coppola",175);
        Pelicula p2=new Pelicula("Avatar","James Cameron",180);
        Pelicula p3=new Pelicula("Los Simpsons","Groening",500);

        videoteca.añadirPelicula(p1);
        System.out.println();
        videoteca.añadirPelicula(p2);
        System.out.println();
        videoteca.añadirPelicula(p3);
        System.out.println();

        videoteca.mostrarPeliculas();
        System.out.println();
        videoteca.marcarPeliculaVista("El padrino");
        System.out.println();
        videoteca.marcarPeliculaVista("Avatar");
        System.out.println();
        videoteca.mostrarPeliculas();
        System.out.println();
       videoteca.marcarPeliculaVista("Titanic");




    }//main
}//class
