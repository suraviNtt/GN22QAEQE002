package project_name_yourname_emp_id;

import org.openqa.selenium.WebDriver;

import project_name_yourname_emp_id.handler.BrowserHandler;

public class ProjectNameTest {
	
	public static void main(String[] args) {
		BrowserHandler browserHandler = new BrowserHandler();
		WebDriver driver = browserHandler.getDriver();
		browserHandler.launchAppliaction(driver);
		
	}

}
