package persistencia;

import java.util.ArrayList;

/**
 * Se define la forma generalizada de almacenamiento de un archivo en general
 *
 * @author Ingenieros Programacion II Grupo 2
 *
 */
public abstract class AbstractFile {
    //-------------------------- Atributos -----------------------------

    /**
     * Es el camino o ruta donde se encuentra el archivo
     */
    protected String path;
    /**
     * Es el nombre del archivo
     */
    protected String name;
    /**
     * Es la extension del archivo
     */
    protected String extent;
    
    protected String totalPath;
    //-------------------------- Constructores -----------------------------

    public AbstractFile(String path, String name, String extent) {
        this.path = path;
        this.name = name;
        this.extent = extent;
        totalPath = this.toString();
    }

    public AbstractFile(String name) {
        totalPath = name;
    }
    
    

    //-------------------------- Metodos ----------------------------------
    /**
     *
     * @throws ExceptionFile
     */
    public abstract void create() throws ExceptionFile;

    /**
     *
     * @throws ExceptionFile
     */
    public abstract void open() throws ExceptionFile;

    /**
     * Este metodo permite leer todo el archivo
     *
     * @return 
     * @throws ExceptionFile
     */
    public abstract ArrayList<String> read() throws ExceptionFile;

    /**
     *
     * @param line
     * @throws ExceptionFile
     */
    public abstract void write(String line) throws ExceptionFile;

    /**
     *
     * @throws ExceptionFile
     */
    public abstract void rewrite() throws ExceptionFile;

    /**
     *
     * @throws ExceptionFile
     */
    public abstract void close() throws ExceptionFile;

    /**
     * Une el path el nombre del archivo y su extension
     * @return 
     */
    @Override
    public String toString() {
        return path + name + "." + extent;
    }
    //----------------------- Setter y Getter -----------------------------

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtent() {
        return extent;
    }

    public void setExtent(String extent) {
        this.extent = extent;
    }

    public String getTotalPath() {
        return totalPath;
    }

    public void setTotalPath(String totalPath) {
        this.totalPath = totalPath;
    }
    
    
}
