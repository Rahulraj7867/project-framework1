package keyWordDriveFramework;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass  implements IAutoConstant{

	 static WebDriver driver;

	public void openBrowser() throws IOException {
		
		Flib bas = new Flib();
		String url = bas.readPropertyFile(Propertypath, "url");
		String brow = bas.readPropertyFile(Propertypath, "browser");

		if (brow.equalsIgnoreCase("chrome")) {

			System.setProperty(Chromekeys, Chromevalue);
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		}
		else {
			System.setProperty(Firfoxkeys, Firfoxvalue);
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	}

	public void closeBrowser() {
		driver.quit();
	}
	
}
