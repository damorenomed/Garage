
package models;

import java.util.Locale;

/**
 *
 * @author Diego Moreno
 */
public class Utils {
    
    public static String obtenerIdiomaSistema(){
        
        return Locale.getDefault().toLanguageTag();
    }
    
}
