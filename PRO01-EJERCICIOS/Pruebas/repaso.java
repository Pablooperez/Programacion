public class pruebas {
    public static void main(String[] args) {

       // int[] numeros= new int[5];
        int[] numeros={1,2,3,4,5};

        for (int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }

        for (int n:numeros){
            System.out.println(n);
        }
    //Estos dos bucles for hacen lo mismo.


        int[][] numeros2=new int[3][4];

        int[][] matriz={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        for (int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        System.out.print(matriz[0][0]);//Imprime la fila 0, columna 0, el cual es el 1.
        System.out.println();

        //**EJEMPLO PRÁCTICO**



        int[][] tablero=new int[3][3];
        int numero=1;

        for (int i=0;i< tablero.length;i++){
            for (int j=0;j<tablero[i].length;j++) {
                tablero[i][j] = numero;
                numero++;
            }
        }

        for (int i=0;i< tablero.length;i++){
            for (int j=0;j<tablero[i].length;j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }

        //**FIN**

        //Ejercicio práctico: Matriz de multiplicar
        //Enunciado:
        //Crea un array 2D de 5 filas y 5 columnas.
        //Cada elemento de la matriz debe contener el producto de su fila por su columna.
        //Es decir, matriz[i][j] = i * j.
        //Imprime la matriz en consola de forma ordenada, fila por fila.
        System.out.println("***");
        int[][] array=new int[5][5];
        for (int i=0;i< array.length;i++){
            for (int j=0;j<array[i].length;j++){
                array[i][j]=i*j;
            }
        }

        for (int i=0;i< array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        //Crear números aleatorios

        double aleatorios= Math.random();

        System.out.println(aleatorios);

        //Ahora a un rango de enteros

        int min=1;
        int max=10;

        //int n=(int)(Math.random()*(max-min+1)+min);
        int n=(int)(Math.random()*(10)+1);
        System.out.println(n);

        //Ejercicio práctico: Suma de filas y columnas
        //Enunciado:
        //Crea un array 2D de 4 filas y 4 columnas.
        //Llena la matriz con números aleatorios entre 1 y 10.
        //Imprime la matriz en consola de forma ordenada.
        //Después, calcula e imprime:
        //La suma de cada fila.
        //La suma de cada columna.

        int[][] nuevoarray=new int[4][4];
        int sumafilas=0;
        int sumacolumnas=0;

        for (int i=0;i<nuevoarray.length;i++){
            for (int j=0;j<nuevoarray[i].length;j++){
                nuevoarray[i][j]=(int)(Math.random()*10)+1;
            }
        }

        for (int i=0;i<nuevoarray.length;i++){
            for (int j=0;j<nuevoarray[i].length;j++){
                System.out.print(nuevoarray[i][j]+" ");
            }
            System.out.println();
        }

        for (int i=0;i<nuevoarray.length;i++){
            int sumafila=0;
            for (int j=0;j<nuevoarray[i].length;j++){
                sumafila +=nuevoarray[i][j];
            }
            System.out.println("Fila " + i +": "+sumafila);
        }

        for (int j = 0; j<nuevoarray[0].length; j++){
            int sumacolumna =0;
            for (int i = 0; i <nuevoarray.length; i++){
                sumacolumna +=nuevoarray[i][j];
            }
            System.out.println("Columna " + j +": "+sumacolumna);
        }

    }
}
