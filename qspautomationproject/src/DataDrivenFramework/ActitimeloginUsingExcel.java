package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeloginUsingExcel {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://desktop-4pmjebg/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Flib fib = new Flib();
		int rc = fib.getCellcount("./testData/ActitimeLogin.xlsx", "invalidCread");
		
		for (int i = 1; i <=rc; i++) 
		{
			
				
				String Username1 = fib.testData("./testData/ActitimeLogin.xlsx", "invalidCread", i, 0);
				String password1 = fib.testData("./testData/ActitimeLogin.xlsx", "invalidCread", i, 1);
				driver.findElement(By.name("username")).sendKeys(Username1);
				//Thread.sleep(1000);
				driver.findElement(By.name("pwd")).sendKeys(password1);
				
				driver.findElement(By.id("loginButton")).click();
				Thread.sleep(1000);

				driver.findElement(By.name("username")).clear();
				WebElement error = driver.findElement(By.xpath("//span[.='Username or Password is invalid. Please try again.']"));
				String emsg = error.getText();
				if (emsg.equals("Username or Password is invalid. Please try again."))
				{
					fib.writeDataInexcel("./testData/ActitimeLogin.xlsx", "invalidCread",i,4,"pass");
					fib.writeDataInexcel("./testData/ActitimeLogin.xlsx", "invalidCread",i,2," error massege displayed");
					fib.writeDataInexcel("./testData/ActitimeLogin.xlsx", "invalidCread",i,3," error massege  displayed");	
					fib.writeDataInexcel("./testData/ActitimeLogin.xlsx", "invalidCread",i,5,"ok");	



				}
				else
				{
					fib.writeDataInexcel("./testData/ActitimeLogin.xlsx", "invalidCread",i,4,"fail");
					fib.writeDataInexcel("./testData/ActitimeLogin.xlsx", "invalidCread",i,2,"homepage shuld be open");
					fib.writeDataInexcel("./testData/ActitimeLogin.xlsx", "invalidCread",i,3,"error massege  displayed");	
					fib.writeDataInexcel("./testData/ActitimeLogin.xlsx", "invalidCread",i,5,"error");
					
					
				}
				
			
			

		}
		
	}
}
