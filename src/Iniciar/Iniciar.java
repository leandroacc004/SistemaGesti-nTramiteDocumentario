

package Iniciar;


import javax.swing.SwingUtilities;
import Interfasprueba.InterfazPrincipal;

public class Iniciar {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                InterfazPrincipal interfaz = new InterfazPrincipal();
                interfaz.setVisible(true);
            }
        });
    }
}
