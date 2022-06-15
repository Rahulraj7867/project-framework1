	package maintainDropdown;

	import java.util.HashSet;
	import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class TreesetDropdown {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/rahulrajput/OneDrive/Desktop/HTML/multiselect%20dropdown.html");
			driver.manage().window().maximize();
			
				WebElement element = driver.findElement(By.id("menu"));//we select the dropdown
				
			Select sc= new Select(element);
			List<WebElement> options = sc.getOptions();
			
			TreeSet<String> hs=new TreeSet<String>();//creat the object for hashset
			for(int i=0;i<options.size();i++ )
			{
				WebElement text = options.get(i);
			String ele = text.getText();
				hs.add(ele);
				
			}
			for (String tex:hs)
			{
				System.out.println(tex);
			}
			
			
			
		}

	}



