package views;

import controller.Controlador;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import models.EstadoVehiculo;
import models.TipoVehiculo;
import models.Vehiculo;

/**
 *
 * @author Diego Moreno
 */
public class VentanaVehiculos extends JDialog {

    private JLabel JlbLetrasPlaca;
    private JLabel JlbNumerosPlaca;
    private JLabel JlbTipoVehiculo;
    private JLabel JlbEstadoVehiculo;
    private JTextField JtxtLetrasPlaca;
    private JTextField JtxtNumerosPlaca;
    private JComboBox<TipoVehiculo> JcbTipoVehiculo;
    private JComboBox<EstadoVehiculo> JcbEstadoVehiculo;
    private JTextField JtxtPropietario;

    private JButton JbtnGuardarVehiculo;
    private JButton JbtnBuscarVehiculo;
    private JButton JbtnActualizarVehiculo;
    private JButton JbtnEliminarVehiculo;

    private JTable tabla;
    private DefaultTableModel modelo;

    private JPanel panelFormularioVehiculo;

    private Controlador controlador;

    public VentanaVehiculos(Controlador controlador) {
        this.controlador = controlador;

        configuracionIniciarVemtana();
        agregaPanelFormularioVehiculo();
    }

    private void configuracionIniciarVemtana() {
        setSize(700, 400);
        setLocationRelativeTo(null);
    }

    private void agregaPanelFormularioVehiculo() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        panelFormularioVehiculo = new JPanel(new GridBagLayout());

        JlbLetrasPlaca = new JLabel("Letras:");
        panelFormularioVehiculo.add(JlbLetrasPlaca, gbc);
        gbc.gridx++;
        JtxtLetrasPlaca = new JTextField(20);
        panelFormularioVehiculo.add(JtxtLetrasPlaca, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JlbNumerosPlaca = new JLabel("Números: ");
        panelFormularioVehiculo.add(JlbNumerosPlaca, gbc);
        gbc.gridx++;
        JtxtNumerosPlaca = new JTextField(20);
        panelFormularioVehiculo.add(JtxtNumerosPlaca, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JlbTipoVehiculo = new JLabel("Tipo de Vehículo:");
        panelFormularioVehiculo.add(JlbTipoVehiculo, gbc);
        gbc.gridx++;
        JcbTipoVehiculo = new JComboBox<>(TipoVehiculo.values());
        panelFormularioVehiculo.add(JcbTipoVehiculo, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JlbEstadoVehiculo = new JLabel("Estado del Vehículo:");
        panelFormularioVehiculo.add(JlbEstadoVehiculo, gbc);
        gbc.gridx++;
        JcbEstadoVehiculo = new JComboBox<>(EstadoVehiculo.values());
        panelFormularioVehiculo.add(JcbEstadoVehiculo, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        panelFormularioVehiculo.add(new JLabel("Propietario:"), gbc);
        gbc.gridx++;
        JtxtPropietario = new JTextField(20);
        panelFormularioVehiculo.add(JtxtPropietario, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        JbtnGuardarVehiculo = new JButton("Guardar");
        JbtnGuardarVehiculo.addActionListener(controlador);
        JbtnGuardarVehiculo.setActionCommand(ActionsConstants.ACTION_BTN_CREATE_VEHICLE);

        panelFormularioVehiculo.add(JbtnGuardarVehiculo, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JbtnActualizarVehiculo = new JButton("Actualizar");
        JbtnActualizarVehiculo.addActionListener(controlador);
        JbtnActualizarVehiculo.setActionCommand(ActionsConstants.ACTION_BTN_UPDATE_VEHICLE);
        panelFormularioVehiculo.add(JbtnActualizarVehiculo, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JbtnEliminarVehiculo = new JButton("Eliminar");
        JbtnEliminarVehiculo.addActionListener(controlador);
        JbtnEliminarVehiculo.setActionCommand(ActionsConstants.ACTION_BTN_DELETE_VEHICLE);
        panelFormularioVehiculo.add(JbtnEliminarVehiculo, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JbtnBuscarVehiculo = new JButton("Buscar");
        JbtnBuscarVehiculo.addActionListener(controlador);
        JbtnBuscarVehiculo.setActionCommand(ActionsConstants.ACTION_BTN_READ_VEHICLE);
        panelFormularioVehiculo.add(JbtnBuscarVehiculo, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;

        setLayout(new BorderLayout());
        add(panelFormularioVehiculo, BorderLayout.CENTER);
    }

    public String obtenerDatosFormulario() {

        return "Placa: " + JtxtLetrasPlaca.getText() + JtxtNumerosPlaca.getText() +
                "Tipo: " + (TipoVehiculo) JcbTipoVehiculo.getSelectedItem()+
                "Estado: " + (EstadoVehiculo) JcbEstadoVehiculo.getSelectedItem()+
                "Prop.: " + Integer.valueOf(JtxtPropietario.getText());
        
    }

    public void limpiarCampos() {
        JtxtLetrasPlaca.setText("");
        JtxtNumerosPlaca.setText("");
        JtxtPropietario.setText("");
    }

    public String obtenerIDFormulario() {

        return JtxtLetrasPlaca.getText() + JtxtNumerosPlaca.getText();
    }

    public void habilitarBotonGuardar(boolean habilitar) {
        JbtnGuardarVehiculo.setEnabled(habilitar);
    }

    public void habilitarBotonActualizar(boolean habilitar) {
        JbtnActualizarVehiculo.setEnabled(habilitar);
    }

    public void habilitarBotonEliminar(boolean habilitar) {
        JbtnEliminarVehiculo.setEnabled(habilitar);
    }

    public void habilitarJtxtPlaca(boolean habilitar) {
        JtxtLetrasPlaca.setEditable(habilitar);
        JtxtNumerosPlaca.setEditable(habilitar);
    }

    public void cambiarIdioma(String ACTION_CHANGE_ENG) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
