/* 
En el main debes:

Crear una lista de tareas

Crear varias tareas

Añadirlas a la lista

Mostrar todas las tareas

Marcar alguna como completada

Volver a mostrar las tareas

Buscar una tarea que exista y otra que no
*/

public class ListaTareasMain {
	public static void main(String[] args) {
		
		ListaTareas listaTareas1=new ListaTareas(5);

		Tarea t1=new Tarea("Comprar la comida");
		Tarea t2=new Tarea("Beber agua");

		listaTareas1.añadirTarea(t1);
		listaTareas1.añadirTarea(t2);

		listaTareas1.mostrarTareas();

		listaTareas1.tareaCompletadaTit("Comprar la comida");

		listaTareas1.mostrarTareas();

		listaTareas1.mostrarTarea("Comprar la comida");

		listaTareas1.tareaCompletadaTit("beber agua");
		System.out.println();
		listaTareas1.mostrarTareas();


	}
}