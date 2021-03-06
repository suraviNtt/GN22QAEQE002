package project_name_yourname_emp_id.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileHelper {

	/**
	 * fetching the base path of project
	 * 
	 * @return
	 */
	private static String getBasePath() {
		return System.getProperty("user.dir");
	}

	/**
	 * get config.properties file location
	 * 
	 * @return
	 */
	public String getMainResourcseConfig() {
		return getBasePath() + "/src/main/resources/config.properties";
	}

	/**
	 * Returning config file in binaries
	 * @return
	 * @throws FileNotFoundException
	 */
	public InputStream getConfigFile() throws FileNotFoundException {
		return new FileInputStream(getMainResourcseConfig());
	}

}
