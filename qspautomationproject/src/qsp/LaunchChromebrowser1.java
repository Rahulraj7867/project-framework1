package qsp;

import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchChromebrowser1 {
	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");//avoid IllegalStastException
		ChromeDriver driver = new ChromeDriver();//open the browser
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.facebook.com");//launch the web application
		
		Thread.sleep(10000);//provide the delay of 10 second
		driver.close();//close the browser
		
		
	}
}


	