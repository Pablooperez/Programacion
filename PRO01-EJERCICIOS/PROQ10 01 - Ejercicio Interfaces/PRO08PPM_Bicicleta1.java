class PRO08PPM_Bicicleta1 implements PRO08PPM_Rueda, PRO08PPM_Pedales {
	//Declaraciones
	boolean sentado;
	//Constructores

	public PRO08PPM_Bicicleta1(){

	}

	//Métodos

	public void avanzar(){
		if (this.sentado) {
			System.out.println("La bicicleta avanza");
		}else{
			System.out.println("Necesitas sentarte primero.");
		}
		
	}

	public void detenerse(){
		System.out.println("La bicileta se detiene");
	}

	public void siPedalear(){
		if (this.sentado) {
			System.out.println("Estoy pedaleando");
		this.avanzar();
		}else{
			System.out.println("Necesitas sentarte");
		}
		
	}

	public void noPedalear(){
		System.out.println("No está pedaleando");
		this.detenerse();
	}

	public void sentarse(){
		this.sentado=true;
		System.out.println("Te has sentado");
	}

	public void levantarse(){
		this.sentado=false;
		System.out.println("Te has levantado");
	}
}