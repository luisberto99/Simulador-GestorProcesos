
package gestor;



public class Lista {

	private procesoNuevo Primero;
	private procesoNuevo Ultimo;
	private String Nombre; // CADENA QUE SE UTILIZA PARA IMPRIMIR LA LISTA

	// CONSTURCTOR DE LISTA VACIA
	Lista() {
		this("Lista");

	}

	// Lista Vacia con nombre
	Lista(String nombre) {
		Nombre = nombre;
		Primero = Ultimo = null;
	}

	public boolean Vacia() {
		if (Primero == null)
			return true;
		else
			return false;
	}


	// INSERTA AL FINAL DE LA LISTA
	public void InsertaUltimo(int id,int estado,int prioridad,int catInstruc,int instBloqueo,int evento) {
		if (Vacia()){
			 procesoNuevo nuevo = new procesoNuevo(id,estado,prioridad,catInstruc,instBloqueo,evento);
                         Primero = nuevo;
                         Ultimo = nuevo;
                         
                }else{
			procesoNuevo nuevo = new procesoNuevo(id,estado,prioridad,catInstruc,instBloqueo,evento);
                        Ultimo.setProcesoSiguiente(nuevo);
                        Ultimo = nuevo;
                }
	}


        // busca el id 
        public boolean valID(int id){
            procesoNuevo tempo = Primero;
            while(tempo != null){
                if (tempo.getId() == id) {
                    return true;
                }
                tempo = tempo.getProcesoSiguiente();
            }
            return false;
        }

	
	// ANULA LA LISTA
	public void Anula() {
		Primero = Ultimo = null;
	}

	// IMPRIME LA LISTA
	public void Imprime_Lista() {
            procesoNuevo temp = Primero;
		while (temp != null) {
			
		}
	}
}
