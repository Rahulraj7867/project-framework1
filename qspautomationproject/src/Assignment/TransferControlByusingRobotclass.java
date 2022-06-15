package Assignment;

public class TransferControlByusingRobotclass {
	package WebElementMethod;

	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class  {

		
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.get("https://www.flipkart.com");
				driver.findElement(By.xpath("//button[.='✕']")).click();
				driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung F12");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				String parentwindow = driver.getWindowHandle();
				System.out.println(parentwindow);
				driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F12 (Sea Green, 64 GB)']")).click();
				Set<String> allhandle = driver.getWindowHandles();
				for(String wh: allhandle)
				{
					System.out.println(wh);
				if(!parentwindow.equals(wh))
					
				{
					driver.switchTo().window(wh);
				}
				}
				driver .findElement(By.xpath("//a[.='128 GB']")).click();
				driver .findElement(By.xpath("//li[@id='swatch-0-color']")).click();
				Thread.sleep(1000);
				driver .findElement(By.xpath("//span[@class='_3iRXzi']/..")).click();
				driver.quit();
				

				

				
		}

	}


}
