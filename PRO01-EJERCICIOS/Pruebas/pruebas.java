
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.awt.Color;


class pruebas extends JFrame implements ActionListener {
    
    //Declaraciones

    JButton jbuton1, jbuton2, jbuton3, jbuton4, jbuton5, jbuton6;
    JLabel jlabel1, jlabel2, jlabel3, jlabel4, jlabel5, jlabel6;

    //Constructores
    public pruebas(){
        crear();
    }
    //Métodos
    private void crear(){
        //Frame
        setLayout(null);
        setTitle("PRUEBAS");

        //Button

        jbuton1 = new JButton();
        jbuton1.setBounds(50,50,50,50);
        add(jbuton1);
        jbuton1.setVisible(true);
        jbuton1.addActionListener(this);

        jbuton2 = new JButton();
        jbuton2.setBounds(200,200,50,50);
        add(jbuton2);
        jbuton2.setVisible(true);
        jbuton2.addActionListener(this);
    }
    //Interfaces
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==jbuton1) {
            jbuton1.setBounds(100,100,100,100);
            jbuton1.setBackground(Color.WHITE);
        }

        if (e.getSource()==jbuton2) {
            jbuton2.setBounds(300,300,500,500);
            //Color color1 = new Color(BLACK);
            jbuton2.setBackground(Color.BLACK);
        }
    }

}