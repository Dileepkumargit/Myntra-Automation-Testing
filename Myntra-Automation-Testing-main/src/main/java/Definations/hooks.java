package Definations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	public static Properties obj;
	public static WebDriver driver;
	
	@Before
	public void openBrowser() {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dithoopa\\OneDrive - Capgemini\\Teck Resources\\Eclipse\\IE driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@After
	public void closeBrowser() {
//		driver.close();
//		driver.quit();
	}
	@Before
	public static void repo() throws IOException {
		 
		   obj = new Properties();			
		    FileInputStream objfile = new FileInputStream("C:\\Users\\dithoopa\\eclipse-workspace\\Myntra-Automation-Testing-main\\element.properties");									
		    obj.load(objfile);
		    obj.getProperty("Input_Search_Box");
		 
	 }
	public static void propr() throws IOException {
		repo();
		System.out.println(obj.getProperty("Input_Search_Box"));
	}
	 
	 

}
