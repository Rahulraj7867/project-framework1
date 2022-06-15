package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("laptop");
		Thread.sleep(4000);
	    List<WebElement> element = driver.findElements(By.xpath("//li[@class='Y5N33s']"));
	    
	    for(WebElement web:element)
	    {
	    	System.out.println(web.getText());
	    }
	    
	}

	
	}


