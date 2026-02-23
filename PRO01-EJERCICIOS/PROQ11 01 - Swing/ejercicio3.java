/* 
	PROGRAMA:

	DESCRIPCIÓN:
        Ejercicio3
        Disponer dos botones con las etiquetas "varón" y "mujer".
        Al presionarse, se debe mostrar en el título del JFrame la etiqueta del botón presionado.

	MÉTODOS:

	AUTOR: 
		Pablo Pérez

*/




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class ejercicio3 extends JFrame implements ActionListener {

    // Atributos
    JButton jbVaron;
    JButton jbMujer;

    // Constructor
    public ejercicio3() {
        setLayout(null);
        setTitle("Selecciona sexo");

        // Botón Varón
        jbVaron = new JButton("varón");
        jbVaron.setBounds(50, 50, 100, 30);
        add(jbVaron);
        jbVaron.addActionListener(this);

        // Botón Mujer
        jbMujer = new JButton("mujer");
        jbMujer.setBounds(170, 50, 100, 30);
        add(jbMujer);
        jbMujer.addActionListener(this);
    }

    // Evento
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == jbVaron) {
            setTitle("varón");
        }

        if (e.getSource() == jbMujer) {
            setTitle("mujer");
        }
    }
}
