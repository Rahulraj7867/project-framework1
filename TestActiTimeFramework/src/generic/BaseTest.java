package generic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import pagepackage.LoginPage;

public class BaseTest implements IAutoConstant {
	 protected static WebDriver driver;
	@BeforeMethod
	public void setUp() throws IOException
	{
		 Flib flib = new Flib();
		String browservalue = flib.readDataFromPropertyFile(propertypath, "browser");
		String url = flib.readDataFromPropertyFile(propertypath, "url");
		
		if (browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(chromekey, chromevalue);
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);	
		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty( geckokey,geclovalue);
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);	
			
		}
	}

	 public void failed (String methodName)
     {
    	 TakesScreenshot take = (TakesScreenshot)driver;
			File source = take.getScreenshotAs(OutputType.FILE);
			File fil =new File("./screenshots/"+methodName+".png");
			try {
				Files.copy(source, fil);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
     }
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
