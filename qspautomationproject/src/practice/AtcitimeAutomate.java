package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AtcitimeAutomate {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://desktop-4pmjebg/login.do");
driver.manage().window().maximize();
//login in actitime
driver.findElement(By.name("username")).sendKeys("ad");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("loginButton")).click();
Thread.sleep(5000);

//create customer
driver.findElement(By.cssSelector("a[class*='content tasks']")).click();
driver.findElement(By.linkText("Projects & Customers")).click();
Thread.sleep(5000);
driver.findElement(By.cssSelector("input[value='Create New Customer']")).click();
driver.findElement(By.name("name")).sendKeys("bcdtg");
driver.findElement(By.name("description")).sendKeys("it is description");
driver.findElement(By.id("add_project_action")).click();
driver.findElement(By.name("createCustomerSubmit")).click();



driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Actitime testing");
driver.findElement(By.cssSelector("input[type='submit']")).click();
driver.findElement(By.xpath("//a[@class='content users']")).click();
driver.findElement(By.cssSelector("input[value='Create New User']")).click();
Thread.sleep(5000);
//creat manager
driver.findElement(By.name("username")).sendKeys("manager1");
driver.findElement(By.name("passwordText")).sendKeys("manager1");
driver.findElement(By.name("passwordTextRetype")).sendKeys("manager1");
driver.findElement(By.name("firstName")).sendKeys("vishal");
driver.findElement(By.name("lastName")).sendKeys("patil");
driver.findElement(By.cssSelector("input[value='   Create User   ']")).click();


//logout as admin


driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
//log in as manager 


driver.findElement(By.name("username")).sendKeys("manager1");
driver.findElement(By.name("pwd")).sendKeys("manager1");
driver.findElement(By.id("loginButton")).click();
Thread.sleep(5000);







	}

}
