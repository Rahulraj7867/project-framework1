package webDriverMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethodAdvforLoop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
	
		driver.switchTo().activeElement().sendKeys("bike");
		Thread.sleep(3000);
		List<WebElement> text = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
		//read all the weblement that match with the given Xpath by using advance for loop
		System.out.println(text.size());
      
		for(WebElement we:text)
		{
			String webelement = we.getText();
			System.out.println(webelement);
		}
		
}
}
