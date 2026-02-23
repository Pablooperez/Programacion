class PRO08PPM_Coche1 implements PRO08PPM_Rueda {
	//Declaraciones
	boolean sentado;
	boolean acelerando;
	//Constructores
	public PRO08PPM_Coche1(){

	}

	//Métodos

	public void avanzar(){
		if (this.acelerando) {
			System.out.println("El coche avanza");
		}else{
			System.out.println("Necesitas primero acelerar");
		}
		
	}

	public void detenerse(){
		if (this.acelerando) {
			System.out.println("No puedes detenerte si no estás decelerando");
		}else{
			System.out.println("El coche se detiene");
		}
		
	}

	public void sentarse(){
		this.sentado=true;
		System.out.println("Te has sentado");
	}

	public void levantarse(){
		this.sentado=false;
		System.out.println("Te has levantado");
	}

	public void acelerar(){
		if (this.sentado) {
			System.out.println("Estás acelerando");
			this.acelerando=true;
			this.avanzar();
			
		}else{
			System.out.println("Necesitas primero sentarte");
		}
	}

	public void decelerar(){
		if (this.sentado) {
			if (this.acelerando) {
				System.out.println("Estás decelerando");
				this.acelerando=false;
			}else{
				System.out.println("Necesitas primero estar acelerando");
			}
		}else{
			System.out.println("Necesitas sentarte primero");
		}
	}

}