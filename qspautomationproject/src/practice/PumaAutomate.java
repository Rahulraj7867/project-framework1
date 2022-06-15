package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PumaAutomate {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			WebDriver driver =new FirefoxDriver();
			Thread.sleep(5000);
			driver.get("https://eu.puma.com/");
			driver.manage().window().maximize();
			
	}

}
