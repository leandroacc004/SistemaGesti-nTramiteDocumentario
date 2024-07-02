package Servicio;


import java.util.Scanner;

public class Administrador {
    private String nombreUsuario;
    private String contrasena;

    public Administrador(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public static String[] autenticar(String nombreUsuario, String contrasena) {
        Scanner scanner = new Scanner(System.in);
        // Array para almacenar el nombre de usuario y la contraseña
        String[] credentials = new String[2];

        // Pedir y capturar el nombre de usuario
        System.out.print("Introduce tu nombre de usuario: ");
        credentials[0] = scanner.nextLine();

        // Pedir y capturar la contraseña
        System.out.print("Introduce tu contraseña: ");
        credentials[1] = scanner.nextLine();

        // Devolver las credenciales
        return credentials;

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