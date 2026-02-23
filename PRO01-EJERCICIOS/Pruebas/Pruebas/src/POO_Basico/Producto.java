package POO_Basico;

public class Producto {

    //Atributos
    private String sNombre="";
    private int iPrecio=0;
    private int iStock=0;

    //Constructores

    public Producto(String nombre,int precio){
        this.iPrecio=precio;
        this.iStock=0;
        this.sNombre=nombre;
    }

    public Producto(String nombre,int precio, int stock){
        this.iPrecio=precio;
        this.iStock=stock;
        this.sNombre=nombre;
    }

    //Getter and Setters

    public String getNombre(){
        return this.sNombre;
    }

    public int getPrecio(){
        return this.iPrecio;
    }

    public int getStock(){
        return this.iStock;
    }

    public void setPrecio(int precio){
        this.iPrecio=precio;
    }

    public void setStock(int stock){
        this.iStock=stock;
    }

    public void setNombre(String nombre){
        this.sNombre=nombre;
    }

    public boolean getDisponilidad(){
        boolean bDisponible=false;
        if (iStock>0){
            bDisponible=true;
        }else{
            bDisponible=false;
        }
        return bDisponible;
    }

    //Métodos

    public void vender(int cantidad){
        if (iStock>=cantidad){
            iStock-=cantidad;
            System.out.println("Has vendido " + cantidad + " "+ sNombre);
        }else{
            System.out.println("No puedes vender el producto, ya que no queda stock suficiente.");
        }
        mostrarDatos();
    }

    public void reponer(int cantidad){
        iStock+=cantidad;
        System.out.println("Has repuesto " + cantidad + " unidades del producto " + sNombre);
        mostrarDatos();
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + sNombre+".");
        System.out.println("Precio: " + iPrecio + "€.");
        System.out.println("Stock: " + iStock + " unidades.");
        System.out.println("Disponibilidad: " + getDisponilidad());

    }






}
