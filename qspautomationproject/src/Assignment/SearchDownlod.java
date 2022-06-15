package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchDownlod {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		Thread.sleep(1000);
		WebElement target = driver.findElement(By.xpath("//h1[.='Downloads']"));
		Actions act=new Actions(driver);
		Thread.sleep(1000);
	act.doubleClick(target).perform();
	

	Robot robot =new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_C);
	robot.keyRelease(KeyEvent.VK_C);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	driver.findElement(By.xpath("//input[@type='search']")).click();
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	//robot.keyPress(KeyEvent.VK_ENTER);


	
	}

}
