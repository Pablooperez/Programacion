
public class AgendaMain {
    public static void main(String[] args) {

        Agenda agenda=new Agenda(10);

        Contacto c1=new Contacto("Pablo Pérez",660653571,"pablo.perez.martinez99@gmail.com");
        Contacto c2=new Contacto("Papá",619107373,"pepetax@gmail.com");
        Contacto c3=new Contacto("Mamá",651408505,"monicamb@gmail.com");
        Contacto c4=new Contacto("Lucas",678987890,"lukow@gmail.com");

        agenda.añadirContacto(c1);
        agenda.añadirContacto(c2);
        agenda.añadirContacto(c3);
        agenda.añadirContacto(c4);


        agenda.mostrarContactos();

        agenda.marcarFavorito("Pablo Pérez");

       agenda.mostrarContactos();

        agenda.buscarContacto("Pepita");


    }//main

}//class
