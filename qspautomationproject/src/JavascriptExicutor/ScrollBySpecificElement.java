package JavascriptExicutor;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBySpecificElement {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
	
		jse.executeScript("window.scrollBy(-4000,0)");
		WebElement target = driver.findElement(By.xpath("//h2[.='Donate to Selenium']"));
		Point donateloc = target.getLocation();
		int xaxis = donateloc.x;
		
		int yaxis = donateloc.y;
		
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		

}
}
   