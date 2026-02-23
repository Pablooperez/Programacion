package POO_Basico;

public class PersonaMain {
    public static void main(String[] args) {

        Persona persona1=new Persona("Pablo",15);
        Persona persona2=new Persona("Pablo");
        persona1.mostrarDatos();
        persona1.cumplirAnyos();
        System.out.println();
        persona1.mostrarDatos();

        System.out.println();

        if (persona1.mayoriaEdad()){
            System.out.println("Es mayor de edad.");
        }else{
            System.out.println("No es mayor de edad.");
        }
        persona1.presentarse();

        persona2.presentarse();




    }//POO_Basico.Main

}//Class
