package practice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mishoAutomate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://meesho.com/");
			List<WebElement> element = driver.findElements(By.xpath("//div[@class='NavBarDesktop__Subtitle-sc-1049n7y-0 cZxktd']"));

			for(WebElement elem:element)
			{
			
				System.out.println(elem.getText());
			}
			
			System.out.println(element.size());
			driver.findElement(By.xpath("//span[text()='Men']")).click();
			driver.findElement(By.xpath("//p[text()='Track Pants']")).click();
			
			driver.findElement(By.xpath("(//a)[482]")).click();
			

			driver.findElement(By.xpath("CfWVH")).click();
			

			driver.findElement(By.xpath("//div[@class='QBdPU ']")).click();

			

			
			
			
	}

}
