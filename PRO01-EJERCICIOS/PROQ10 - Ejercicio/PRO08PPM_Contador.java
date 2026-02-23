
import java.util.Scanner;

class PRO08PPM_Contador {
	public static void main(String[] args) {
		//Declaraciones
		System.out.println(19852840%23);

		Scanner sc=new Scanner(System.in);

		int [] contadores=new int [256];
		String iTexto;

		//Inicio
		System.out.println("Introduce el texto: ");
		iTexto=sc.nextLine();

		for (int i=0;i<iTexto.length();i++) {
			System.out.println(i);
			char Ccaracter=iTexto.charAt(i);
			int iCodigoASCI=(int) Ccaracter;
			System.out.println(Ccaracter+ " " + iCodigoASCI);
			if (iCodigoASCI<256) {
				contadores[iCodigoASCI]++;
			}
			
		}

		for (int i=0;i<contadores.length;i++) {
			if (contadores[i]>0) {
				System.out.println("Carácter "+ (char) i + " ||" + " Repeticiones: " + contadores[i]);
			}
		}
	}
}