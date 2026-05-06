/*
    Para crear un boton, label, textarea... Primero debemos crear el objeto, ubicarlo en una posición del formulario, añadirlo y hacerlo visible. 
    Si queremos que respondo a acciones, lo añadimos a addActionListener.

    DNI -----------------
    NIF -----------------
    CALCULAR SALIR
*/

import javax.swing.*;
import java.awt.event.*;

class pruebas extends JFrame implements ActionListener {
    
    //Declaraciones
    String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
    JTextField jtfDni, jtfNif;
    JLabel jlDni, jlNif;
    JButton jbCalcular, jbSalir;

    //Constructores
    public pruebas(){
        crear();
    }
    //Métodos
    private void crear(){
        setTitle("CALCULADORA NIF");
        setLayout(null);

        jlDni = new JLabel("DNI");
        jlDni.setBounds(25,25,50,50);
        add(jlDni);

        jlNif = new JLabel("NIF");
        jlNif.setBounds(25,100,50,50);
        add(jlNif);

        jtfDni = new JTextField();
        jtfDni.setBounds(70,37,100,25);
        add(jtfDni);

        jtfNif = new JTextField();
        jtfNif.setBounds(70,112,100,25);
        add(jtfNif);

        jbCalcular = new JButton("CALCULAR");
        jbCalcular.setBounds(30,200,100,25);
        add(jbCalcular);
        jbCalcular.addActionListener(this);

        jbSalir = new JButton("SALIR");
        jbSalir.setBounds(150,200,100,25);
        add(jbSalir);
        jbSalir.addActionListener(this);

    }

    public void calcular(){
        int dni = Integer.parseInt(jtfDni.getText());
        int ubicacion = dni%23;
        jtfNif.setText(jtfDni.getText()+letras.charAt(ubicacion));
    
    }

    //Interfaces

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==jbSalir) {
            System.exit(0);
        }

        if (e.getSource()==jbCalcular) {
            calcular();
            
        }
    }

}