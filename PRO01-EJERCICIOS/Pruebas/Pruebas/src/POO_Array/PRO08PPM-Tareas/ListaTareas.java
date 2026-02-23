/* 
-La lista de tareas:

Guarda un array de tareas

Controla cuántas tareas hay realmente

-Debe permitir:

Añadir una tarea a la lista

Mostrar todas las tareas

Marcar una tarea como completada buscando por su título

Buscar y mostrar una tarea concreta por su título
*/
public class ListaTareas {
	
	//Atributos

	private Tarea[] tareas;
	private int contador;

	//Constructor

	public ListaTareas(int cantidad){
		tareas=new Tarea[cantidad];
		contador=0;
	}

	//Métodos

	public void añadirTarea(Tarea t){
		if (contador<tareas.length){
			tareas[contador]=t;
			contador++;
			System.out.println("Tarea: " + t.getTitulo() + " añadida correctamente");
		}else{
			System.out.println("No se pueden añadir más tareas a la lista.");
		}
	}

	public void mostrarTareas(){
		System.out.println("======Lista de tareas======");
		for (int i=0;i<contador;i++) {
			tareas[i].mostrarDatos();
			System.out.println("-------------------------");
		}
	}

	public void tareaCompletadaTit(String titulo){
		boolean encontrada=false;
		for (int i=0;i<contador;i++) {
			if (tareas[i].getTitulo().equalsIgnoreCase(titulo)) {
				tareas[i].tareaCompletada();
				encontrada=true;
				System.out.println("Tarea: " + titulo + " completada");
				
			}
		}

		if (!encontrada) {
			System.out.println("Tarea: "+titulo+" no encontrada.");
		}
	}

	public void mostrarTarea(String titulo){
		boolean encontrada=false;
		for (int i=0;i<contador;i++) {
			if (tareas[i].getTitulo().equalsIgnoreCase(titulo)) {
				encontrada=true;
				tareas[i].mostrarDatos();
				
			}
			
		}

		if (!encontrada) {
			System.out.println("Tarea: " + titulo + " no encontrada.");
		}
	}





}