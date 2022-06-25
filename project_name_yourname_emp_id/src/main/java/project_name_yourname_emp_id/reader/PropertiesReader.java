package project_name_yourname_emp_id.reader;

import java.io.IOException;
import java.security.DomainCombiner;
import java.util.Properties;

public class PropertiesReader {

private Properties prop;

	public PropertiesReader() {
		FileHelper fileHelper = new FileHelper();
		prop = new Properties();
		try {
			prop.load(fileHelper.getConfigFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String fetchBrowserName() {
		return prop.getProperty("browser");
	}
	
	public int fetchExplicitWait() {
		return Integer.parseInt( prop.getProperty("explicitWait"));
	}
	
}
