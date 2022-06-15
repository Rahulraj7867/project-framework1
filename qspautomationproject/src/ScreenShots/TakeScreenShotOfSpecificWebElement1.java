package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class TakeScreenShotOfSpecificWebElement1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		WebElement target = driver.findElement(By.xpath("//h1[.='Downloads']"));
		File src = target.getScreenshotAs(OutputType.FILE);
		
		File fil=new File("./screenshots/seleniumrahul.png");
		Files.copy(src, fil);
	}

}
