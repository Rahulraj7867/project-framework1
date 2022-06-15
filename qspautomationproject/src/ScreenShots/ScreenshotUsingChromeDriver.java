package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotUsingChromeDriver {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://desktop-4pmjebg/login.do");
		driver.manage().window().maximize();
		//login in actitime
		driver.findElement(By.name("username")).sendKeys("ad");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		//screenshots
		File src = driver.getScreenshotAs(OutputType.FILE);
		File fil=new File("./screenshots/selenium2.jpg");
		Files.copy(src, fil);
		
	
		

}
}