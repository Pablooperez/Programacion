/* 
	PROGRAMA:

	DESCRIPCIÓN:
        TresEnRaya
        
	MÉTODOS:

	AUTOR: 
		Pablo Pérez

*/

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.awt.Color;

class TresEnRaya extends JFrame implements ActionListener, ItemListener{

	//Declaraciones

	JButton c1, c2, c3, c4, c5, c6, c7, c8, c9, jbIniciarPartida, jbConfiguracion, jbFijarColor, jbSalirConfiguracion;
    JLabel jlGanador, jlTurno, jlR, jlG, jlB, jlNombre1, jlNombre2;
    JComboBox jcR,jcG,jcB;
    JTextField jtNombre1,jtNombre2;
	int iTurno=1;
    boolean bVictoria=false;
    


	public TresEnRaya(){

	//Frame
	setLayout(null);
	setTitle("Tres En Raya");


	//Button
	c1 = new JButton();
        c1.setBounds(130, 100, 80, 80);
        add(c1);
        c1.addActionListener(this);
        
    c2 = new JButton();
        c2.setBounds(210, 100, 80, 80);
        add(c2);
        c2.addActionListener(this);
    c3 = new JButton();
        c3.setBounds(290, 100, 80, 80);
        add(c3);
        c3.addActionListener(this);
    c4 = new JButton();
        c4.setBounds(130, 180, 80, 80);
        add(c4);
        c4.addActionListener(this);  
    c5 = new JButton();
        c5.setBounds(210, 180, 80, 80);
        add(c5);
        c5.addActionListener(this);    
    c6 = new JButton();
        c6.setBounds(290, 180, 80, 80);
        add(c6);
        c6.addActionListener(this);   
    c7 = new JButton();
        c7.setBounds(130, 260, 80, 80);
        add(c7);
        c7.addActionListener(this);   
    c8 = new JButton();
        c8.setBounds(210, 260, 80, 80);
        add(c8);
        c8.addActionListener(this);  
    c9 = new JButton();
        c9.setBounds(290, 260, 80, 80);
        add(c9);
        c9.addActionListener(this);
    jbIniciarPartida = new JButton("Iniciar Partida");
        jbIniciarPartida.setBounds(340, 400, 120, 40);
        add(jbIniciarPartida);
        jbIniciarPartida.addActionListener(this);
    jbConfiguracion = new JButton("Configuración");
        jbConfiguracion.setBounds(40,400,120,40);
        add(jbConfiguracion);
        jbConfiguracion.addActionListener(this);
    jbSalirConfiguracion = new JButton("Salir configuración");
        jbSalirConfiguracion.setBounds(480,400,200,40);
        jbSalirConfiguracion.addActionListener(this);
    jlGanador = new JLabel("GANADOR");
        jlGanador.setBounds(220, 25, 240, 80);
        jlGanador.setVisible(false);
    jlTurno = new JLabel("Turno Jugador 1");
        jlTurno.setBounds(320, 15, 240, 80);
        jlTurno.setVisible(true);
        add(jlTurno);
    jlR = new JLabel("R");
        jlR.setBounds(480,05,60,60);
    jlG = new JLabel("G");
        jlG.setBounds(580,05,60,60);
    jlB = new JLabel("B");
        jlB.setBounds(680,05,60,60);
    jcR = new JComboBox();
        jcR.setBounds(460,45,60,20);
        for(int f=0;f<256;f++) {
        jcR.addItem(String.valueOf(f));
        }
    jcG = new JComboBox();
        jcG.setBounds(560,45,60,20);
        for(int f=0;f<256;f++) {
        jcG.addItem(String.valueOf(f));
        }
    jcB = new JComboBox();
        jcB.setBounds(660,45,60,20);
        for(int f=0;f<256;f++) {
        jcB.addItem(String.valueOf(f));
        }
    jbFijarColor = new JButton("Fijar Color");
        jbFijarColor.setBounds(460,105,120,40);
    jtNombre1 =  new JTextField();
        jtNombre1.setBounds(600,200,120,30);
    jtNombre2 = new JTextField();
        jtNombre2.setBounds(600,300,120,30);
    jlNombre1 = new JLabel("Nombre Jugador 1");
        jlNombre1.setBounds(450,200, 120, 30);
    jlNombre2 = new JLabel("Nombre Jugador 2");
        jlNombre2.setBounds(450,300,120,30);
        

        
    }    

