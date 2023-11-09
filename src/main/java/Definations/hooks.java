package Definations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
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
	

}
