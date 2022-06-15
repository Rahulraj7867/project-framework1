package FiveLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {



	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://www.facebook.com/login/");
driver.findElement(By.id("email")).sendKeys("7758098262");
driver.findElement(By.id("pass")).sendKeys("7387509753");
driver.findElement(By.id("loginbutton")).click();
Thread.sleep(4000);
driver.switchTo().activeElement().sendKeys("sagarkolhe",Keys.ENTER);

//driver.findElement(By.linkText("ganesh poul")).click();
 
 //driver.close();
	}


	}


