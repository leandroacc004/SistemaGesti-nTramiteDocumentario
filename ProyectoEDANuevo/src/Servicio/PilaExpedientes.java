/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import TDA.Nodo;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manue
 */
public class PilaExpedientes {
    public Nodo<Expediente> top;
    private DefaultTableModel tablaExpedienteModel;
    private DefaultTableModel tablaExpedientesIndustrialModel;  
    
    
    public PilaExpedientes() {
        this.top = null;
    }

    public boolean estaVacia() {
        return top == null;
    }

    public void push(Expediente expediente) {
    if (estaVacia()) {
        Nodo<Expediente> nuevoNodo = new Nodo<>(expediente);
        top = nuevoNodo;
    } else {
        Nodo<Expediente> nodoActual = top;
        Nodo<Expediente> nodoAnterior = null;
        while (nodoActual != null && nodoActual.getValue().getPrioridad().compareTo(expediente.getPrioridad()) > 0) {
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.getNext();
        }
        Nodo<Expediente> nuevoNodo = new Nodo<>(expediente);
        if (nodoAnterior == null) {
            nuevoNodo.setNext(top);
            top = nuevoNodo;
        } else {
            nuevoNodo.setNext(nodoActual);
            nodoAnterior.setNext(nuevoNodo);
        }
        
    if (tablaExpedienteModel != null) {
        tablaExpedienteModel.addRow(new Object[]{
            expediente.getIdentificadorUnico(),
            expediente.getNombres(),
            expediente.getApellidos(),
            expediente.getDNI(),
            expediente.getPrioridad(),
            expediente.getAsunto()
        });
    }

    if (tablaExpedientesIndustrialModel != null) {
        tablaExpedientesIndustrialModel.addRow(new Object[]{
            expediente.getIdentificadorUnico(),
            expediente.getNombres(),
            expediente.getApellidos(),
            expediente.getDNI(),
            expediente.getPrioridad(),
            expediente.getAsunto()
        });
    }
        
    }
    // Mostrar los datos del nuevo nodo en la consola
    System.out.println("Nuevo nodo ingresado:");
    System.out.println("Identificador Único: " + expediente.getIdentificadorUnico());
    System.out.println("Prioridad: " + expediente.getPrioridad());
    System.out.println("DNI: " + expediente.getDNI());
    System.out.println("Nombres: " + expediente.getNombres());
    System.out.println("Apellidos: " + expediente.getApellidos());
    System.out.println("Asunto: " + expediente.getAsunto());
    System.out.println("Archivo: " + expediente.getArchivoSeleccionado().getName());
    System.out.println("------------");
    }

    public Expediente pop() {
        if (!estaVacia()) {
            Expediente expediente = top.getValue();
            top = top.getNext();
            return expediente;
        }
        return null;
    }

    public Expediente peek() {
        if (!estaVacia()) {
            return top.getValue();
        }
        return null;
    }

    public void mostrarPila(StringBuilder texto) {
        Nodo<Expediente> nodoActual = top;
        while (nodoActual != null) {
            Expediente expediente = nodoActual.getValue();
            texto.append("Identificador Único: ").append(expediente.getIdentificadorUnico()).append("\n");
            texto.append("Prioridad: ").append(expediente.getPrioridad()).append("\n");
            texto.append("DNI: ").append(expediente.getDNI()).append("\n");
            texto.append("Nombres: ").append(expediente.getNombres()).append("\n");
            texto.append("Apellidos: ").append(expediente.getApellidos()).append("\n");
            texto.append("Asunto: ").append(expediente.getAsunto()).append("\n");
            texto.append("Archivo: ").append(expediente.getArchivoSeleccionado().getName()).append("\n");
            texto.append("------------").append("\n");
            nodoActual = nodoActual.getNext();
        }
    }
}
