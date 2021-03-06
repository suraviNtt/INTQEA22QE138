package project_name.readers;

import java.io.Reader;
import java.util.Properties;

public class PropertyReader {

	private static Properties prop = null;
	FileReaders fileReaders;

	public PropertyReader() throws Exception {

		prop = new Properties();
		fileReaders = new FileReaders();
		String filePath = fileReaders.getMainResourcesFilepath("config", "properties");
		Reader file = fileReaders.readFile(filePath);
		prop.load(file);
	}

	public String getBrowserName() {
		return (String) prop.get("browser");
	}

	public String getApplicationUrl() {
		return (String) prop.get("url");
	}

	public int getHardWait() {
		return (int) prop.get("hardWait");
	}

	public int getImplicitWait() {
		return Integer.parseInt((String) prop.get("implicitWait"));
	}
	
	public int getExplicitWait() {
		return Integer.parseInt((String) prop.get("explicitWait"));
	}
}
