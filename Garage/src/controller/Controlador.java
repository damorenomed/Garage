package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import persistencia.ExceptionFile;
import persistencia.GlobalLanguage;
import views.ActionsConstants;
import views.VentanaConceptos;
import views.VentanaPrincipal;
import views.VentanaPropietarios;
import views.VentanaServicios;
import views.VentanaVehiculos;

/**
 *
 * @author Diego Moreno
 */
public class Controlador implements ActionListener {

    private VentanaPrincipal ventanaPrincipal;
    private VentanaPropietarios ventanaPropietarios;
    private VentanaVehiculos ventanaVehiculos;
    private VentanaServicios ventanaServicios;
    private VentanaConceptos ventanaConceptos;

    public Controlador() {
        try {
            cargarLenguajeSistema();
        } catch (ExceptionFile ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        ventanaPrincipal = new VentanaPrincipal(this);
        ventanaPrincipal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case ActionsConstants.ACTION_EXIT:
                System.exit(0);
                break;
            case ActionsConstants.ACTION_LOGOUT:
                funcionMenuLogOut();
                break;
            case ActionsConstants.ACTION_MENU_PROPIETARIO:
                funcionMenuPropietario();
                break;
            case ActionsConstants.ACTION_BTN_CREATE_PROPIETARIO:
                JOptionPane.showMessageDialog(null, obtenerPropietarioIngresado());
                break;
            case ActionsConstants.ACTION_MENU_VEHICLE:
                funcionMenuVehiculo();
                break;
            case ActionsConstants.ACTION_BTN_CREATE_VEHICLE:
                JOptionPane.showMessageDialog(null, obtenerVehiculoIngresado());
                break;
            case ActionsConstants.ACTION_MENU_SERVICIOS:
                funcionMenuServicios();
                break;
            case ActionsConstants.ACTION_BTN_CREATE_SERVICIOS:
                JOptionPane.showMessageDialog(null, obtenerServicioIngresado());
                break;
            case ActionsConstants.ACTION_MENU_CONCEPTOS:
                funcionMenuConceptos();
                break;
            case ActionsConstants.ACTION_BTN_CREATE_CONCEPTO:
                
                JOptionPane.showMessageDialog(null, obtenerConceptoIngresado());
                break;
            
            case ActionsConstants.ACTION_CHANGE_EN:
                funcionMenuCambioIdiomaIngles();
                break;
            case ActionsConstants.ACTION_CHANGE_ES:
                funcionMenuCambioIdiomaEspañol();
                break;
        }
    }

    private void cargarLenguajeSistema() throws ExceptionFile {
        switch (System.getProperty("user.language")) {
            case "en":
                GlobalLanguage.setLanguage("en-US");
                GlobalLanguage.changeLanguage(GlobalLanguage.LANGUAGE);

            case "es":
            default:
                GlobalLanguage.setLanguage("es-ES");
                GlobalLanguage.changeLanguage(GlobalLanguage.LANGUAGE);
        }
        GlobalLanguage.loadLanguage();
    }

    private void funcionMenuLogOut() {

    }

    private void funcionMenuPropietario() {
        ventanaPropietarios = new VentanaPropietarios(this);
        ventanaPropietarios.setVisible(true);
    }

    private String obtenerPropietarioIngresado() {
        return ventanaPropietarios.obtenerDatosFormulario();
    }

    private void funcionMenuVehiculo() {
        ventanaVehiculos = new VentanaVehiculos(this);
        ventanaVehiculos.setVisible(true);
    }

    private String obtenerVehiculoIngresado() {
        return ventanaVehiculos.obtenerDatosFormulario();
    }

    private void funcionMenuServicios() {
        ventanaServicios = new VentanaServicios(this);
        ventanaServicios.setVisible(true);

    }

    private String obtenerServicioIngresado() {
        return ventanaServicios.obtenerDatosFormulario();
    }

    private void funcionMenuConceptos() {
        ventanaConceptos = new VentanaConceptos(this);
        ventanaConceptos.setVisible(true);
    }
    
    private Object obtenerConceptoIngresado() {
        return ventanaConceptos.obtenerDatosFormulario();
    }

    private void funcionMenuCambioIdiomaIngles() {
        try {
            GlobalLanguage.setLanguage("en-US");
            GlobalLanguage.changeLanguage(GlobalLanguage.LANGUAGE);
            GlobalLanguage.loadLanguage();
        } catch (ExceptionFile ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        ventanaPrincipal.cambiarIdioma();
    }

    private void funcionMenuCambioIdiomaEspañol() {
        try {
            GlobalLanguage.setLanguage("es-ES");
            GlobalLanguage.changeLanguage(GlobalLanguage.LANGUAGE);
            GlobalLanguage.loadLanguage();
        } catch (ExceptionFile ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        ventanaPrincipal.cambiarIdioma();
        
    }

}
