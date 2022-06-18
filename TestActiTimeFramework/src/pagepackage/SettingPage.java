package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class SettingPage extends BaseTest {
	//initilazation
	
	@FindBy(name="firstHierarchyLevelCode")private WebElement Topgrouplevel;
	@FindBy(name="secondHierarchyLevelCode")private WebElement middlegrouplevel;

	@FindBy(name="thirdHierarchyLevelCode")private WebElement Timeentrylevel;
	@FindBy(linkText="Settings")private WebElement setting;

	//declaration
	public SettingPage(WebDriver driver) {
		   PageFactory.initElements(driver ,this);
	}

	
	
	public WebElement getTopgrouplevel() {
		return Topgrouplevel;
	}

	public WebElement getMiddlegrouplevel() {
		return middlegrouplevel;
	}

	public WebElement getTimeentrylevel() {
		return Timeentrylevel;
	}



	public void clickonsettting()
	{
		setting.click();
	}
   

	
   
	
}
