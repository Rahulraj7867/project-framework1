package DataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwaglbInvalidCred {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 Libraryfile lib = new Libraryfile();
		 int rc = lib.rowCount("./testData/swaglab.xlsx", "Sheet1");
		 
		 for(int i=1;i<=rc;i++)
		 {
			 
		 
		 String username = lib.swaglab("./testData/swaglab.xlsx", "Sheet1", i, 0);
		 driver.findElement(By.id("user-name")).sendKeys(username);
		 driver.findElement(By.id("password")).sendKeys(username);
		 driver.findElement(By.id("login-button")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("user-name")).clear();
		 driver.findElement(By.id("password")).clear();
		 Thread.sleep(1000);
		
			 lib.writeresult("./testData/swaglab.xlsx", "Sheet1", i,4 ,"pass");	
			 lib.writeresult("./testData/swaglab.xlsx", "Sheet1", i,3 ,"Error Massage is Display");	

			 
			 
		 
		 
		 
		 }
		 

		 
		
		
	}

}