    //Interfaces

    public void actionPerformed(ActionEvent e){
    	System.out.println(iTurno);
        if (e.getSource()==jbIniciarPartida) {
                iniciarPartida();
            }
        if (e.getSource()==jbConfiguracion) {
                configuracion();
            }
        if (e.getSource()==jbFijarColor) {
                String colorR=(String)jcR.getSelectedItem();
                String colorG=(String)jcG.getSelectedItem();
                String colorB=(String)jcB.getSelectedItem();
                int iR=Integer.parseInt(colorR);
                int iG=Integer.parseInt(colorG);
                int iB=Integer.parseInt(colorB);
                Color color1=new Color(iR,iG,iB);
                c1.setBackground(color1);
                c2.setBackground(color1);
                c3.setBackground(color1);
                c4.setBackground(color1);
                c5.setBackground(color1);
                c6.setBackground(color1);
                c7.setBackground(color1);
                c8.setBackground(color1);
                c9.setBackground(color1);
                iTurno=0;
             }   
        if (e.getSource()==jbSalirConfiguracion) {
            salirConfiguracion();
            }
        if (iTurno==1) {
            
    		if (e.getSource()==c1) {
    			c1.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c2) {
    			c2.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c3) {
    			c3.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c4) {
    			c4.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c5) {
    			c5.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c6) {
    			c6.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c7) {
    			c7.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c8) {
    			c8.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c9) {
    			c9.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
            
    	}
    	if (iTurno==2) {
            
    		if (e.getSource()==c1) {
    			c1.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c2) {
    			c2.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c3) {
    			c3.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c4) {
    			c4.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c5) {
    			c5.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c6) {
    			c6.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c7) {
    			c7.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c8) {
    			c8.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c9) {
    			c9.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
            
    	}
    	if (iTurno==3) {
            
    		if (e.getSource()==c1) {
    			c1.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c2) {
    			c2.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c3) {
    			c3.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c4) {
    			c4.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c5) {
    			c5.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c6) {
    			c6.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c7) {
    			c7.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c8) {
    			c8.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c9) {
    			c9.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
            
    	}
    	if (iTurno==4) {
            
    		if (e.getSource()==c1) {
    			c1.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c2) {
    			c2.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c3) {
    			c3.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c4) {
    			c4.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c5) {
    			c5.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c6) {
    			c6.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c7) {
    			c7.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c8) {
    			c8.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c9) {
    			c9.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
            
    	}
    	if (iTurno==5) {
            
    		if (e.getSource()==c1) {
    			c1.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c2) {
    			c2.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c3) {
    			c3.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c4) {
    			c4.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c5) {
    			c5.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c6) {
    			c6.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c7) {
    			c7.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c8) {
    			c8.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c9) {
    			c9.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
            
    	}
    	if (iTurno==6) {
            
    		if (e.getSource()==c1) {
    			c1.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c2) {
    			c2.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c3) {
    			c3.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c4) {
    			c4.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c5) {
    			c5.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c6) {
    			c6.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c7) {
    			c7.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c8) {
    			c8.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c9) {
    			c9.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
            
    	}
    	if (iTurno==7) {
            
    		if (e.getSource()==c1) {
    			c1.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c2) {
    			c2.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c3) {
    			c3.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c4) {
    			c4.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c5) {
    			c5.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c6) {
    			c6.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c7) {
    			c7.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c8) {
    			c8.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c9) {
    			c9.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
            
    	}
    	if (iTurno==8) {
           
    		if (e.getSource()==c1) {
    			c1.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c2) {
    			c2.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c3) {
    			c3.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c4) {
    			c4.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c5) {
    			c5.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c6) {
    			c6.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c7) {
    			c7.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c8) {
    			c8.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
    		if (e.getSource()==c9) {
    			c9.setText("O");
                jlTurno.setText(jtNombre1.getText());
    		}
            
    	}
    	if (iTurno==9) {
            
    		if (e.getSource()==c1) {
    			c1.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c2) {
    			c2.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c3) {
    			c3.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c4) {
    			c4.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c5) {
    			c5.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c6) {
    			c6.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c7) {
    			c7.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c8) {
    			c8.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
    		if (e.getSource()==c9) {
    			c9.setText("X");
                jlTurno.setText(jtNombre2.getText());
    		}
            
    	} 
        
        
        verificarGanador();   
    	aumentarTurno();
        
	}

    public void itemStateChanged(ItemEvent e){

    }

   	//Inicializar partida

    private void iniciarPartida(){

    	//Iniciar Botones
    	c1.setText("");c2.setText("");c3.setText("");
		c4.setText("");c5.setText("");c6.setText("");
		c7.setText("");c8.setText("");c9.setText("");
        iTurno=0;
        jlGanador.setVisible(false);
        activarBotones();
        jlTurno.setText(jtNombre1.getText());
        bVictoria=false;

    }

    private void configuracion(){
        iTurno=0;
        setSize(800,500);
        
        add(jlR);
        jlR.setVisible(true);
        
        add(jlG);
        jlG.setVisible(true);
        
        add(jlB);
        jlB.setVisible(true);
        
        add(jcR);
        jcR.setVisible(true);
        
        add(jcG);
        jcG.setVisible(true);
        
        add(jcB);
        jcB.setVisible(true);
        
        add(jbFijarColor);
        jbFijarColor.addActionListener(this);
        jbFijarColor.setVisible(true);

        add(jtNombre1);
        jtNombre1.setVisible(true);

        add(jtNombre2);
        jtNombre2.setVisible(true);

        add(jlNombre1);
        jlNombre1.setVisible(true);

        add(jlNombre2);
        jlNombre2.setVisible(true);

        add(jbSalirConfiguracion);
        jbSalirConfiguracion.setVisible(true);



    }

    private void salirConfiguracion(){
        setSize(500,500);
        iTurno=0;
        jlR.setVisible(false);
        jlG.setVisible(false);
        jlB.setVisible(false);
        jcR.setVisible(false);
        jcG.setVisible(false);
        jcB.setVisible(false);
        jbFijarColor.setVisible(false);
        jtNombre1.setVisible(false);
        jtNombre2.setVisible(false);
        jlNombre1.setVisible(false);
        jlNombre2.setVisible(false);
        jbSalirConfiguracion.setVisible(false);

    }

    public int aumentarTurno(){
        if (iTurno<=8) {
            iTurno++;
        }
        return iTurno;  
    
    }
    	
    private void verificarGanador(){
       

        if (c1.getText().equals("X")&&c2.getText().equals("X")&&c3.getText().equals("X")) {
            jlGanador.setText("Ganador " + jtNombre1.getText());
            add(jlGanador);
            jlGanador.setVisible(true);
            System.out.println("Ganador" + jtNombre1.getText());
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c4.getText().equals("X")&&c5.getText().equals("X")&&c6.getText().equals("X")) {
            jlGanador.setText("Ganador " + jtNombre1.getText());
            add(jlGanador);
            jlGanador.setVisible(true);
            System.out.println("Ganador" + jtNombre1.getText());
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c7.getText().equals("X")&&c8.getText().equals("X")&&c9.getText().equals("X")) {
            jlGanador.setText("Ganador " + jtNombre1.getText());
            add(jlGanador);
            jlGanador.setVisible(true);
            System.out.println("Ganador" + jtNombre1.getText());
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c1.getText().equals("X")&&c4.getText().equals("X")&&c7.getText().equals("X")) {
            jlGanador.setText("Ganador " + jtNombre1.getText());
            add(jlGanador);
            jlGanador.setVisible(true);
            System.out.println("Ganador" + jtNombre1.getText());
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c2.getText().equals("X")&&c5.getText().equals("X")&&c8.getText().equals("X")) {
            jlGanador.setText("Ganador " + jtNombre1.getText());
            add(jlGanador);
            jlGanador.setVisible(true);
            System.out.println("Ganador" + jtNombre1.getText());
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c3.getText().equals("X")&&c6.getText().equals("X")&&c9.getText().equals("X")) {
            jlGanador.setText("Ganador " + jtNombre1.getText());
            add(jlGanador);
            jlGanador.setVisible(true);
            System.out.println("Ganador" + jtNombre1.getText());
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c1.getText().equals("X")&&c5.getText().equals("X")&&c9.getText().equals("X")) {
            jlGanador.setText("Ganador " + jtNombre1.getText());
            add(jlGanador);
            jlGanador.setVisible(true);
            System.out.println("Ganador" + jtNombre1.getText());
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c3.getText().equals("X")&&c5.getText().equals("X")&&c7.getText().equals("X")) {
            jlGanador.setText("Ganador " + jtNombre1.getText());
            add(jlGanador);
            jlGanador.setVisible(true);
            System.out.println("Ganador" + jtNombre1.getText());
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c1.getText().equals("O")&&c2.getText().equals("O")&&c3.getText().equals("O")) {
            jlGanador.setText("Ganador " + jtNombre2.getText());
            add(jlGanador);
            jlGanador.setVisible(true);
            System.out.println("Ganador" + jtNombre2.getText());
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c4.getText().equals("O")&&c5.getText().equals("O")&&c6.getText().equals("O")) {
            jlGanador.setText("Ganador " + jtNombre2.getText());
            add(jlGanador);
            jlGanador.setVisible(true);
            System.out.println("Ganador" + jtNombre2.getText());
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c7.getText().equals("O")&&c8.getText().equals("O")&&c9.getText().equals("O")) {
            jlGanador.setText("Ganador " + jtNombre2.getText());
            add(jlGanador);
            jlGanador.setVisible(true);
            System.out.println("Ganador" + jtNombre2.getText());
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c1.getText().equals("O")&&c4.getText().equals("O")&&c7.getText().equals("O")) {
            jlGanador.setText("Ganador " + jtNombre2.getText());
            add(jlGanador);
            jlGanador.setVisible(true);
            System.out.println("Ganador" + jtNombre2.getText());
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c2.getText().equals("O")&&c5.getText().equals("O")&&c8.getText().equals("O")) {
            jlGanador.setText("Ganador " + jtNombre2.getText());
            add(jlGanador);
            jlGanador.setVisible(true);
            System.out.println("Ganador" + jtNombre2.getText());
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c3.getText().equals("O")&&c6.getText().equals("O")&&c9.getText().equals("O")) {
            jlGanador.setText("Ganador " + jtNombre2.getText());
            add(jlGanador);
            jlGanador.setVisible(true);
            System.out.println("Ganador" + jtNombre2.getText());
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c1.getText().equals("O")&&c5.getText().equals("O")&&c9.getText().equals("O")) {
            jlGanador.setText("Ganador " + jtNombre2.getText());
            add(jlGanador);
            jlGanador.setVisible(true);
            System.out.println("Ganador" + jtNombre2.getText());
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c3.getText().equals("O")&&c5.getText().equals("O")&&c7.getText().equals("O")) {
            jlGanador.setText("Ganador " + jtNombre2.getText());
            add(jlGanador);
            jlGanador.setVisible(true);
            System.out.println("Ganador" + jtNombre2.getText());
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (iTurno>=9&&bVictoria==false) {
            System.out.println("Partida Terminada");
            add(jlGanador);
            jlGanador.setText("EMPATE");
            jlGanador.setVisible(true);
            desactivarBotones();
            JOptionPane.showMessageDialog(null, "EMPATE", "EMPATE", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void desactivarBotones(){
        
            c1.setEnabled(false);
            c2.setEnabled(false);
            c3.setEnabled(false);
            c4.setEnabled(false);
            c5.setEnabled(false);
            c6.setEnabled(false);
            c7.setEnabled(false);
            c8.setEnabled(false);
            c9.setEnabled(false);
        
    }

    public void activarBotones(){
        
            c1.setEnabled(true);
            c2.setEnabled(true);
            c3.setEnabled(true);
            c4.setEnabled(true);
            c5.setEnabled(true);
            c6.setEnabled(true);
            c7.setEnabled(true);
            c8.setEnabled(true);
            c9.setEnabled(true);
        
    }



	
}