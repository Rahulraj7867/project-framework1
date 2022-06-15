package JavascriptExicutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class performScrollUp {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
	Robot rob=new Robot();
	rob.keyPress(KeyEvent.VK_ESCAPE);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(1000);
		
		jse.executeScript("window.scrollBy(0,1555)");//scroll down
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-1300)");//scroll up
		
		
}
}