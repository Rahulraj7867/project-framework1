package takeScreenShotDynamicalyOrangeHRM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class BAseTest {
	 static WebDriver driver;
	public static void initilization() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
     public void failed (String methodName)
     {
    	 TakesScreenshot take = (TakesScreenshot)driver;
			File source = take.getScreenshotAs(OutputType.FILE);
			File fil =new File("./screenshots/"+methodName+".png");
			try {
				Files.copy(source, fil);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
    	 
     }
}
