package project_name_yourname_emp_id.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import project_name_yourname_emp_id.reader.PropertiesReader;

public class CommonHandlers {

	WebDriverWait wait;
	PropertiesReader propReader;
	
	/**
	 * clicking on Element
	 * @param driver
	 * @param element
	 */
	public void clickOnElement(WebDriver driver, WebElement element ) {
		try {
			propReader = new PropertiesReader();
			int waitTime = propReader.fetchExplicitWait();
			wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
			if(wait.until(ExpectedConditions.elementToBeClickable(element)).isEnabled()) {
				element.click();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Element is not clicked");
		}
	}
}
