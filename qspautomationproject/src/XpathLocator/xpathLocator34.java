package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathLocator34 {

	public static void main(String[] args) throws InterruptedException {

		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");//open flipkart
	//open login popup window
	driver.manage().window().maximize();
driver.findElement(By.xpath("//input[(@autocomplete='off') and (@class='_2IX_2- VJZDxU')]")).sendKeys("8999138396");//xpath using multiple attribute
driver.findElement(By.xpath("//input[(@autocomplete='off') and (@type='password')]")).sendKeys("Rahul@123");//xpath using multiple attribute
driver.findElement(By.xpath("//button[contains(@class,'_3AWRsL')]")).click();//xpath using contains
//log in successful
Thread.sleep(3000);
driver.findElement(By.xpath("//img[contains(@class,'_3exPp9') and (@alt='Mobiles')]")).click();

//new window open
Thread.sleep(3000);
driver.findElement(By.xpath("//img[@alt='Poco M3 pro' and @class='kJjFO0 _3DIhEh']")).click();//xpath using multiple attribute
Thread.sleep(3000);
driver.findElement(By.xpath("//div[(@class='_4rR01T') and contains(text(),'Pro 5G (Cool Blue, 64 GB)')]")).click();//xpath using multipal attri
driver.findElement(By.xpath("//div[(@class='_2C41yO')and contains(@data-img,'m3-pro-5g-mzb0956i')]")).click();
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//span[text()='Place Order']")).click();
driver.quit();
		
	}

}
