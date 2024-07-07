package Servicio;





import java.io.File;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Expediente {
    private String identificadorUnico;
    private String prioridad;
    private String dni;
    private String nombres;
    private String apellidos;
    private String asunto;
    private File archivoSeleccionado;
    private String dependencia;
    //NUEVO LOCAL TIMEE
    private LocalDateTime fechaIngreso;

    public Expediente(String identificadorUnico, String prioridad, String dni, String nombres, String apellidos, String asunto, File archivoSeleccionado, String dependencia) {
        this.identificadorUnico = identificadorUnico;
        this.prioridad = prioridad;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.asunto = asunto;
        this.archivoSeleccionado = archivoSeleccionado;
        this.dependencia = dependencia;
        //NUEVO LOCAL TIME
        this.fechaIngreso = LocalDateTime.now();
    }

    public String getIdentificadorUnico() {
        return identificadorUnico;
    }

    public void setIdentificadorUnico(String identificadorUnico) {
        this.identificadorUnico = identificadorUnico;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getDNI() {
        return dni;
    }

    public void setDNI(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public File getArchivoSeleccionado() {
        return archivoSeleccionado;
    }

    public void setArchivoSeleccionado(File archivoSeleccionado) {
        this.archivoSeleccionado = archivoSeleccionado;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    
    //NUEVO
    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public Object getInteresado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
