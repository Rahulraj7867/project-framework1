package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActiTimeLogInPage {
	
	WebDriver driver;
	By username=By.name("username");
	By password=By.name("pwd");
	By loginbutton=By.id("loginButton");
	
	
	ActiTimeLogInPage(WebDriver d)
	{
		driver=d;
	}
	
	public void username(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	public void password(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void loginbutton()
	{
		driver.findElement(loginbutton).click();
	}
}
