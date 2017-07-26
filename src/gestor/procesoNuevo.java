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
    
   private String id;
   private String estado;
   private String prioridad;
   private String cantidadInstrucciones;
   private String instruccionBloqueo;
   private String evento;

    public procesoNuevo(String id, String estado,String prioridad, String cantidadInstrucciones, String instruccionBloqueo, String evento) {
        this.id = id;
        this.estado = estado;
        this.prioridad = prioridad;
        this.cantidadInstrucciones = cantidadInstrucciones;
        this.instruccionBloqueo = instruccionBloqueo;
        this.evento = evento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCantidadInstrucciones() {
        return cantidadInstrucciones;
    }

    public void setCantidadInstrucciones(String cantidadInstrucciones) {
        this.cantidadInstrucciones = cantidadInstrucciones;
    }

    public String getInstruccionBloqueo() {
        return instruccionBloqueo;
    }

    public void setInstruccionBloqueo(String instruccionBloqueo) {
        this.instruccionBloqueo = instruccionBloqueo;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    
    public String mostrarDatos(){
        return id + "/" + estado + "/" + prioridad + "/" + cantidadInstrucciones + "/" + instruccionBloqueo + "/" + evento;
    }
    
}
