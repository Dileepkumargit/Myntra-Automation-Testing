package POM;

import static Definations.hooks.driver;
import static Definations.hooks.obj;

import org.openqa.selenium.By;

public class addtocartPage {
	
	
	public void ClickAddToCartBtn() throws InterruptedException {
			System.out.println(obj.getProperty("AddToCart_btn"));
			driver.findElement(By.xpath(obj.getProperty("AddToCart_btn"))).click();
			Thread.sleep(2000);			
	}
	public void ViewIteamsInCart() {
			System.out.println(obj.getProperty("ClickToBag_btn"));
			driver.findElement(By.xpath(obj.getProperty("ClickToBag_btn"))).click();
	
	}
	

}
