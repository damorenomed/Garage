package views;

import controller.Controlador;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import models.Concepto;

/**
 *
 * @author Diego Moreno
 */
public class VentanaConceptos extends JDialog {

    private JLabel JlbID;
    private JLabel JlbDescripcion;    
    private JLabel JlbCosto;
        
    private JTextField JtxtID;
    private JTextField JtxtDescripcion;    
    private JTextField JtxtCosto;
    
    private JButton JbtnGuardarConcepto;
    private JButton JbtnActualizarConcepto;
    private JButton JbtnEliminarConcepto;
    private JButton JbtnBuscarConcepto;

    private Controlador controlador;

    public VentanaConceptos(Controlador controlador) {
        this.controlador = controlador;
        configuracionIniciarVentana();
        agregaPanelFormularioConceptos();
    }

    private void configuracionIniciarVentana() {
        setSize(600, 600);
        setLocationRelativeTo(null);
    }

    private void agregaPanelFormularioConceptos() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);

        JlbID = new JLabel("ID:");
        panel.add(JlbID,gbc);
        gbc.gridx++;
        JtxtID = new JTextField(20);
        panel.add(JtxtID, gbc);
        
        gbc.gridx = 0;
        gbc.gridy++;
        JlbDescripcion = new JLabel("Descripción:");
        panel.add(JlbDescripcion,gbc);
        gbc.gridx++;
        JtxtDescripcion = new JTextField(20);
        panel.add(JtxtDescripcion, gbc);        

        // Etiqueta y campo Costo
        gbc.gridx = 0;
        gbc.gridy++;
        JlbCosto = new JLabel("Costo:");
        panel.add(JlbCosto,gbc);
        gbc.gridx++;
        JtxtCosto = new JTextField(20);
        panel.add(JtxtCosto, gbc);

        // Botones
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        JbtnGuardarConcepto = new JButton("Guardar");
        JbtnGuardarConcepto.addActionListener(controlador);
        JbtnGuardarConcepto.setActionCommand(ActionsConstants.ACTION_BTN_CREATE_CONCEPTO);
        panel.add(JbtnGuardarConcepto, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JbtnActualizarConcepto = new JButton("Actualizar");
        JbtnActualizarConcepto.addActionListener(controlador);
        JbtnActualizarConcepto.setActionCommand(ActionsConstants.ACTION_BTN_UPDATE_CONCEPTO);
        panel.add(JbtnActualizarConcepto, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JbtnEliminarConcepto = new JButton("Eliminar");
        JbtnEliminarConcepto.addActionListener(controlador);
        JbtnEliminarConcepto.setActionCommand(ActionsConstants.ACTION_BTN_DELETE_CONCEPTO);
        panel.add(JbtnEliminarConcepto, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JbtnBuscarConcepto = new JButton("Buscar");
        JbtnBuscarConcepto.addActionListener(controlador);
        JbtnBuscarConcepto.setActionCommand(ActionsConstants.ACTION_BTN_READ_CONCEPTO);
        panel.add(JbtnBuscarConcepto, gbc);
               
        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
        
    }

    public String obtenerDatosFormulario() {
        return "Id: " + Integer.valueOf(JtxtID.getText())+
               "Descr.: " +  JtxtDescripcion.getText()+                 
               "Costo: " + Integer.valueOf(JtxtCosto.getText())              
        ;
    }
    
    public String obtenerIDFormulario(){        
        return JtxtID.getText();
    }

    public void limpiarCampos() {
        JtxtID.setText("");
        JtxtDescripcion.setText("");        
        JtxtCosto.setText("");                
    }

    public void habilitarBotonActualizar(boolean habilitar) {
        JbtnActualizarConcepto.setEnabled(habilitar);
    }

    public void habilitarBotonEliminar(boolean habilitar) {
        JbtnEliminarConcepto.setEnabled(habilitar);
    }

    public void habilitarJtxtID(boolean habilitar) {
        JtxtID.setEditable(habilitar);
    }

    public void cambiarIdioma(String idioma) {
       asignarTitulos(); 
    }

    private void asignarTitulos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
