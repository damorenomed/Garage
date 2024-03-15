package models.DAO;

import java.util.ArrayList;
import models.Vehiculo;

/**
 *
 * @author Diego Moreno
 */
public class VehiculoDAO implements IDAO<Vehiculo> {

    private PropietarioDAO propietarios;

    public VehiculoDAO(PropietarioDAO propietarios) {
        this.propietarios = propietarios;
    }

    @Override
    public Vehiculo buscarPorID(int id) {
        return null;
    }

    @Override
    public Vehiculo buscarPorID(String id) {
        
        return null;
    }

    @Override
    public ArrayList<Vehiculo> listarDatos() {
        
        return null;
    }

    @Override
    public void guardaRegistro(Vehiculo vehiculo) {
        
    }

    @Override
    public void actualizarRegistro(Vehiculo vehiculo) {
        
    }

    @Override
    public void eliminarRegistro(int id) {
        
    }

    @Override
    public void eliminarRegistro(String id) {
        
    }

}
