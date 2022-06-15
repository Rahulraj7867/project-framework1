package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlessbrowser {



	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
        ChromeOptions option = new ChromeOptions();
        option.setHeadless(true);

WebDriver driver=new ChromeDriver(option);
driver.get("https://www.amezon.com");
 String title = driver.getTitle();
 
 Thread.sleep(4000);
 System.out.println(title);
 driver.close();
 

	}

}
