package practicePackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Actitime {

		public static  void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://desktop-4pmjebg/login.do");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			//login in actitime
			driver.findElement(By.name("username")).sendKeys("ad");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			driver.findElement(By.xpath("//div[.='Settings']/following-sibling::img")).click();
				
			
			WebElement scr = driver.findElement(By.xpath("//span[.='Control of Overtime / Undertime']"));
			Point loc = scr.getLocation();
			int xaxis = loc.x;
			int yaxis = loc.y;
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			Thread.sleep(1000);
			jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
}
}
