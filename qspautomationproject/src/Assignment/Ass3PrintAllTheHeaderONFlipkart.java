package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass3PrintAllTheHeaderONFlipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		List<WebElement> element = driver.findElements(By.xpath("//div[@class='xtXmba']"));
		System.out.println(element.size());
		for(WebElement webe:element)
		{
			String allheader = webe.getText();
			System.out.println(allheader);
		}
		driver.close();
		
}
}
