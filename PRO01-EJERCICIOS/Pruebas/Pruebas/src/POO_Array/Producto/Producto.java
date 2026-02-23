

public class Producto {

    //Atributos
    private String sNombre="";
    private int iPrecio=0;
    private int iStock=0;

    //Getter and setter
    public String getNombre(){
        return this.sNombre;
    }

    //Constructores
    public Producto(String nombre,int precio){
        this.sNombre=nombre;
        this.iPrecio=precio;
        this.iStock=0;
    }

    public Producto(String nombre,int precio,int stock){
        this.sNombre=nombre;
        this.iPrecio=precio;
        this.iStock=stock;
    }

    //Métodos
    public void vender(int cantidad){
        if (this.iStock>=cantidad){
            this.iStock-=cantidad;
        }else{
            System.out.println("No hay stock suficiente del producto.");
        }
    }

    public void reponer(int cantidad){
        iStock+=cantidad;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + sNombre);
        System.out.println("Precio: " + iPrecio);
        System.out.println("Stock: " + iStock);
    }

}
