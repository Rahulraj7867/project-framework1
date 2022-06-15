package practicePackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://linkintime.co.in/mipo/ipoallotment.html");
		WebElement ele = driver.findElement(By.xpath("//select[@id='ddlClient']"));
		Select sc=new Select(ele);
		sc.selectByIndex(0);
		WebElement selected = sc.getFirstSelectedOption();
	
		System.out.println(selected.getText());
		driver.findElement(By.xpath("//input[@placeholder='Enter PAN']")).sendKeys("DTLPR2749A");
				driver.findElement(By.xpath("//input[@id='btnsearc']")).click();
				List<WebElement> text = driver.findElements(By.tagName("td"));
				for(WebElement web:text)
				{
                System.out.println(web.getText());
				}
	}

}
