package Questions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que2 {
	//how to close only child browser
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		String parent = driver.getWindowHandle();
		
		Set<String> child = driver.getWindowHandles();
		for(String wh:child)
		{
		if(!parent.equals(wh))	
			
		{
			driver.switchTo().window(wh);
			driver.close();
	
		}
			
		}
	

}
	

}
	

