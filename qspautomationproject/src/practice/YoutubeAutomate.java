package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeAutomate {

	
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver .get("https://www.youtube.com/");
			Thread.sleep(9000);
			
			driver.findElement(By.name("search_query")).sendKeys("Ek pyar ka nagma hai mojo ki");
			driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[(@id='video-title')and contains(@title,'Manoj Kumar')]")).click();
	}

}
