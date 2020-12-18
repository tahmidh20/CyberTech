package techBase;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class BaseClass {

public static Properties prop;
public static WebDriver driver;


public BaseClass() {
	 
	prop = new Properties();
	
		try {
			FileInputStream cb = new FileInputStream ("/Users/zebaislam/Desktop/CyberTech/src/"
					+ "main/java/properties/cyberTech.properties");
		  try {
			prop.load(cb);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
}
}
		
public static void initialization () {
	String browserName = prop.getProperty("browser");
	 
	 if (browserName.equals("chrome")) {
		 System.setProperty("webdriver.chrome.driver", prop.getProperty("chromePath"));
		 driver = new ChromeDriver();
		 
		 
	 }
	 
	 else if(browserName.equals("FF")) {
		 System.setProperty(" ", " ");
		 driver = new FirefoxDriver();
	 }
	 
	 else if(browserName.equals("IE")) {
		 System.setProperty(" ", " ");
		 driver = new InternetExplorerDriver();
	 }
	 
	 else {
		 System.out.println("Browser not available");
	 }
	 
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get(prop.getProperty("url"));
	  
		
	}

    public static void tearDown() {
   	 driver.close();
	
	
}	
}


