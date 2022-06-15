package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotsbyDirectUpcastingRemoteWebDriver {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		RemoteWebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.meto.com");
		File src = driver.getScreenshotAs(OutputType.FILE);
		File target=new File("./screenshots/meto1.png");
		Files.copy(src, target);
		
	}

}

