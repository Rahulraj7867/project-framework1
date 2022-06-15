package ScreenShots;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShots1 {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Robot rob=new Robot();
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_ESCAPE);
		File src = driver.getScreenshotAs(OutputType .FILE);
		File target=new File("./screenshots/flipkart1.png");
		Files.copy(src, target);
	}

}