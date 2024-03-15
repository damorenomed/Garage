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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import models.Servicio;

/**
 *
 * @author Diego Moreno
 */
public class VentanaServicios extends JDialog {
    
    private JLabel JlbID;
    private JLabel JlbFechaIngreso;
    private JLabel JlbFechaEntrega;
    
    private JTextField JtxtID;
    private JTextField JtxtFechaIngreso;
    private JTextField JtxtFechaEntrega;        
    
    private JButton JbtnAgregarItem;
    private JButton JbtnEliminarItem;
    
    
    private JButton JbtnGuardarServicio;
    private JButton JbtnActualizarServicio;
    private JButton JbtnEliminarServicio;
    private JButton JbtnBuscarServicio;
    
    
    private JTable JtblItems;
    private DefaultTableModel modeloTabla;
    
    private Controlador controlador;

    public VentanaServicios(Controlador controlador) {
        this.controlador = controlador;
        configuracionIniciarVentana();
        agregaPanelFormularioServicios();
    }

    private void configuracionIniciarVentana() {
        setSize(600, 800);
        setLocationRelativeTo(null);
    }

    private void agregaPanelFormularioServicios() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // Etiqueta y campo de texto para ID
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("ID:"), gbc);
        gbc.gridx = 1;
        JtxtID = new JTextField(10);
        JtxtID.setEditable(false);
        panel.add(JtxtID, gbc);

        // Etiqueta y campo de texto para Fecha de Ingreso
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Fecha de Ingreso:"), gbc);
        gbc.gridx = 1;
        JtxtFechaIngreso = new JTextField(20);
        panel.add(JtxtFechaIngreso, gbc);

        // Etiqueta y campo de texto para Fecha de Entrega
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Fecha de Entrega:"), gbc);
        gbc.gridx = 1;
        JtxtFechaEntrega = new JTextField(20);
        panel.add(JtxtFechaEntrega, gbc);

        // Botones
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        JbtnGuardarServicio = new JButton("Agregar");
        panel.add(JbtnGuardarServicio, gbc);

        gbc.gridx = 1;
        JbtnActualizarServicio = new JButton("Actualizar");
        panel.add(JbtnActualizarServicio, gbc);

        gbc.gridx = 2;
        JbtnEliminarServicio = new JButton("Eliminar");
        panel.add(JbtnEliminarServicio, gbc);

        gbc.gridx = 3;
        JbtnBuscarServicio = new JButton("Consultar");
        panel.add(JbtnBuscarServicio, gbc);

        // Configuración de la tabla
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 4;
        modeloTabla = new DefaultTableModel(new Object[]{"ID Item", "Cantidad", "Descripción", "Duración", "Valor Unitario", "Valor Total"}, 0);
        JtblItems = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(JtblItems);
        panel.add(scrollPane, gbc);

        // Agregar el panel al JFrame
        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);

    }

    public String obtenerDatosFormulario() {
        
        return "En construccion";        
    }
    
    public String obtenerIDFormulario(){
        
        return JtxtID.getText();
    }
    
    public void llenarCamposActualizarRegistro(Servicio servicio){
        
    }

    public void limpiarCampos() {
        
    }

    public void habilitarBotonActualizar(boolean habilitar) {
        
    }

    public void habilitarBotonEliminar(boolean habilitar) {
        
    }

    public void habilitarJtxtID(boolean habilitar) {
        
    }

    public void cambiarIdioma(String idioma) {
        
    }
}
