package SistemaGestion;

import Servicio.Administrador;
import Servicio.Dependencia;
import Servicio.Expediente;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class SistemaGestion {
    private List<Expediente> listaExpedientes;
    private Queue<Expediente> colaExpedientesPorAtender;
    private Stack<Expediente> pilaExpedientesFinalizados;
    private Administrador administrador;

    public SistemaGestion(Administrador administrador) {
        this.administrador = administrador;
        this.listaExpedientes = new ArrayList<>();
        this.colaExpedientesPorAtender = new LinkedList<>();
        this.pilaExpedientesFinalizados = new Stack<>();
    }

    public void registrarExpediente(Expediente expediente) {
        // FALTA  registrar un nuevo expediente
    }

    public void registrarMovimiento(Expediente expediente, Dependencia dependencia) {
        // FALTA   registrar el movimiento de un expediente
    }

    public void finalizarTramite(Expediente expediente) {
        // FALTA   finalizar un trámite
    }

    public void proporcionarSeguimiento(String identificadorUnico) {
        // FALTA   proporcionar el seguimiento de un expediente
    }

    public void mostrarAlertas() {
        // FALTA   mostrar alertas de expedientes no atendidos
    }

}