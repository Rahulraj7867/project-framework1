package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FlipkartLoginPage {
      WebDriver driver;

	By cut = By.xpath("//button[.='✕']");
	By cart=By.xpath("//span[.='Cart']");
	By login=By.xpath("//span[.='Login']");
     By mo=By.xpath("//input[@class='_2IX_2- VJZDxU']");
By password=By.xpath("//input[@type='password']");
By loginbutton=By.xpath("//button[@type='submit' and contains(@class,'_2KpZ6l')]");
	

FlipkartLoginPage(WebDriver d )
{
	driver=d;
}
public void cut()

{
	driver.findElement(cut).click();
}
public void cart()
{
	driver.findElement(cart).click();
}
public void login()
{
	driver.findElement(login).click();
}
public void mobileno(String mon)
{
	driver.findElement(mo).sendKeys(mon);
	
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
