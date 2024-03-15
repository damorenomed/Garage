package models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Diego Moreno
 */
public class Factory {

    private static Propietario propietario;           
    private static Servicio servicio;
    private static Factura factura;
    
    
    public void crearDatosPrueba() {
        crearPropietario();
        crearVehiculo();
        crearServicio();
        creacionFactura();
    }

    public static Propietario crearPropietarioGenerico() {
        
       // return new Propietario(111111111, "Generico", "", "1", "",
       //         "000001", "No aplica", "0123456789", "gne@gmail.com");
        return null;
        
       // return new Propietario(111111111, "Generico", "", "1", "",
       //         "000001", "No aplica", "0123456789", "gne@gmail.com");
        
    }
    public static void crearPropietario() {        
       // propietario = new Propietario(1254411255, "Carlos", "Libardo", "Rodriguez", "Perez",
       //         "74555", "Calle 1 # 1 1", "3138141142", "clrp110@gmail.com");        
    }

    public static Vehiculo crearVehiculo() {        
       // return  new Vehiculo("ADF155", TipoVehiculo.AUTOMOVIL, EstadoVehiculo.MALO, propietario);              
        return null;
       // return  new Vehiculo("ADF155", TipoVehiculo.AUTOMOVIL, EstadoVehiculo.MALO, propietario);              
    }

    public static Servicio crearServicio() {
      //  return new Servicio(1, new Date(), Servicio.calculoFechaEntrega(new Date(), 6), crearListaArreglos());
        return null;
      //  return new Servicio(1, new Date(), Servicio.calculoFechaEntrega(new Date(), 6), crearListaArreglos());
    }

    private void creacionFactura() {
       // factura = new Factura(1, propietario, servicio, new Date());
    }

    private static ArrayList<ItemServicio> crearListaArreglos() {
        /*
        ArrayList<ItemServicio> lista = new ArrayList<>();
        lista.add(new ItemServicio(new Concepto(1, "Mano de obra Cambio Bujias", 20000), 1, 60));
        lista.add(new ItemServicio(new Concepto(2, "Bujias", 12000), 4, 0));
        lista.add(new ItemServicio(new Concepto(3, "Aceite 20W 50", 0), 4, 0));
        lista.add(new ItemServicio(new Concepto(4, "Mano de obra Cambio Aceite",  30000), 1, 30));
        return lista;
*/      return null;
        /*
        ArrayList<ItemServicio> lista = new ArrayList<>();
        lista.add(new ItemServicio(new Concepto(1, "Mano de obra Cambio Bujias", 20000), 1, 60));
        lista.add(new ItemServicio(new Concepto(2, "Bujias", 12000), 4, 0));
        lista.add(new ItemServicio(new Concepto(3, "Aceite 20W 50", 0), 4, 0));
        lista.add(new ItemServicio(new Concepto(4, "Mano de obra Cambio Aceite",  30000), 1, 30));
        return lista;
*/
    }
}
