package models.DAO;

import java.util.ArrayList;

/**
 *
 * @author Diego Moreno
 * @param <T>
 */
public interface IDAO <T> {
    
    public T buscarPorID(int id);
    public T buscarPorID(String id);
    public ArrayList<T> listarDatos();    
    public void guardaRegistro(T registro);
    public void actualizarRegistro(T registro);
    public void eliminarRegistro(int id);
    public void eliminarRegistro(String id);
    
    
}
