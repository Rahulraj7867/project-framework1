package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetOpenSource {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/rahulrajput/OneDrive/Desktop/HTML/loginpage%20.html");
String pagetitle = driver.getPageSource();

System.out.println(pagetitle);


	}

}
