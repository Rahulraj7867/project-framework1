package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
// declaration
	@FindBy(xpath="//a[.='Logout']") private WebElement logOutLink;
	@FindBy(xpath="//a[.='Create new tasks']") private WebElement creatNewTask;
	@FindBy(linkText="Settings") private WebElement setting;
	@FindBy(id="SubmitTTButton") private WebElement saveLeaveTimeBtn;

	

	//initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	//right click -goto sourc -goto getter and setter click on it open all the box only select getter lick on generate
	public WebElement getLogOutLink() {
		return logOutLink;
	}
	
	public WebElement getCreatNewTask() {
		return creatNewTask;
	}
	public WebElement getSetting() {
		return setting;
	}
	public WebElement getSaveLeaveTimeBtn() {
		return saveLeaveTimeBtn;
	}
	//generalization
	
	public void clickLogOut()//method for logout
	{
		logOutLink.click();
	}
//method for click on save leave time
	public void clickOnSaveLeaveTime()
	{
		saveLeaveTimeBtn.click();
	}
	
}
