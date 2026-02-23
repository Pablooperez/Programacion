/*
* Titulo
	Carrera

* Descripcion
	

* Metodos
	
*/

import java.util.Scanner;

class Carrera {
	public static void main(String[] args) {
		
		//Declaraciones
		Scanner sc=new Scanner(System.in);
		LibreriaCarrera lc=new LibreriaCarrera();
		F1 coche14=new F1("ASTON","ALONSO");
		F1 [] participantes;
		int iNumParticipantes=0;
		int distancia=0;
		boolean quedanCoches=true;
		String sPod01="";
		String sPod02="";
		String sPod03="";


		//Creamos/Inicializamos los PARTICIPANTES
		System.out.println("Introduce un número de participantes: ");
		iNumParticipantes=sc.nextInt();

		participantes=new F1[iNumParticipantes];

		for (int i=0;i<participantes.length;i++) {
			participantes[i]=new F1("ESC" + i ,"PIL"+i);
		}

		//Preguntamos por el CIRCUITO
		distancia=lc.circuitos();


		for (int i=0;i<participantes.length;i++) {
			participantes[i].subirPasaj(1);
			participantes[i].arrancar();
			if (i%2==0) {
				lc.dibujaCochePar(participantes[i].getMatricula());
			}else{
				lc.dibujaCocheImpar(participantes[i].getMatricula());
			}
			//participantes[i].imprimeDatos();
			System.out.println();
		}

		//SEMAFORO
		lc.semaforo();

		//CARRERA
		quedanCoches=true;
		do{
			quedanCoches=false;
			for (int i=0;i<participantes.length;i++) {
				if (distancia>participantes[i].getOdo()){
					quedanCoches=true;
					participantes[i].avanzar((int)(Math.random()*1000));
					System.out.println("Distancia total del circuito: "+distancia);
					if (distancia<=participantes[i].getOdo()) {
						System.out.println(participantes[i].getMatricula()+"->**********FIN**********");
						if (sPod01=="") {
							sPod01=participantes[i].getMatricula();
						}else if (sPod02=="") {
							sPod02=participantes[i].getMatricula();
						}else if (sPod03=="") {
							sPod03=participantes[i].getMatricula();
						}
					}
				}
			}
		}while(quedanCoches);

		//FIN
		System.out.println();
		lc.podium(sPod01,sPod02,sPod03);



	}
}

