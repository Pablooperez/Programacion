/* 
	PROGRAMA:

	DESCRIPCIÓN:
        Ejercicio2
        Crear tres objetos JLabel, ubicarlos uno debajo del otro y mostrar nombres de colores.

	MÉTODOS:

	AUTOR: 
		Pablo Pérez

*/
import javax.swing.JFrame;
import javax.swing.JLabel;
class ejercicio2 extends JFrame {

    public ejercicio2(){
        setLayout(null);

        JLabel objeto1, objeto2,objeto3;

        objeto1=new JLabel("Rojo");
        objeto1.setBounds(200,0, 150, 150);
        add(objeto1);

        objeto2=new JLabel("Amarillo");
        objeto2.setBounds(200,200, 150, 150);
        add(objeto2);

        objeto3=new JLabel("Verde");
        objeto3.setBounds(200, 400, 150, 150);
        add(objeto3);


    }


}