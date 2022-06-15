package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class youtube {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("u to akele bhi song");
		Robot robo=new Robot();
		
		
		robo.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//a[contains(.,'Yu to akela bhi aksar')]")).click();
		
		Thread.sleep(3000);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File fil=new File("./screenshots/youtube.jpg");
		Files.copy(src, fil);
		Thread.sleep(5000);
		File fil1=new File("./screenshots/youtube1.jpg");
	}

}
