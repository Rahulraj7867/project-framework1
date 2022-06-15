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

public class ExplicitlyWaitMethod {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("actiTIME - Login"));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ad");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		wait .until(ExpectedConditions.titleContains("Enter Time-Track"));
		WebElement element = driver.findElement(By.xpath("//select[contains(@name,'selectedUser')]"));
   Select sc=new Select(element);
  boolean condition = sc.isMultiple();
  
System.out.println(condition);

	sc.selectByIndex(2);	

List<WebElement> options = sc.getOptions();
WebElement webElement = sc.getWrappedElement(); 
System.out.print(webElement.getText());
		

		
		
	}

	

	
	}


