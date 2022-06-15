package JavascriptExicutor;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;



public class Scrollleft {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
	
		jse.executeScript("window.scrollBy(-4000,0)");
		
 
		 EventFiringWebDriver ev = new EventFiringWebDriver(driver);
		File source = ev.getScreenshotAs(OutputType.FILE);
		 File fil=new File("./screenshots/my.png");
		Files.copy(source, fil);
	}
}
