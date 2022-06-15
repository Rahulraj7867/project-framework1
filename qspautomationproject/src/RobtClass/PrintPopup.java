package RobtClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demo.guru99.com/test/drag_drop.html");
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				
				Robot robot=new Robot();
				//press contol +p
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_P);
				robot.keyRelease(KeyEvent.VK_P);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				//hit tab button
				Thread.sleep(3000);

				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(3000);
				//hit Enter
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);

				

driver.quit();


				
			
				
	}

}
