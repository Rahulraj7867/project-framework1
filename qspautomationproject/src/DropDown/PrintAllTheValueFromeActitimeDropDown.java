package DropDown;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrintAllTheValueFromeActitimeDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		driver.get("http://127.0.0.1/login.do");
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ad");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		 WebElement ele = driver.findElement(By.xpath("//select[contains(@name,'selectedUser')]"));
	
		
			
		Select sc=new Select(ele);

		WebElement webElement = sc.getWrappedElement(); 
		System.out.print(webElement.getText());
		

		
		
		
		
		

	}

}
