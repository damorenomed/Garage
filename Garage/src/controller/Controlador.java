package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Concepto;
import models.EstadoVehiculo;
import models.Factura;
import models.ItemServicio;
import models.Propietario;
import models.Servicio;
import models.TipoVehiculo;
import models.Vehiculo;
import views.MenuPrincipal;
import views.VentanaPrincipal;

/**
 *
 * @author Diego Moreno
 */
public class Controlador implements ActionListener{
    
    private Propietario propietario;
    private Vehiculo vehiculo;
    private Servicio servicio;
    private Factura factura;

    private VentanaPrincipal ventanaPrincipal;
    private MenuPrincipal menuPrincipal;
    
    public Controlador() {
        ventanaPrincipal = new VentanaPrincipal(this);
        menuPrincipal = new MenuPrincipal(this);
        ventanaPrincipal.setJMenuBar(menuPrincipal);
        ventanaPrincipal.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
    
    
    
}

