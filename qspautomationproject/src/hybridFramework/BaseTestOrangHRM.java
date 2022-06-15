package hybridFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTestOrangHRM  implements IAutoConstant{
	 static WebDriver driver;
	public void openBrowser() throws IOException
	{
		FlibOfHRM org = new FlibOfHRM();
		String browser = org.radDataFromPropertiesFile(propertypath, "browser");
		String url = org.radDataFromPropertiesFile(propertypath, "url");

		
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty(chromekey,chromevalue);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		else if(browser.equalsIgnoreCase("firfox"))

		{
			System.setProperty(geckokey,geckovalue);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
		}
		else
		{
			System.out.println("enter the correct choise");
		}
	}
		public void closeBrowser()
		{
			driver.close();
		}
	}


