package views;

import controller.Controlador;
import javax.swing.JFrame;

/**
 *
 * @author Diego Moreno
 */
public class VentanaPrincipal extends JFrame {

    private MenuPrincipal menuPrincipal;
    private Controlador controlador;

    public VentanaPrincipal(Controlador controlador) {
        this.controlador = controlador;
        configurarInterfaz();
        agregarMenuPrincipal();
    }

    private void configurarInterfaz() {
        setTitle("Taller de Carros");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void mostrarVentanaPrincipal() {

        crearComponentes();
    }

    private void crearComponentes() {

    }

    private void agregarMenuPrincipal() {
        menuPrincipal = new MenuPrincipal(controlador);
        setJMenuBar(menuPrincipal);
    }

    public void cambiarIdioma() {
        menuPrincipal.cambiarIdioma();

    }



}
