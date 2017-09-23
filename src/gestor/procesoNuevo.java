/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor;

/**
 *
 * @author ALBERTHO MEDINA
 */
public class procesoNuevo {
    
   private int id;
   private int estado;
   private int prioridad;
   private int cantidadInstrucciones;
   private int instruccionBloqueo;
   private int evento;
   private procesoNuevo procesoSiguiente;

    public procesoNuevo(int id, int estado, int prioridad, int cantidadInstrucciones, int instruccionBloqueo, int evento) {
        this.id = id;
        this.estado = estado;
        this.prioridad = prioridad;
        this.cantidadInstrucciones = cantidadInstrucciones;
        this.instruccionBloqueo = instruccionBloqueo;
        this.evento = evento;
        this.procesoSiguiente = null;
    }

    public procesoNuevo getProcesoSiguiente() {
        return procesoSiguiente;
    }

    public void setProcesoSiguiente(procesoNuevo procesoSiguiente) {
        this.procesoSiguiente = procesoSiguiente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCantidadInstrucciones() {
        return cantidadInstrucciones;
    }

    public void setCantidadInstrucciones(int cantidadInstrucciones) {
        this.cantidadInstrucciones = cantidadInstrucciones;
    }

    public int getInstruccionBloqueo() {
        return instruccionBloqueo;
    }

    public void setInstruccionBloqueo(int instruccionBloqueo) {
        this.instruccionBloqueo = instruccionBloqueo;
    }

    public int getEvento() {
        return evento;
    }

    public void setEvento(int evento) {
        this.evento = evento;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    public String mostrarDatos(){
        return id + "/" + estado + "/" + prioridad + "/" + cantidadInstrucciones + "/" + instruccionBloqueo + "/" + evento;
    }
    
}
