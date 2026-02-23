/*
	PROGRAMA:
		PRO08PPM_Ahoracado

	DESCRIPCION:
		Juego del ahorcado
		
	MÉTODOS:
		public static void main(String[] args) {
		public static vodi dibujaPresentacion(){
		public static void dibujaAhorcado(int iF){
		public static void dibujaFin(){

	AUTOR:
		Pablo Pérez
*/

import java.util.Scanner;

class PRO08PPM_Ahoracado {
	public static void main(String[] args) {
	
		//Declaraciones

		Scanner sc=new Scanner(System.in);
		String sPalabraSecreta="";
		String sPalabraAdivinada="";
		String sletra="";
		int iIntentos=6;
		int iAciertos=0;
		int iFallos=0;
		boolean bpalabraCompleta=false;


		dibujaPresentacion();
	

		System.out.print("Introduce la palabra: ");
		sPalabraSecreta=sc.nextLine().toLowerCase();

		for (int i=0;i<sPalabraSecreta.length();i++) {
				sPalabraAdivinada+="_";
		}//For

		while (iIntentos>0 && !bpalabraCompleta) {

			System.out.println("Palabra: " + sPalabraAdivinada);
			System.out.println("Intentos restantes: " + iIntentos);
			System.out.print("Introduce una letra: ");
			sletra=sc.nextLine().toLowerCase();

			if (sPalabraSecreta.contains(sletra)) {
				
				String sNuevaPalabra="";
				for (int i=0;i<sPalabraSecreta.length();i++) {
					char c=sPalabraSecreta.charAt(i);
					if (c==sletra.charAt(0)) {
						sNuevaPalabra+=sletra;
						iAciertos++;
					}else{
						sNuevaPalabra+=sPalabraAdivinada.charAt(i);
					}//Else

				}//For

				sPalabraAdivinada=sNuevaPalabra;

				if (!sNuevaPalabra.contains("_")) {
					bpalabraCompleta=true;
				}//If

				}else{
				iFallos++;
				iIntentos--;
				System.out.println("¡Letra incorrecta!");
				}//Else
				System.out.println();
				System.out.println("Número de aciertos: " + iAciertos);
				System.out.println("Número de fallos: " + iFallos);
				dibujaAhorcado(iFallos);
			System.out.println();

		}//While
		System.out.println(sPalabraAdivinada);
		if (bpalabraCompleta) {
			System.out.println("¡Felicidades! Has adivinado la palabra " + "(" + sPalabraSecreta + ")");
		}else{
			System.out.println("Has perdido. La palabra era: " + sPalabraSecreta);
		}//Else

		dibujaFin();

	}//Main

	public static void dibujaAhorcado(int iFallos){
        //Declaraciones


        //Mostrar imagen
        switch (iFallos) {
            case 0:
                System.out.println(" ---------------------");
                for (int j = 0; j < 15; j++) {
                    System.out.println(" |");
                }
                System.out.println(" --------------");
                break;

            case 1:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                   ||||| ");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                for (int j = 0; j < 10; j++) {
                    System.out.println(" |");
                }
                System.out.println(" --------------");
                System.out.println(" ");
                break;

            case 2:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                   ||||| ");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(" |");
                }
                System.out.println(" --------------");
                System.out.println(" ");
                break;

            case 3:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                   ||||| ");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                  /  |   ");
                System.out.println(" |                 /   |   ");
                System.out.println(" |                /    |   ");
                System.out.println(" |                     |   ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(" |");
                }
                System.out.println(" --------------");
                System.out.println(" ");
                break;

            case 4:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                   ||||| ");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |  \\ ");
                System.out.println(" |                 /   |   \\ ");
                System.out.println(" |                     |   ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(" |");
                }
                System.out.println(" --------------");
                System.out.println(" ");
                break;

            case 5:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                   ||||| ");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |  \\ ");
                System.out.println(" |                 /   |   \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    /  ");
                System.out.println(" |                   /      ");
                System.out.println(" |                  /       ");
                for (int j = 0; j < 2; j++) {
                    System.out.println(" |");
                }
                System.out.println(" --------------");
                System.out.println(" ");
                break;

            case 6:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                   ||||| ");
                System.out.println(" |                  -------");
                System.out.println(" |                 | X  X  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |  \\ ");
                System.out.println(" |                 /   |   \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    / \\");
                System.out.println(" |                   /   \\  ");
                System.out.println(" |                  /     \\ ");
                for (int j = 0; j < 2; j++) {
                    System.out.println(" |");
                }
                System.out.println(" --------------");
                break;
            } //switch

    }//dibujaAhorcado

	public static void dibujaPresentacion(){
        //Presentacion
    System.out.println("   ___  _   _  _____  _____  _____    ______  _____  _     ");
    System.out.println("  |_  || | | ||  ___||  __ \\|  _  |   |  _  \\|  ___|| |    ");
    System.out.println("    | || | | || |__  | |  \\/| | | |   | | | || |__  | |    ");
   	System.out.println("    | || | | ||  __| | | __ | | | |   | | | ||  __| | |    ");
    System.out.println("/\\__/ /| |_| || |___ | |_\\ \\\\ \\_/ /   | |/ / | |___ | |____");
    System.out.println("\\____/  \\___/ \\____/  \\____/ \\___/    |___/  \\____/ \\_____/");
    System.out.println();

    System.out.println("  ___    _   _   _____  ______   _____    ___   ______   _____ ");
    System.out.println(" / _ \\  | | | | |  _  | | ___ \\ /  __ \\  / _ \\  |  _  \\ |  _  |");
    System.out.println("/ /_\\ \\ | |_| | | | | | | |_/ / | /  \\/ / /_\\ \\ | | | | | | | |");
    System.out.println("|  _  | |  _  | | | | | |    /  | |     |  _  | | | | | | | | |");
    System.out.println("| | | | | | | | \\ \\_/ / | |\\ \\  | \\__/\\ | | | | | |/ /  \\ \\_/ /");
    System.out.println("\\_| |_/ \\_| |_/  \\___/  \\_| \\_|  \\____/ \\_| |_/ |___/    \\___/ ");
    }//dibujaPresentacion

    public static void dibujaFin(){
    System.out.println();
    System.out.println("    _        _        _______  __   __   __            ");
    System.out.println(" /\\| |/\\  /\\| |/\\    |   ____||  | |  \\ |  |     /\\| |/\\  /\\| |/\\ ");
    System.out.println(" \\ ` \' /  \\ ` \' /    |  |__   |  | |   \\|  |     \\ ` \' /  \\ ` \' / ");
    System.out.println("|_     _||_     _|   |   __|  |  | |  . `  |    |_     _||_     _|");
    System.out.println(" / , . \\  / , . \\    |  |     |  | |  |\\   |     / , . \\  / , . \\ ");
    System.out.println(" \\/|_|\\/  \\/|_|\\/    |__|     |__| |__| \\__|     \\/|_|\\/  \\/|_|\\/ ");
    System.out.println();
    }//dibujaFin

}//Class