package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findnumberoflinkonwebpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[@aria-label='4 Stars & Up']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.='HP']")).click();
		driver.findElement(By.xpath("//span[.='Over ₹50,000']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.='Windows 11 Home']")).click();
		Thread.sleep(5000);
		List<WebElement> text1 = driver.findElements(By.tagName("a"));
		System.out.println(text1.size());
		for(int i=0;i<=text1.size();i++)
		{
			System.out.println(text1.get(i).getText());
		}
		 for(WebElement we:text1)
		{
			String text2=we.getText();
			
			System.out.println(text2);
		
	
		String text = driver.findElement(By.xpath(
				"(//span[text()='HP 15, 11th Gen Intel Core i5-8GB RAM/512GB SSD 15.6 inches Laptop, FHD, IPS, Micro-Edge, Anti-Glare Display/Intel Iris Xe Graphics/Alexa Built- in/Windows 11 Home/1.75kg, 15s-du3517TU'])[1]/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[@class='a-price-whole']"))
				.getText();

		 System.out.println(text);
	}

}
