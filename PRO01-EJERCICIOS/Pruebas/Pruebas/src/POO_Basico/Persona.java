package POO_Basico;

public class Persona {

        //Declaraciones

        //Atributos

        private String sNombre=" ";
        private int iEdad=0;


        //Constructor


        public Persona(String nombre){
            this.sNombre=nombre;
            this.iEdad=0;
        }


        public Persona(String nombre,int edad){
            this.sNombre=nombre;
            this.iEdad=edad;
        }

        //Get,Set

    public String getNombre(){
        return this.sNombre;
    }

    public void setNombre(String nombre){
        this.sNombre=nombre;
    }

    public int getEdad(){
        return iEdad;
    }

    public void setEdad(int edad){
        if (edad>=0){
            this.iEdad=edad;
        }else{
            System.out.println("La edad no puede ser negativa.");
        }
    }



        //Métodos
        public void cumplirAnyos(){
            this.iEdad=this.iEdad+1;
        }

        public void mostrarDatos(){
            System.out.println("Nombre: " +sNombre);
            System.out.println("Edad: "+ iEdad);
        }

        public boolean mayoriaEdad(){
            return this.iEdad >= 18;
        }

        public void presentarse(){
            System.out.println("Hola, me llamo " +sNombre+" y tengo " +iEdad+" años.");
        }

}
