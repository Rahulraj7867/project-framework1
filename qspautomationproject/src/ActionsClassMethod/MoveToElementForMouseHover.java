package ActionsClassMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementForMouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/hovers");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement target = driver.findElement(By.xpath("//h5[.='name: user3']/ancestor::div[@class='figcaption']/preceding-sibling::img"));
		Actions act =new Actions(driver);
		act.moveToElement(target).perform();

	}

}
