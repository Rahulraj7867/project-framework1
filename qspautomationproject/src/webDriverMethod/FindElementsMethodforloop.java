package webDriverMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethodforloop {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
		
			driver.switchTo().activeElement().sendKeys("bike");
			Thread.sleep(3000);
			List<WebElement> text = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
			//read all the weblement that match with the given Xpath by using for loop
			for(int i=0;i<text.size();i++)
			{
				WebElement text1 = text.get(i);
				String element = text1.getText();
				System.out.println(element);
			}
			

	}

}
