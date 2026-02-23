package POO_Basico;

class Estudiante {

    //Atributos

    private int iIdentificador=0;
    private String sNombre="";
    private String sCurso="";
    private int iTel=0;
    private int iAsigAprob=0;
    private boolean bpasarCurso=true;


    //Constructores

    public Estudiante(int identificador,String nombre,String curso,int tel,int asigaprob){
        this.iIdentificador=identificador;
        this.sNombre=nombre;
        this.sCurso=curso;
        this.iTel=tel;
        this.iAsigAprob=asigaprob;

    }

    //Getter and Setters

    public int getIdentificador(){
        return this.iIdentificador;
    }

    public String getNombre(){
        return this.sNombre;
    }

    public String getCurso(){
        return this.sCurso;
    }

    public int getTel(){
        return this.iTel;
    }

    public int getAsigAprob(){
        return this.iAsigAprob;
    }

    public void setIdentificador(int identificador){
        this.iIdentificador=identificador;
    }

    public void setNombre(String nombre){
        this.sNombre=nombre;
    }

    public void setCurso(String curso){
        this.sCurso=curso;
    }

    public void setTel(int tel){
        this.iTel=tel;
    }

    public void setAsigAprob(int asigAprob){
        this.iAsigAprob=asigAprob;
    }


    //Métodos

    public void añadirAsigAprob(int asigAprob){
        this.iAsigAprob+=asigAprob;
    }

    public void añadirAsigSus(int asigSus){
        this.iAsigAprob-=asigSus;
    }

    public void cambiarCurso(String curso){
        this.sCurso=curso;
    }

    public void pasarCurso(){
        bpasarCurso=false;
        if (iAsigAprob<4) {
            System.out.println("No puedes pasar de curso.");
            bpasarCurso=false;
        }else{
            System.out.println("Pasas de curso.");
            bpasarCurso=true;;
        }
    }

    public void imprimirDatos(){
        System.out.println("Identificador: " + iIdentificador);
        System.out.println("Nombre: " + sNombre);
        System.out.println("Curso: " + sCurso);
        System.out.println("Teléfono: " + iTel);
        System.out.println("Asignaturas aprobadas: " + iAsigAprob);
    }


















}