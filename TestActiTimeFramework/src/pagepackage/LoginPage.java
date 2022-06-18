package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//decleration
	
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy (id="loginButton") private WebElement  loginBtn;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepmeLoginChekbox;
	@FindBy (xpath="//img[contains(@src,'/login/timer')]") private WebElement  logo;
	@FindBy(id="licenseLink") private WebElement licenselink;
	@FindBy(xpath="//span[.='Username or Password is invalid. Please try again.']")private WebElement errormsg;
	
	
	
	
	//How to create constuctor ?
	//initialization= for initilization constructor creation we need to right click after that we need
	//to go source after that go to generates constructor using fields
	//then deselect all the checkbox which is selected then clickon generate button and constructor will be generated
	



	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	//how t create getter method 
	//initialization= for initilization constructor creation we need to right click after that we need
	//to go source after that go to enerate getter and setter select only getter checkbox and click on generate
	public WebElement getUsn() {
		return usn;
	}
	
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginbtn() {
		return loginBtn;
	}
	public WebElement getKeepmeloginchekbox() {
		return keepmeLoginChekbox;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getLicenselink() {
		return licenselink;
	}
	public WebElement getErrormsg() {
		return errormsg;
	}
	
	// generic methods
	public void actitimeValidLogin(String username,String password)
	{
		usn.sendKeys(username);
		pass.sendKeys(password);
		loginBtn.click();
	}
	public void actitimeInvalidLogin(String username,String password) throws InterruptedException
	{
		usn.sendKeys(username);
		pass.sendKeys(password);
		loginBtn.click();
		Thread.sleep(2000);
		usn.clear();
		
	}
	
	
	
	//peratinal method
	
}
