

public class Agenda {

    //Atributos
    private Contacto[] contactos;
    private int contador;

    //Constructor
    public Agenda(int cantidad){
        contactos=new Contacto[cantidad];
        contador=0;
    }

    //Métodos

    public void añadirContacto(Contacto c){
        if (contador<contactos.length){
            contactos[contador]=c;
            contador++;
            System.out.println("Contacto añadido: " + c.getsNombre());
        }else{
            System.out.println("No se pueden añadir más contactos a la agenda.");
        }
    }

    public void mostrarContactos(){
        System.out.println("===Contactos en la Agenda===");
        for (int i=0;i<contador;i++){
            contactos[i].mostrarDatos();
            System.out.println("-------------------");
        }
    }

    public void buscarContacto(String nombre){
        boolean encontrado=false;
        for (int i=0;i<contador;i++){
            if (contactos[i].getsNombre().equalsIgnoreCase(nombre)){
                contactos[i].mostrarDatos();
                encontrado=true;
            }
        }
        if (!encontrado){
            System.out.println("Contacto:" + nombre+" no encontrado en la Agenda.");
        }
    }

    public void marcarFavorito(String nombre){
        boolean encontrado=false;
        for (int i=0;i<contador;i++){
            if (contactos[i].getsNombre().equalsIgnoreCase(nombre)){
                contactos[i].marcaFavorito();
                encontrado=true;
            }
        }
        if (!encontrado){
            System.out.println("Contacto:" + nombre+" no encontrado en la Agenda.");
        }
    }

}
