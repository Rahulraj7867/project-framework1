package pageobjectmodel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoconstant {
	 static WebDriver driver;


	@BeforeMethod
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		String url = flib.radDataFromPropertiesFile(Propertypath,"url");
		String browservalue = flib.radDataFromPropertiesFile(Propertypath,"browser");

		if(browservalue.equalsIgnoreCase("Chrome"))
		{
			System.setProperty(Chromekeys, Chromevalue);
			driver =new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty( Firefoxkeys, Firefoxvalue);
			driver =new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
	}
		public  static void failed(String methodname)
		{
			
			
			 TakesScreenshot take = (TakesScreenshot)driver;
				File source = take.getScreenshotAs(OutputType.FILE);
				File fil =new File("./screenshots/"+methodname+".png");
				try {
					Files.copy(source, fil);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		}
	
		
	
	

	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
