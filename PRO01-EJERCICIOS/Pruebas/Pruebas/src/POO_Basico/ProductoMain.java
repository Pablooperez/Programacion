package POO_Basico;

public class ProductoMain {
    public static void main(String[] args) {

        Producto producto1=new Producto("Cuchillas de afeitar",10,20);
        Producto producto2=new Producto("Jabón de manos",3,34);

        producto1.vender(2);
        producto2.vender(34);

        producto2.vender(1);

        producto2.reponer(30);
        producto2.vender(30);

        System.out.println(producto2.getDisponilidad());




    }//main

}//class
