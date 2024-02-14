package persistencia;

public class GlobalConfiguration {
	
	public static String LANGUAGE;
	public static String PATH_TEXT;
	public static String PATH_ICON;
	public static String PATH_LANGUAGE;
	public static String USER;
	public static PropertiesFile language;

	public static void loadConfig() throws ExceptionFile {
		  PropertiesFile file = new PropertiesFile("", "config");
		  file.open();
		  LANGUAGE = file.read("language");
		  PATH_TEXT = file.read("pathText");
		  PATH_ICON = file.read("pathIcon");
		  PATH_LANGUAGE = file.read("pathLanguage");
		  USER = file.read("user");		  
		  file.close();
		  loadLanguage();
	}
	
	public static void loadLanguage() throws ExceptionFile {
		language = new PropertiesFile(PATH_LANGUAGE,LANGUAGE);
		language.open();
		language.close();
	}

}
