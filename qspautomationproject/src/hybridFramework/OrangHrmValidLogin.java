package hybridFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OrangHrmValidLogin extends BaseTestOrangHRM {

	public static void main(String[] args) throws IOException {
		
		
		BaseTestOrangHRM hrm = new BaseTestOrangHRM();
		FlibOfHRM flib = new FlibOfHRM();
		String username = flib.radDataFromPropertiesFile(propertypath, "username");
		String password = flib.radDataFromPropertiesFile(propertypath, "password");
		


		hrm.openBrowser();
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	
	}

}
