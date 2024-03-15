package persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class PropertiesFile extends AbstractFile{
	private Properties properties;
	private File file;
	private FileInputStream fileInputStream;
	private InputStream inputStream;

	public PropertiesFile(String path, String name) {
		super(path, name, "properties");
		file = new File(super.toString());
		properties = new Properties();
	}

	@Override
	public void create() throws ExceptionFile {
		// TODO Auto-generated method stub		
	}

	@Override
	public void open() throws ExceptionFile {
		try {
			fileInputStream = new FileInputStream(file);
			inputStream = fileInputStream;
			properties.load(inputStream);
		} catch (FileNotFoundException e) {
			throw new ExceptionFile("Error. Al abrir el archivo de propiedades " + super.toString());
		} catch (IOException e) {
			throw new ExceptionFile("Error. Al cargar las propiedades de " + super.toString());
		}
	}

	@Override
	public ArrayList<String> read() throws ExceptionFile {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String read(String key) {
		return properties.getProperty(key);
	}

	@Override
	public void write(String line) throws ExceptionFile {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rewrite() throws ExceptionFile {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() throws ExceptionFile {
		try {
			inputStream.close();
			fileInputStream.close();
		} catch (IOException e) {
			throw new ExceptionFile("Error. Al cerrar el archivo de propiedades " + super.toString());
		}
				
		
	}

}
















  