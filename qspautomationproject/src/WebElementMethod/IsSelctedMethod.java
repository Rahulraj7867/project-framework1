package WebElementMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IsSelctedMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Create New Account']")));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

		WebElement status = driver.findElement(By.xpath("//label[text()='Male']/ancestor::span[@class='_5k_2 _5dba']"));
		boolean elestatus = status.isSelected();
		System.out.println(elestatus);
		Thread.sleep(4000);

		status.click();
		Thread.sleep(4000);
		boolean element = status.isSelected();
		System.out.println(element);

	}
}
