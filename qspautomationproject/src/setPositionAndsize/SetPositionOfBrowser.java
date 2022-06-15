package setPositionAndsize;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionOfBrowser {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 Point po= new Point(200, 10);
	 driver.manage().window().setPosition(po);
	 System.out.println(driver.manage().window().getPosition());
	 Thread.sleep(3000);
	 driver.close();
}
}
