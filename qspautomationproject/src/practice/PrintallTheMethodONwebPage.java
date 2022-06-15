package practice;

import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintallTheMethodONwebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		LinkedHashSet hs=new LinkedHashSet();
		
		for(WebElement web:links)
		{
			String webel = web.getText();
			hs.add(web);
		}
		for(WebElement ele:links)
		{
			System.out.println(ele.getText());
		}
		
		driver.quit();
	}

}
