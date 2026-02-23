class PruebasMain  {
	public static void main(String[] args) {
		
		PRO08PPM_Marco marco1;
		PRO08PPM_Boton boton1;
		PRO08PPM_TextoCampo textoCampo1;
		PRO08PPM_TextoArea textoArea1;

		marco1= new PRO08PPM_Marco("Marco",10, 10, 10, 10);
		boton1= new PRO08PPM_Boton("Boton1","Salir",0,0,2,2);
		textoCampo1= new PRO08PPM_TextoCampo("TextoCampo1",1,1,2,2);
		textoArea1= new PRO08PPM_TextoArea("textoArea1",1,1,2,2);

		boton1.pulsar("Boton1","Estoy volando");
		boton1.pulsar("TextoCampo1","Escribe");
		System.out.println(textoArea1.getTexto());

		boton1.color("verde");
	}

}