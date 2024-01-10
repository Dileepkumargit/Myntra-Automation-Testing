package POM;
import static Definations.hooks.obj;

import org.openqa.selenium.By;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import static Definations.hooks.driver;

public class addtocartPage {
	
	public void viewCartIteams() throws AWTException, InterruptedException {
		System.out.println(obj.getProperty("AddtoBag_btn"));
		driver.findElement(By.xpath(obj.getProperty("AddtoBag_btn"))).click();
		Thread.sleep(2000);
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath(obj.getProperty("unknown_link"))).click();
		
		driver.findElement(By.xpath(obj.getProperty("PlaceOrder_btn"))).click();
		System.out.println(obj.getProperty("PlaceOrder_btn"));
	}
	

}
