package gestor;

public class Nodo {
	
	Object dato;
	Nodo SiguienteNodo;
	
	Nodo(Object objeto)
	{
		this(objeto,null);
	}
	
	Nodo(Object objeto, Nodo nodo)
	{
		dato = objeto;
		SiguienteNodo = nodo;
	}
	
	//DEVOLVER REFERENCIA A DATO EN NODO
	Object Getdato()
	{
		return dato;
	}
	
	//DEVOLVER REFERENCIA AL SIGUIENTE NODO EN LA LISTA
	Nodo Siguiente()
	{
		return SiguienteNodo;
	}
	
	//RESIVE EL NODO SIGUENTE
	void SetSiguente(Nodo siguente)
	{
		SiguienteNodo = siguente;
	}
	
	

}
