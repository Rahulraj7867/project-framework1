package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProvider {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("http://127.0.0.1/login.do;jsessionid=bgi8g8am2g2k4");
	}
	 @DataProvider(name="actitTimeLogin")
	 public Object[][] dataprovider()
	 {
		 Object [][] data=new Object[5][2];
		 data[0][0]="admin";
		 data[0][1]="mana ger";
		 
		 data[1][0]="admin";
		 data[1][1]="mana ger";
		 
		 data[2][0]="admin123";
		 data[2][1]="manager";
		 
		 data[3][0]="adm in";
		 data[3][1]="manager";
		 
		 data[4][0]="admin @123";
		 data[4][1]=" ger";
		return data;
		 
		
		 
	 }
	 
	 @Test(dataProvider = "actitTimeLogin")
	 public void login( String username,String password)
	 {

			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
	 }
	 
	 @AfterMethod
	 public void tearDown()
	 {
		 driver.quit();
	 }

}
