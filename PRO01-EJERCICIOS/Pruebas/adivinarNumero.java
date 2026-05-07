import java.util.Scanner;

class adivinarNumero  {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numeroFinal = (int)(Math.random()*100)+1;
		int numero;

		System.out.println(numeroFinal);

		System.out.println("Adivina el número del 1 al 100: ");

		numero = sc.nextInt();

		while (numero!=numeroFinal){
			if (numeroFinal>numero) {
				System.out.println("Más alto");
			}
			if (numeroFinal<numero) {
				System.out.println("Más bajo");
			}
			numero=sc.nextInt();
		}

		System.out.println("Correcto.");

	}
}