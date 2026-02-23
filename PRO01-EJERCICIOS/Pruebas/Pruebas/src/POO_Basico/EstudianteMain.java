package POO_Basico;

class EstudianteMain {
    public static void main(String[] args) {

        Estudiante estudiante1=new Estudiante(12345678,"Pablo Pérez","Primero DAM",660653571,0);
        Estudiante estudiante2=new Estudiante(52463598,"Lucas Pérez","Primero DAM",152465895,0);

        estudiante1.añadirAsigAprob(5);
        estudiante2.añadirAsigAprob(3);
        estudiante1.añadirAsigSus(1);
        estudiante2.añadirAsigSus(1);
        estudiante1.cambiarCurso("Primero DAW");
        estudiante2.cambiarCurso("Segundo DAM");
        estudiante1.pasarCurso();
        System.out.println();
        estudiante1.imprimirDatos();













    }//POO_Basico.Main

}//Class