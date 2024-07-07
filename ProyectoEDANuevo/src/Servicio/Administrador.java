package Servicio;


import Interfasprueba.InterfazPrincipal;
import java.util.Scanner;

public class Administrador {
    private String nombreUsuario;
    private String contrasena;

    public Administrador(InterfazPrincipal interfazPrincipal) {
        this.nombreUsuario = interfazPrincipal.getFillUsuario().getText();
        this.contrasena = new String(interfazPrincipal.getFillContraseña().getPassword());
    }
    
    public boolean autenticar() {
        if (nombreUsuario.equals("admin") && contrasena.equals("ulima123")) {
            return true; // Autenticación exitosa
        } else {
            return false; // Autenticación fallida
        }
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}