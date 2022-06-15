package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageTitleVerification {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals("OrangeHRM"))
	{
	System.out.println("test case is pass");
	}
	else
	{
		System.out.println("test case is fail");
	}
	driver.close();
}
}

