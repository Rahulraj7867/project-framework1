package AssertionInTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class OrangHrmAssertion {
	WebDriver driver;
	SoftAssert soft = new SoftAssert();

	@BeforeTest
	public void SetProperty() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	}

	@BeforeMethod
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@Test
	public void testcase() throws InterruptedException {
		SoftAssert soft = new SoftAssert();
		String actualTitle = driver.getTitle();
		soft.assertEquals(actualTitle, "OrangeHRM", "title mismatch");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	

	
		WebElement dash = driver.findElement(By.xpath("//h1[.='Dashboard']"));
		boolean statuse = dash.isDisplayed();
		Assert.assertEquals(statuse, true);
		Thread.sleep(2000);
		String HomepageTitle = driver.getTitle();
		soft.assertEquals(HomepageTitle, "OrangeHRM");
		soft.assertAll();

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
