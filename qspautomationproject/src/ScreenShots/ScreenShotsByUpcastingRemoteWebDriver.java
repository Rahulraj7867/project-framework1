package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotsByUpcastingRemoteWebDriver {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		
		
		//upcasting frome chromedriver to Webdriver
		 WebDriver driver = new  ChromeDriver();
		 
		 
		//downcasting frome wedriver to remotewebdriver
		 RemoteWebDriver driver1=(RemoteWebDriver)driver;
		 
		 driver1.manage().window().maximize();
		 driver1.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver1.get("https://www.selenium.dev");
		File src = driver1.getScreenshotAs(OutputType.FILE);
		 File target=new File("./screenshots/seleniumpage.jpg");
		 Files.copy(src, target);
		
		
		
		
	}

}
