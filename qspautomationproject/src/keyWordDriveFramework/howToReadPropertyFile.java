package keyWordDriveFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class howToReadPropertyFile {

	public static void main(String[] args) throws IOException {
		
		  FileInputStream fis = new FileInputStream("./testData/config1.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String browser = pro.getProperty("password");
		System.out.println(browser);
	}

	
	


}
