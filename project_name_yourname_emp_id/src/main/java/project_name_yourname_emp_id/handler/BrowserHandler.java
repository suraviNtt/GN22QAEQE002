package project_name_yourname_emp_id.handler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import project_name_yourname_emp_id.reader.PropertiesReader;

public class BrowserHandler {
	
	/**
	 * handling multiple browsers
	 * @return
	 */
	public WebDriver getDriver() {
		PropertiesReader propertiesReader = new PropertiesReader();
		String browserName = propertiesReader.fetchBrowserName();
		WebDriver driver = null;
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default: System.out.println("The borwser name is not same as defined");
			break;
		}
		
		return driver;
	}
	
	public void launchAppliaction(WebDriver driver) {
		
	}

}
