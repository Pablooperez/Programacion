

public class Tienda {

    //Atributos
    private Producto[] productos;
    private int contador;

    //Constructores
    public Tienda(){
        productos=new Producto[10];
        contador=0;
    }

    public Tienda(int capacidad){
        productos = new Producto[capacidad];
        contador = 0;
    }


    //Métodos
    public void añadirProducto(Producto p){
        if (contador<productos.length){
            productos[contador]=p;
            contador++;
            System.out.println("Producto añadido: " + p.getNombre());
        }else{
            System.out.println("No se pueden añadir mas productos, tienda llena.");
        }
    }

    public void venderProducto(String nombre, int cantidad){
        boolean encontrado=false;
        for (int i=0;i<contador;i++){
            if (productos[i].getNombre().equalsIgnoreCase(nombre)){
                productos[i].vender(cantidad);
                encontrado=true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Producto no encontrado: " + nombre);
        }
    }

    public void reponerProducto(String nombre, int cantidad){
        boolean encontrado=false;
        for (int i=0;i<contador;i++){
            if (productos[i].getNombre().equalsIgnoreCase(nombre)){
                productos[i].reponer(cantidad);
                encontrado=true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Producto no encontrado: " + nombre);
        }
    }

    public void mostrarProductos(){
        System.out.println("===Productos en la tienda===");
        for (int i=0;i<contador;i++){
            productos[i].mostrarDatos();
            System.out.println("------------------------");
        }
    }

}
