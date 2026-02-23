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
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.awt.Color;

class TresEnRayaOptimizado extends JFrame implements ActionListener{
    
	//Declaraciones
	JButton c1, c2, c3, c4, c5, c6, c7, c8, c9, jbIniciarPartida;
    JLabel jlGanador, jlTurno;
	int iTurno=1;
    boolean bVictoria=false;
    Color cyan=new Color(0,255,0);


	public TresEnRayaOptimizado(){

	//Frame
	setLayout(null);
	setTitle("Tres En Raya");

	//Button
	c1 = new JButton();
        c1.setBounds(130, 100, 80, 80);
        add(c1);
        c1.addActionListener(this);
        c1.setBackground(cyan);
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
    jlGanador = new JLabel("GANADOR");
        jlGanador.setBounds(220, 25, 240, 80);
        jlGanador.setVisible(false);
    jlTurno = new JLabel("Turno Jugador 1");
        jlTurno.setBounds(320, 15, 240, 80);
        jlTurno.setVisible(true);
        add(jlTurno);
        
    }    

    //Interfaces

    public void actionPerformed(ActionEvent e){
    	System.out.println(iTurno);
    	if (iTurno==1) {
            
    		if (e.getSource()==c1) {
    			c1.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c2) {
    			c2.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c3) {
    			c3.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c4) {
    			c4.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c5) {
    			c5.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c6) {
    			c6.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c7) {
    			c7.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c8) {
    			c8.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c9) {
    			c9.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
            
    	}
    	if (iTurno==2) {
            
    		if (e.getSource()==c1) {
    			c1.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c2) {
    			c2.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c3) {
    			c3.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c4) {
    			c4.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c5) {
    			c5.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c6) {
    			c6.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c7) {
    			c7.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c8) {
    			c8.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c9) {
    			c9.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
            
    	}
    	if (iTurno==3) {
            
    		if (e.getSource()==c1) {
    			c1.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c2) {
    			c2.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c3) {
    			c3.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c4) {
    			c4.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c5) {
    			c5.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c6) {
    			c6.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c7) {
    			c7.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c8) {
    			c8.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c9) {
    			c9.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
            
    	}
    	if (iTurno==4) {
            
    		if (e.getSource()==c1) {
    			c1.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c2) {
    			c2.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c3) {
    			c3.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c4) {
    			c4.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c5) {
    			c5.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c6) {
    			c6.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c7) {
    			c7.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c8) {
    			c8.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c9) {
    			c9.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
            
    	}
    	if (iTurno==5) {
            
    		if (e.getSource()==c1) {
    			c1.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c2) {
    			c2.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c3) {
    			c3.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c4) {
    			c4.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c5) {
    			c5.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c6) {
    			c6.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c7) {
    			c7.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c8) {
    			c8.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c9) {
    			c9.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
            
    	}
    	if (iTurno==6) {
            
    		if (e.getSource()==c1) {
    			c1.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c2) {
    			c2.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c3) {
    			c3.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c4) {
    			c4.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c5) {
    			c5.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c6) {
    			c6.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c7) {
    			c7.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c8) {
    			c8.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c9) {
    			c9.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
            
    	}
    	if (iTurno==7) {
            
    		if (e.getSource()==c1) {
    			c1.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c2) {
    			c2.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c3) {
    			c3.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c4) {
    			c4.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c5) {
    			c5.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c6) {
    			c6.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c7) {
    			c7.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c8) {
    			c8.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c9) {
    			c9.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
            
    	}
    	if (iTurno==8) {
           
    		if (e.getSource()==c1) {
    			c1.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c2) {
    			c2.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c3) {
    			c3.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c4) {
    			c4.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c5) {
    			c5.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c6) {
    			c6.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c7) {
    			c7.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c8) {
    			c8.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
    		if (e.getSource()==c9) {
    			c9.setText("O");
                jlTurno.setText("Turno Jugador 1");
    		}
            
    	}
    	if (iTurno==9) {
            
    		if (e.getSource()==c1) {
    			c1.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c2) {
    			c2.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c3) {
    			c3.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c4) {
    			c4.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c5) {
    			c5.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c6) {
    			c6.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c7) {
    			c7.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c8) {
    			c8.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
    		if (e.getSource()==c9) {
    			c9.setText("X");
                jlTurno.setText("Turno Jugador 2");
    		}
            
    	} 
        verificarGanador();   
    	aumentarTurno();
        if (e.getSource()==jbIniciarPartida) {
                iniciarPartida();
            }	

	}

   	//Inicializar partida

    private void iniciarPartida(){

    	//Iniciar Botones
    	c1.setText("");c2.setText("");c3.setText("");
		c4.setText("");c5.setText("");c6.setText("");
		c7.setText("");c8.setText("");c9.setText("");
        iTurno=1;
        jlGanador.setVisible(false);
        activarBotones();
        jlTurno.setText("Turno Jugador 1");
        bVictoria=false;

    }

    public int aumentarTurno(){
        if (iTurno<=8) {
            iTurno++;
        }
        return iTurno;  
    
    }
    	
    private void verificarGanador(){
       

        if (c1.getText().equals("X")&&c2.getText().equals("X")&&c3.getText().equals("X")) {
            add(jlGanador);
            jlGanador.setVisible(true);
            System.out.println("Ganador");
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c4.getText().equals("X")&&c5.getText().equals("X")&&c6.getText().equals("X")) {
            System.out.println("Ganador");
            add(jlGanador);
            jlGanador.setVisible(true);
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c7.getText().equals("X")&&c8.getText().equals("X")&&c9.getText().equals("X")) {
            System.out.println("Ganador");
            add(jlGanador);
            jlGanador.setVisible(true);
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c1.getText().equals("X")&&c4.getText().equals("X")&&c7.getText().equals("X")) {
            System.out.println("Ganador");
            add(jlGanador);
            jlGanador.setVisible(true);
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c2.getText().equals("X")&&c5.getText().equals("X")&&c8.getText().equals("X")) {
            System.out.println("Ganador");
            add(jlGanador);
            jlGanador.setVisible(true);
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c3.getText().equals("X")&&c6.getText().equals("X")&&c9.getText().equals("X")) {
            System.out.println("Ganador");
            add(jlGanador);
            jlGanador.setVisible(true);
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c1.getText().equals("X")&&c5.getText().equals("X")&&c9.getText().equals("X")) {
            System.out.println("Ganador");
            add(jlGanador);
            jlGanador.setVisible(true);
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c3.getText().equals("X")&&c5.getText().equals("X")&&c7.getText().equals("X")) {
            System.out.println("Ganador");
            add(jlGanador);
            jlGanador.setVisible(true);
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c1.getText().equals("O")&&c2.getText().equals("O")&&c3.getText().equals("O")) {
            System.out.println("Ganador");
            add(jlGanador);
            jlGanador.setVisible(true);
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c4.getText().equals("O")&&c5.getText().equals("O")&&c6.getText().equals("O")) {
            System.out.println("Ganador");
            add(jlGanador);
            jlGanador.setVisible(true);
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c7.getText().equals("O")&&c8.getText().equals("O")&&c9.getText().equals("O")) {
            System.out.println("Ganador");
            add(jlGanador);
            jlGanador.setVisible(true);
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c1.getText().equals("O")&&c4.getText().equals("O")&&c7.getText().equals("O")) {
            System.out.println("Ganador");
            add(jlGanador);
            jlGanador.setVisible(true);
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c2.getText().equals("O")&&c5.getText().equals("O")&&c8.getText().equals("O")) {
            System.out.println("Ganador");
            add(jlGanador);
            jlGanador.setVisible(true);
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c3.getText().equals("O")&&c6.getText().equals("O")&&c9.getText().equals("O")) {
            System.out.println("Ganador");
            add(jlGanador);
            jlGanador.setVisible(true);
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c1.getText().equals("O")&&c5.getText().equals("O")&&c9.getText().equals("O")) {
            System.out.println("Ganador");
            add(jlGanador);
            jlGanador.setVisible(true);
            bVictoria=true;
            desactivarBotones();
            jlTurno.setText("");
            JOptionPane.showMessageDialog(null, "Victoria", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        if (c3.getText().equals("O")&&c5.getText().equals("O")&&c7.getText().equals("O")) {
            System.out.println("Ganador");
            add(jlGanador);
            jlGanador.setVisible(true);
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