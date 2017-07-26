
package gestor;

public class Lista {

	private Nodo Primero;
	private Nodo Ultimo;
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

	// INSERTA AL INICIO DE LA LISTA
	public void InsertaInicio(Object dato) {
		if (Vacia())
			Primero = Ultimo = new Nodo(dato);
		else
			Primero = new Nodo(dato, Primero);
	}

	// INSERTA AL FINAL DE LA LISTA
	public void InsertaUltimo(Object dato) {
		if (Vacia())
			Primero = Ultimo = new Nodo(dato);
		else
			Ultimo = Ultimo.SiguienteNodo = new Nodo(dato);
	}

	// LOCALIZA UN ELEMENTO EN LA LISTA
	public int Localiza(Object dato) {
		Nodo Temp = Primero;
		int posicion = 0;
		while (Temp != null) {
			if (Temp.Getdato().equals(dato))
				return posicion;
			else
				posicion++;
		}
		return -1;// RETORNA -1 SI NO ENCUENTRA EL DATO

	}

	// RECUPERA EL ELEMENTO DE LA LISTA QUE ESTA EN LA POSICION P
	public Nodo Recupera(int p) {
		Nodo temp = Primero;
		int posicion = 0;
		if (p > Elementos() || p < 0)
			return null;

		while (posicion < p) {
			temp = temp.SiguienteNodo;
			posicion++;
		}
		return temp;
	}

	public void Suprime(int p) {
		if (p < 0 || p > Elementos())
			System.out.println("Elemento no Existe");

		if (p == 0) {
			Primero = Primero.SiguienteNodo;
		} else {
			int cuenta = 0;
			Nodo temp = Primero;
			while (cuenta < p - 1) {
				temp = temp.SiguienteNodo;
				cuenta++;
			}
			temp.SetSiguente(temp.SiguienteNodo.SiguienteNodo);
		}
	}

	// DEVUELVE EL NUMERO DE ELEMENTOS EN LA LISTA
	public int Elementos() {
		Nodo temp = Primero;
		int cuenta = 0;
		if (Vacia())
			return 0;
		else {
			while (temp != null) {
				temp = temp.SiguienteNodo;
				cuenta++;
			}
			return cuenta;
		}
	}

	// DEVUELVE LA PPOSICION SIGUENTE A P
	public Nodo Siguiente(int p) {
		int cuenta = 0;
		if (p < 0 || p > Elementos())
			return null;
		Nodo temp = Primero;
		while (cuenta <= p) {
			temp = temp.Siguiente();
		}
		return temp.Siguiente();
	}

	// DEVUELVE LA POSICION ANTERIOR A P
	public Nodo Anterior(int p) {
		int cuenta = 0;
		if (p < 0 || p > Elementos())
			return null;
		Nodo temp = Primero;
		while (cuenta < p - 1) {
			temp = temp.Siguiente();
		}
		return temp.Siguiente();
	}

	// ANULA LA LISTA
	public void Anula() {
		Primero = Ultimo = null;
	}

	// IMPRIME LA LISTA
	public void Imprime_Lista() {
		Nodo temp = Primero;
		while (temp != null) {
			System.out.println(temp.Getdato());
			temp.Siguiente();
			temp = temp.SiguienteNodo;
		}
	}
}
