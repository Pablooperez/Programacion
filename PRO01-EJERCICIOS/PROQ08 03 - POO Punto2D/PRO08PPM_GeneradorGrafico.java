/*
	PROGRAMA:
		PRO0PPM_GeneradorGrafico

	DESCRIPCION:
		//Constructores
		public PRO08PPM_Punto2D();
		public PRO08PPM_Punto2D(long x, long y);
		public PRO08PPM_Punto2D(long x, long y, String c);
		//**SET/GET/IS**************************************
		public long getX();
		public long getY();
		public boolean getVisible();
		public String getColor();
		public void setColor(String c);
		public void setVisible(boolean v);
		//**MÉTODOS******************************************
		public void desplazamientoAbsoluto(long xAb, long yAb);
		public void desplazamientoRelativo(long xRel, long yRel);
		public void imprimirDatos();




	MÉTODOS:


	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO08PPM_GeneradorGrafico {
    public static void main(String[] args) {

        //Declaraciones

        Scanner sc=new Scanner(System.in);
        int ancho=0;
        int altura=0;
        System.out.print("Dime el ancho del tablero: ");
        ancho=sc.nextInt();
        System.out.print("Dime la altura del tablero: ");
        altura =sc.nextInt();
        PRO08PPM_Punto2D [][] ejeCoordenadas=new PRO08PPM_Punto2D[ancho][altura];

        //Inicio

       
        ejeCoordenadas=inicializa(ejeCoordenadas);


        //Gráfica x=y
        for (int i=0;i<ancho;i++) {
            for (int j=0;j<altura;j++) {
                if (i==j) {
                    ejeCoordenadas[i][j].setVisible(true);
                    ejeCoordenadas[i][j].setColor("Verde");
                }
            }
        }

        System.out.println();

        for (int i=0;i<ancho;i++) {
            for (int j=0;j<altura;j++) {
                if (i==2*j) {
                    ejeCoordenadas[i][j].setVisible(true);
                    ejeCoordenadas[i][j].setColor("Rojo");
                }
            }
        }


        dibujaEjCoordenadas(ejeCoordenadas);
        System.out.println();

        imprimirDatos(ejeCoordenadas);


    }

    //**************************METODOS**************************

    //Metodo para inicializar el tablero
    private static PRO08PPM_Punto2D[][] inicializa(PRO08PPM_Punto2D[][] tablero){

        for (int i=0;i<tablero.length;i++) {
            for (int j=0;j<tablero[0].length;j++) {
                tablero[i][j]=new PRO08PPM_Punto2D(i,j);
            }
        }
        return tablero;
    }

    private static void dibujaEjCoordenadas(PRO08PPM_Punto2D[][] tablero){

        for (int i=tablero.length-1;i>=0;i--) {
            for (int j=0;j<tablero[0].length;j++) {
                tablero[i][j].pinta();
            }
            System.out.println();
        }
    }
    //Metodo para imprimir datos de cada uno de los puntos
    private static void imprimirDatos(PRO08PPM_Punto2D[][] tablero){

        for (int i=0;i<tablero.length;i++) {
            for (int j=0;j<tablero[0].length;j++) {
                tablero[i][j].imprimirDatos();
                System.out.println();
            }
        }
    }
    //Metodo para borrar puntos
    private static void borrarEjCoordenadas(PRO08PPM_Punto2D[][] tablero){

        for (int i=tablero.length-1;i>=0;i--) {
            for (int j=0;j<tablero[0].length;j++) {
                tablero[i][j].setVisible(false);
            }
            System.out.println();
        }

    }

    



}