package Servicio;



import java.util.ArrayList;
import java.util.List;
import TDA.ListaEnlazada;



public class Dependencia {
    private String nombre;
    private List<Expediente> expedientesEnTramite;

    public Dependencia(String nombre) {
        this.nombre = nombre;
        this.expedientesEnTramite = new ArrayList<>();
    }

    public void agregarExpediente(Expediente expediente) {
        expedientesEnTramite.add(expediente);
    }

    public void eliminarExpediente(Expediente expediente) {
        expedientesEnTramite.remove(expediente);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Expediente> getExpedientesEnTramite() {
        return expedientesEnTramite;
    }

    public void setExpedientesEnTramite(List<Expediente> expedientesEnTramite) {
        this.expedientesEnTramite = expedientesEnTramite;
    }
}