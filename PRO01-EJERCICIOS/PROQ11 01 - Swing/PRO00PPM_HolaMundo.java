/* 
	PROGRAMA:

	DESCRIPCIÓN:

	MÉTODOS:

	AUTOR: 
		Pablo Pérez

*/

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.*;

class PRO00PPM_HolaMundo extends JFrame implements ActionListener {
	//Atributos

	JLabel jlVersion, jlTexto;
	JButton jbSalir,jbVer;

	//Constructores

	public PRO00PPM_HolaMundo(){
		setLayout(null);
		setTitle("Hola mundo, esto es...");

		//JLable
		jlTexto= new JLabel("Esto es un label");
		jlTexto.setBounds(10,0,150,30);
		add(jlTexto);

		jlVersion= new JLabel("Version 1.0");
		jlVersion.setBounds(10,130,150,30);
		add(jlVersion);

		//JButton
		jbSalir=new JButton("Salir");
		jbSalir.setBounds(200,130,60,30);
		add(jbSalir);
		jbSalir.addActionListener(this);

		jbVer=new JButton("Ver");
		jbVer.setBounds(100,130,60,30);
		add(jbVer);
		jbVer.addActionListener(this);



	}

	public PRO00PPM_HolaMundo(String titulo){
		setLayout(null);
		setTitle(titulo);
	}

	//Set get is

	//Métodos

	//Interfaces

	public void actionPerformed(ActionEvent e){
		
		if (e.getSource()==jbSalir) {
			System.exit(0);
		}

		if (e.getSource()==jbVer) {
			jlVersion.setText("Has pulsado ver...");
		}
	
	}


}