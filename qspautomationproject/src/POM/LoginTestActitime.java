package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestActitime {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		ActiTimeLogInPage driver1=new ActiTimeLogInPage(driver);
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=ualcwr47lk9r");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver1.username("ad");
		Thread.sleep(1000);
		driver1.password("manager");
		Thread.sleep(1000);

		driver1.loginbutton();
		
	}

}
