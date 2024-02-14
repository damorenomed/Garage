package models.DAO;

import java.util.ArrayList;
import models.Concepto;

/**
 *
 * @author Diego Moreno
 */
public class ConceptoDAO implements IDAO<Concepto> {

    @Override
    public Concepto buscarPorID(int id) {
        
        return null;
        
    }

    @Override
    public Concepto buscarPorID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Concepto> listarDatos() {
        
        return null;
        
    }

    @Override
    public void guardaRegistro(Concepto concepto) {
        
    }

    @Override
    public void actualizarRegistro(Concepto concepto) {
        
    }

    @Override
    public void eliminarRegistro(int id) {
        
    }

    @Override
    public void eliminarRegistro(String id) {
    }

}
