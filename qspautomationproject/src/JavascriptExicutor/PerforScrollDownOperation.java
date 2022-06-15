package JavascriptExicutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerforScrollDownOperation {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Robot rob=new Robot();
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_ESCAPE);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,1700)");
				
	}

}
