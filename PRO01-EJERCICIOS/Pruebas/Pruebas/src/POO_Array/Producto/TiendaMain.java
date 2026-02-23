
import java.util.Scanner;

public class TiendaMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Tienda tienda=new Tienda(10);

        tienda.añadirProducto(new Producto("Camiseta",20,15));

        tienda.mostrarProductos();

        tienda.venderProducto("Camiseta",3);

        tienda.reponerProducto("Zapatos",10);

        tienda.venderProducto("Gorra",1);

        tienda.mostrarProductos();
    }
}
