package Windobasepopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandalWindowBasePopupUsingRobtClass {
	private static final WebDriver Duration = null;

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.get("https://smallpdf.com/hi/jpg-to-pdf");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[.='Yes']")).click();
	
		
		driver.findElement(By.xpath("(//span[@class='r5zwp6-3 jHcIvq'])[2]")).click();
		driver.findElement(By.xpath("//span[.='Choose Files']")).click();
		
		driver.navigate().to("https://www.google.com");
		
		driver.switchTo().activeElement().sendKeys("C:\\Users\\rahulrajput\\OneDrive\\Pictures\\Screenshots\\rahul.png");
		Robot robo=new Robot();
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_ENTER);

		


		
		
}
}
