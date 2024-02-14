package persistencia;

public class GlobalLanguage {

    private static PropertiesFile load;

    public static String LANGUAGE;
    public static String INVOICE;
    public static String PRICE;
    public static String CHANGE;
    public static String PDF;
    public static String TXT;
    public static String EXIT;
    public static String CLIENT;
    public static String VIEW_CLIENT;
    public static String ADD_CLIENT;
    public static String DELETE_CLIENT;
    public static String NAME_CLIENT;
    public static String LAST_NAME_CLIENT;
    public static String PHONE_NUMBER_CLIENT;
    public static String EMAIL_CLIENT;
    public static String VEHICLE_CLIENT;
    public static String DATA_CLIENT;
    public static String VEHICLE_DATA;
    public static String MARK_CAR;
    public static String FILE;
    public static String EDIT;
    public static String OWNER;
    public static String SERVICES;
    public static String HELP;
    public static String LOGOUT;
    public static String MANAGE_CAR;
    public static String CONCEPTS;
    public static String MANAGE_OWNER;
    public static String CAR;
    public static String ABOUT_THIS;
    public static String ES;
    public static String EN;
    public static String IDIOM;
    public static String MANAGE_SERVICE;

    public static void loadLanguage() throws ExceptionFile {
        changeLanguage(LANGUAGE);
        load.open();
        PRICE = load.read("cotizacion");
        CHANGE = load.read("cambioidioma");
        PDF = load.read("exportapdf");
        TXT = load.read("exportatxt");
        CLIENT = load.read("cliente");
        VIEW_CLIENT = load.read("vercliente");
        ADD_CLIENT = load.read("agregacliente");
        DELETE_CLIENT = load.read("borracliente");
        NAME_CLIENT = load.read("nombre");
        LAST_NAME_CLIENT = load.read("apellido");
        PHONE_NUMBER_CLIENT = load.read("numero");
        EMAIL_CLIENT = load.read("email");
        VEHICLE_CLIENT = load.read("vehiculo");
        DATA_CLIENT = load.read("datoscliente");
        VEHICLE_DATA = load.read("datosvehiculo");
        MARK_CAR = load.read("marcacarro");
        INVOICE = load.read("factura");

        FILE = load.read("archivo");
        EXIT = load.read("salir");
        LOGOUT = load.read("logout");
        EDIT = load.read("editar");
        OWNER = load.read("propietario");
        MANAGE_OWNER = load.read("manowner");
        CAR = load.read("car");
        MANAGE_CAR = load.read("mancar");
        SERVICES = load.read("servicios");
        MANAGE_SERVICE = load.read("manservicios");
        CONCEPTS = load.read("conceptos");
        IDIOM = load.read("idioma");
        EN = load.read("en");
        ES = load.read("es");
        HELP = load.read("ayuda");
        ABOUT_THIS = load.read("acercade");
        
        load.close();

    }

    public static void changeLanguage(String languaje) {        
        load = new PropertiesFile("src/resources/language/", languaje);
    }

    public static String getLanguage() {
        return LANGUAGE;
    }

    public static void setLanguage(String language) {
        GlobalLanguage.LANGUAGE = language;
    }

}
