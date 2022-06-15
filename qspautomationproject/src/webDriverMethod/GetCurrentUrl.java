package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v97.network.model.CookieSourceScheme;

public class GetCurrentUrl {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amezon.com");
		String title =driver.getCurrentUrl();
	System.out.println(title);
	
	driver.close();
	
	}

}
