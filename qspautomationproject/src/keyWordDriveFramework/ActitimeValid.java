package keyWordDriveFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeValid extends BaseClass {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
	BaseClass bas = new BaseClass();
	bas.openBrowser();
	 
	
	
		Flib flib = new Flib();
		 String Username1 =flib.readPropertyFile(Propertypath, "username");

			String password1 = flib.readPropertyFile(Propertypath, "password");
	driver.findElement(By.name("username")).sendKeys(Username1);
	driver.findElement(By.name("pwd")).sendKeys(password1);
	driver.findElement(By.id("loginButton")).click();
         
	
  bas.closeBrowser();
  
	
	

	}
	

}
