
/*
	TITULO: 
	
	DESCRIPCIÓN:

	METODOS:
		public void desactivarColor()
		public void activarColor(String sColor)

	AUTOR:
		David

	FECHA: 
*/

class Color {
	//CONSTANTES
	private static final String ANSI_BLACK 	= "\u001B[30m";
	private static final String ANSI_RED 	= "\u001B[31m";
	private static final String ANSI_GREEN 	= "\u001B[32m";
	private static final String ANSI_YELLOW = "\u001B[33m";
	private static final String ANSI_BLUE 	= "\u001B[34m";
	private static final String ANSI_PURPLE = "\u001B[35m";
	private static final String ANSI_CYAN 	= "\u001B[36m";
	private static final String ANSI_WHITE 	= "\u001B[37m";

//**CONSTRUCTORES*********************************


//**METODOS***************************************
	public void desactivarColor(){
		activarColor("Blanco");
	}//desactivarColor

	public void activarColor(String sColor){
		switch (sColor) {
			case "Negro":
				System.out.print(ANSI_BLACK);
				break;
			case "Rojo":
				System.out.print(ANSI_RED);
				break;	
			case "Verde":
				System.out.print(ANSI_GREEN);
				break;				
			case "Amarillo":
				System.out.print(ANSI_YELLOW);
				break;
			case "Azul":
				System.out.print(ANSI_BLUE);
				break;
			case "Purpura":
				System.out.print(ANSI_PURPLE);
				break;
			case "Cian":
				System.out.print(ANSI_CYAN);
				break;
			case "Blanco":	
				System.out.print(ANSI_WHITE);
				break;
			default:
				System.out.print(ANSI_WHITE);
		}//switch
	}//activarColor

}//class