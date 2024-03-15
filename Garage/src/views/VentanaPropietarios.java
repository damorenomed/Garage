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

/**
 *
 * @author Diego Moreno
 */
public class VentanaPropietarios extends JDialog {

    private JLabel JlbID;
    private JLabel JlbNombre1;
    private JLabel JlbNombre2;
    private JLabel JlbApellido1;
    private JLabel JlbApellido2;
    private JLabel JlbNumeroTarjeta;
    private JLabel JlbDireccion;
    private JLabel JlbTelefono;
    private JLabel JlbCorreo;

    private JTextField JtxtID;
    private JTextField JtxtNombre1;
    private JTextField JtxtNombre2;
    private JTextField JtxtApellido1;
    private JTextField JtxtApellido2;
    private JTextField JtxtNumeroTarjeta;
    private JTextField JtxtDireccion;
    private JTextField JtxtTelefono;
    private JTextField JtxtCorreo;

    private JButton JbtnGuardarPropietario;
    private JButton JbtnActualizarPropietario;
    private JButton JbtnEliminarPropietario;
    private JButton JbtnBuscarPropietario;

    private Controlador controlador;

    public VentanaPropietarios(Controlador controlador) {
        this.controlador = controlador;
        configuracionIniciarVentana();
        agregaPanelFormularioPropietarios();
    }

    private void configuracionIniciarVentana() {
        setSize(600, 600);
        setLocationRelativeTo(null);
    }

    private void agregaPanelFormularioPropietarios() {

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);

        JlbID = new JLabel("Identificacion: ");
        panel.add(JlbID, gbc);
        gbc.gridx++;
        JtxtID = new JTextField(20);
        panel.add(JtxtID, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JlbNombre1 = new JLabel("Nombre 1:");
        panel.add(JlbNombre1, gbc);
        gbc.gridx++;
        JtxtNombre1 = new JTextField(20);
        panel.add(JtxtNombre1, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JlbNombre2 = new JLabel("Nombre 2:");
        panel.add(JlbNombre2, gbc);
        gbc.gridx++;
        JtxtNombre2 = new JTextField(20);
        panel.add(JtxtNombre2, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JlbApellido1 = new JLabel("Apellido 1:");
        panel.add(JlbApellido1, gbc);
        gbc.gridx++;
        JtxtApellido1 = new JTextField(20);
        panel.add(JtxtApellido1, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JlbApellido2 = new JLabel("Apellido 2:");
        panel.add(JlbApellido2, gbc);
        gbc.gridx++;
        JtxtApellido2 = new JTextField(20);
        panel.add(JtxtApellido2, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JlbNumeroTarjeta = new JLabel("Número Tarjeta:");
        panel.add(JlbNumeroTarjeta, gbc);
        gbc.gridx++;
        JtxtNumeroTarjeta = new JTextField(20);
        panel.add(JtxtNumeroTarjeta, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JlbDireccion = new JLabel("Dirección:");
        panel.add(JlbDireccion, gbc);
        gbc.gridx++;
        JtxtDireccion = new JTextField(20);
        panel.add(JtxtDireccion, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JlbTelefono = new JLabel("Teléfono:");
        panel.add(JlbTelefono, gbc);
        gbc.gridx++;
        JtxtTelefono = new JTextField(20);
        panel.add(JtxtTelefono, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JlbCorreo = new JLabel("Correo:");
        panel.add(JlbCorreo, gbc);
        gbc.gridx++;
        JtxtCorreo = new JTextField(20);
        panel.add(JtxtCorreo, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        JbtnGuardarPropietario = new JButton("Guardar");
        JbtnGuardarPropietario.addActionListener(controlador);
        JbtnGuardarPropietario.setActionCommand(ActionsConstants.ACTION_BTN_CREATE_PROPIETARIO);
        panel.add(JbtnGuardarPropietario, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JbtnActualizarPropietario = new JButton("Actualizar");
        JbtnActualizarPropietario.addActionListener(controlador);
        JbtnActualizarPropietario.setActionCommand(ActionsConstants.ACTION_BTN_UPDATE_PROPIETARIO);
        panel.add(JbtnActualizarPropietario, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JbtnEliminarPropietario = new JButton("Eliminar");
        JbtnEliminarPropietario.addActionListener(controlador);
        JbtnEliminarPropietario.setActionCommand(ActionsConstants.ACTION_BTN_DELETE_PROPIETARIO);
        panel.add(JbtnEliminarPropietario, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        JbtnBuscarPropietario = new JButton("Buscar");
        JbtnBuscarPropietario.addActionListener(controlador);
        JbtnBuscarPropietario.setActionCommand(ActionsConstants.ACTION_BTN_READ_PROPIETARIO);
        panel.add(JbtnBuscarPropietario, gbc);

        add(panel, BorderLayout.CENTER);

    }

    public String obtenerDatosFormulario() {
        return "Id: " + Integer.valueOf(JtxtID.getText())+
                "Nombre1: " + JtxtNombre1.getText()+
                "Nombre2: " + JtxtNombre2.getText()+
                "Apellido1: " + JtxtApellido1.getText()+
                "Apellido2: " + JtxtApellido2.getText()+
                "N° tarjeta: " + JtxtNumeroTarjeta.getText()+
                "Direccion: " + JtxtDireccion.getText()+
                "Telefono: " + JtxtTelefono.getText()+
                "Correo: " + JtxtCorreo.getText();
    }
    
    public String obtenerIDFormulario(){
        
        return JtxtID.getText();
    }

    public void limpiarCampos() {
        JtxtID.setText("");
        JtxtNombre1.setText("");
        JtxtNombre2.setText("");
        JtxtApellido1.setText("");
        JtxtApellido2.setText("");
        JtxtNumeroTarjeta.setText("");
        JtxtDireccion.setText("");
        JtxtTelefono.setText("");
        JtxtCorreo.setText("");
    }

    public void habilitarBotonActualizar(boolean habilitar) {
        JbtnActualizarPropietario.setEnabled(habilitar);
    }

    public void habilitarBotonEliminar(boolean habilitar) {
        JbtnEliminarPropietario.setEnabled(habilitar);
    }

    public void habilitarJtxtID(boolean habilitar) {
        JtxtID.setEditable(habilitar);
    }

    public void cambiarIdioma(String ACTION_CHANGE_ENG) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
