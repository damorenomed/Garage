package views;

import controller.Controlador;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import persistencia.GlobalLanguage;

public class MenuPrincipal extends JMenuBar {

    private JMenu JMArchivo;
    private JMenuItem JMISalir;
    private JMenuItem JMICierraSesion;

    private JMenu JMEditar;

    private JMenu JMPropietario;
    private JMenuItem JMINuevoPropietario;

    private JMenu JMVehiculo;
    private JMenuItem JMINuevoVehiculo;

    private JMenu JMServicio;
    private JMenuItem JMINuevoServicio;
    private JMenuItem JMIConceptos;

    private JMenu JMAyuda;
    private JMenuItem JMIAcercaDe;

    private JMenu JMIdiomas;
    private JMenuItem JMIEspañol;
    private JMenuItem JMIIngles;

    private Controlador controlador;

    public MenuPrincipal(Controlador controlador) {
        this.controlador = controlador;
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        addMenuArchivo();
        addMenuPropietarios();
        addMenuVehiculos();
        addMenuServicios();
        addMenuIdiomas();
        addMenuAcercaDe();
        asignarTitulos();
    }

    private void addMenuIdiomas() {
        JMIdiomas = new JMenu();

        JMIEspañol = new JMenuItem();
        JMIEspañol.setIcon(new ImageIcon(getClass().getResource("../resources/icon/spa.png"))); // NOI18N       
        JMIEspañol.setActionCommand(ActionsConstants.ACTION_CHANGE_ES);
        JMIEspañol.addActionListener(controlador);
        JMIdiomas.add(JMIEspañol);

        JMIIngles = new JMenuItem();
        JMIIngles.setIcon(new ImageIcon(getClass().getResource("../resources/icon/eng.png"))); // NOI18N        
        JMIIngles.setActionCommand(ActionsConstants.ACTION_CHANGE_EN);
        JMIIngles.addActionListener(controlador);
        JMIdiomas.add(JMIIngles);

        add(JMIdiomas);
    }

    private void addMenuArchivo() {
        JMArchivo = new JMenu();

        JMISalir = new JMenuItem();
        JMISalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.ALT_DOWN_MASK));
        JMISalir.setIcon(new ImageIcon(getClass().getResource("../resources/icon/exit16px.png"))); // NOI18N        
        JMISalir.setActionCommand(ActionsConstants.ACTION_EXIT);
        JMISalir.addActionListener(controlador);
        JMArchivo.add(JMISalir);

        JMICierraSesion = new JMenuItem("Cerrar Sesion");
        JMICierraSesion.setIcon(new ImageIcon(getClass().getResource("../resources/icon/logout16px.png"))); // NOI18N        
        JMICierraSesion.setActionCommand(ActionsConstants.ACTION_LOGOUT);
        JMICierraSesion.addActionListener(controlador);
        JMArchivo.add(JMICierraSesion);

        add(JMArchivo);
    }

    private void addMenuEditar() {
        JMEditar = new JMenu();
        add(JMEditar);
    }

    private void addMenuPropietarios() {
        JMPropietario = new JMenu();

        JMINuevoPropietario = new JMenuItem();
        JMINuevoPropietario.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        JMINuevoPropietario.setIcon(new ImageIcon(getClass().getResource("../resources/icon/add-user16px.png"))); // NOI18N        
        JMINuevoPropietario.setActionCommand(ActionsConstants.ACTION_MENU_PROPIETARIO);
        JMINuevoPropietario.addActionListener(controlador);

        JMPropietario.add(JMINuevoPropietario);

        add(JMPropietario);
    }

    private void addMenuVehiculos() {

        JMVehiculo = new JMenu();

        JMINuevoVehiculo = new JMenuItem();
        JMINuevoVehiculo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        JMINuevoVehiculo.setIcon(new ImageIcon(getClass().getResource("../resources/icon/add-user16px.png"))); // NOI18N        
        JMINuevoVehiculo.setActionCommand(ActionsConstants.ACTION_MENU_VEHICLE);
        JMINuevoVehiculo.addActionListener(controlador);

        JMVehiculo.add(JMINuevoVehiculo);
        add(JMVehiculo);
    }

    private void addMenuServicios() {
        JMServicio = new JMenu();
        
        JMINuevoServicio = new JMenuItem();
        JMINuevoServicio.setActionCommand(ActionsConstants.ACTION_MENU_SERVICIOS);
        JMINuevoServicio.addActionListener(controlador);
        JMServicio.add(JMINuevoServicio);
        
        JMIConceptos = new JMenuItem();
        JMIConceptos.setActionCommand(ActionsConstants.ACTION_MENU_CONCEPTOS);
        JMIConceptos.addActionListener(controlador);
        JMServicio.add(JMIConceptos);
        add(JMServicio);
    }

    private void addMenuAcercaDe() {
        JMAyuda = new JMenu();

        JMIAcercaDe = new JMenuItem();
        JMAyuda.add(JMIAcercaDe);

        add(JMAyuda);

    }

    public void disableAll() {

    }

    public void enableForUser() {

    }

    public void cambiarIdioma() {
        asignarTitulos();

    }

    private void asignarTitulos() {
        JMArchivo.setText(GlobalLanguage.FILE);
        JMISalir.setText(GlobalLanguage.EXIT);
        JMICierraSesion.setText(GlobalLanguage.LOGOUT);
        
        //JMEditar.setText(GlobalLanguage.EDIT);
        JMPropietario.setText(GlobalLanguage.OWNER);
        JMINuevoPropietario.setText(GlobalLanguage.MANAGE_OWNER);
        JMVehiculo.setText(GlobalLanguage.CAR);
        JMINuevoVehiculo.setText(GlobalLanguage.MANAGE_CAR);
        JMServicio.setText(GlobalLanguage.SERVICES);
        JMINuevoServicio.setText(GlobalLanguage.MANAGE_SERVICE);
        
        JMIConceptos.setText(GlobalLanguage.CONCEPTS);
        JMAyuda.setText(GlobalLanguage.HELP);
        JMIAcercaDe.setText(GlobalLanguage.ABOUT_THIS);        
        
        JMIdiomas.setText(GlobalLanguage.IDIOM);
        JMIEspañol.setText(GlobalLanguage.ES);
        JMIIngles.setText(GlobalLanguage.EN);
    }

}
