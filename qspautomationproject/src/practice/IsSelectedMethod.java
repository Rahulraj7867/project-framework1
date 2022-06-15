package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://desktop-4pmjebg/login.do");
		WebElement checkbox = driver.findElement(By.xpath("//label[contains(text(),'Keep me')]"));
				boolean status = checkbox.isSelected();
				System.out.println(status); 
				
	              Thread.sleep(4000);

           
          checkbox.click();
          Thread.sleep(4000); 
          boolean status2 = checkbox.isSelected();
          System.out.println(status2);
}
}
