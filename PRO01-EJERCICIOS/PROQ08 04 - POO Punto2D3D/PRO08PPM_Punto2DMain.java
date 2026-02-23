/*
	PROGRAMA:
		PRO08PPM_Butaca

	DESCRIPCION:


	MÉTODOS:


	AUTOR:
		Pablo Pérez
*/
class PRO08PPM_Punto2DMain {
    public static void main(String[] args) {
        PRO08PPM_Punto2D p1=new PRO08PPM_Punto2D();
        PRO08PPM_Punto2D p2=new PRO08PPM_Punto2D(0,0);
        PRO08PPM_Punto2D p3=new PRO08PPM_Punto2D(0,0,"Azul");


        p1.imprimirDatos();
        System.out.println();

        p2.imprimirDatos();
        System.out.println();

        p3.imprimirDatos();
        System.out.println();

        p2.setColor("Naranja");
        p2.imprimirDatos();
        System.out.println();

        p1.setColor("Amarillo");
        p1.imprimirDatos();
        System.out.println();

        p1.setVisible(true);
        p1.imprimirDatos();
        System.out.println();

        p1.desplazamientoAbsoluto(4,4);
        p1.imprimirDatos();

        int alto=11;
        int ancho=11;

    

    }
}