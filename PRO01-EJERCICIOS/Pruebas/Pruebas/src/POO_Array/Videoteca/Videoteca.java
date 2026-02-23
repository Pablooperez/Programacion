

public class Videoteca {

    private Pelicula[] peliculas;
    private int contador;

    //Constructor
    public Videoteca(int cantidad){
        peliculas=new Pelicula[cantidad];
        contador=0;
    }

    //Métodos
    public void añadirPelicula(Pelicula p){
        if (contador< peliculas.length){
            peliculas[contador]=p;
            contador++;
            System.out.println("Película añadida: " + p.getTitulo());
        }else{
            System.out.println("No se pueden añadir mas películas, videoteca llena.");
        }
    }

    public void mostrarPeliculas(){
        System.out.println("===Películas en la videoteca===");
        for (int i=0;i<contador;i++){
            peliculas[i].mostrarDatos();
            System.out.println("---------------------------");
        }
    }

    public void marcarPeliculaVista(String titulo){
        boolean encontrada=false;
        for (int i=0;i<contador;i++){
            if (peliculas[i].getTitulo().equalsIgnoreCase(titulo)){
                peliculas[i].marcarVisto();
                encontrada=true;
                break;
            }
        }
        if (!encontrada){
            System.out.println("Película no encontrada: " + titulo);
        }
    }
}
