package Servicio;





import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Expediente {
    private String identificadorUnico;
    private int prioridad;
    private Interesado interesado;
    private String asunto;
    private String documentoReferencia;
    private Date fechaHoraInicio;
    private Date fechaHoraFinalizacion;
    private List<String> documentosProducto;

    public Expediente(String identificadorUnico, int prioridad, Interesado interesado, String asunto, String documentoReferencia) {
        this.identificadorUnico = identificadorUnico;
        this.prioridad = prioridad;
        this.interesado = interesado;
        this.asunto = asunto;
        this.documentoReferencia = documentoReferencia;
        this.fechaHoraInicio = new Date();
        this.documentosProducto = new ArrayList<>();
    }

    public String getIdentificadorUnico() {
        return identificadorUnico;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public Interesado getInteresado() {
        return interesado;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getDocumentoReferencia() {
        return documentoReferencia;
    }

    public Date getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public Date getFechaHoraFinalizacion() {
        return fechaHoraFinalizacion;
    }

    public List<String> getDocumentosProducto() {
        return documentosProducto;
    }

    public void setFechaHoraFinalizacion(Date fechaHoraFinalizacion) {
        this.fechaHoraFinalizacion = fechaHoraFinalizacion;
    }

    public void agregarDocumentoProducto(String documento) {
        documentosProducto.add(documento);
    }

    public void imprimirDetalles() {
        // Imprimir detalles del expediente
    }
}