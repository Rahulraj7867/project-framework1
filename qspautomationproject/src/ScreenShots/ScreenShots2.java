package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShots2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.raymond.in/home");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		File sourc = driver.getScreenshotAs(OutputType.FILE);
		File fil = new File("./screenshots/reymonds.png");
		Files.copy(sourc, fil);

	}

}
