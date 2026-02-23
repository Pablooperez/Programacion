

public class Contacto {

    //Atributos
    private String sNombre;
    private int iTel;
    private String sEmail;
    private boolean bEsFavorito;

    //Getters and Setters

    public String getsNombre(){
        return this.sNombre;
    }

    public int getiTel(){
        return this.iTel;
    }

    public String getsEmail(){
        return this.sEmail;
    }

    public boolean getsEsFavorito(){
        return this.bEsFavorito;
    }

    //Constructores
    public Contacto(String nombre,int telefono){
        this.sNombre=nombre;
        this.iTel=telefono;
        this.sEmail=null;
        this.bEsFavorito=false;
    }

    public Contacto(String nombre,int telefono,String email){
        this.sNombre=nombre;
        this.iTel=telefono;
        this.sEmail=email;
        this.bEsFavorito=false;
    }

    //Métodos

    public void marcaFavorito(){
        if (!bEsFavorito){
            bEsFavorito=true;
            System.out.println(sNombre+" marcado como favorito.");
        }
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " +sNombre);
        System.out.println("Teléfono: " +iTel);
        System.out.println("Email: " +sEmail);
        System.out.println("Favorito: " + bEsFavorito);
    }
}
