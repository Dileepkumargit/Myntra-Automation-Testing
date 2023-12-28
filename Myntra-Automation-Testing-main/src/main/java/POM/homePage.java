package POM;

import static Definations.hooks.obj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.Random;
import java.util.ArrayList;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Definations.hooks.driver;
public class homePage {

	WebDriverWait wait = new WebDriverWait(driver,20);
	
	public void searching() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(obj.getProperty("Input_Search_Box"))));
		driver.findElement(By.xpath(obj.getProperty("Input_Search_Box"))).sendKeys("tees");
		driver.findElement(By.xpath(obj.getProperty("click_Search_Button"))).click();
	}
	
	public void selectGender() throws InterruptedException {
		
		List<WebElement> genderlist = driver.findElements(By.xpath(obj.getProperty("SelectGenderRadio_btn")));
		wait.until(ExpectedConditions.visibilityOfAllElements(genderlist));
		System.out.println(genderlist.size());
		Random random = new Random();
		int select = random.nextInt(genderlist.size());
		String selectedIteam = genderlist.get(select).getText();
		System.out.println("selected iteam : "+selectedIteam);	
		Thread.sleep(5000);
		genderlist.get(select).click();
		
//		driver.findElement(By.xpath(obj.getProperty("SelectGenderRadio_btn"))).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(obj.getProperty("CategoriesRadio_btn"))).click();
//		driver.findElement(By.xpath(obj.getProperty("SelectTheIteam"))).click();
		
	}
	public void selectCategory() {
		
		List<WebElement> Categories = driver.findElements(By.xpath(obj.getProperty("CategoriesRadio_btn")));
		System.out.println(Categories.size());
		Random random = new Random();
		int selectcategory = random.nextInt(Categories.size());
		String SelectedCategory = Categories.get(selectcategory).getText();
		System.out.println("Slected Category  : "+ SelectedCategory);
		Categories.get(selectcategory).click();
		
	}
	public void selectTshirt() {
		
		List<WebElement> SelectTshirt = driver.findElements(By.xpath(obj.getProperty("SelectTheIteam")));
		System.out.println(SelectTshirt.size());
		Random random = new Random();
		int totalResults = random.nextInt(SelectTshirt.size());
		String TshirtDetails = SelectTshirt.get(totalResults).getText();
		System.out.println(TshirtDetails);
		SelectTshirt.get(totalResults).click();
		
	}
	
	public void SelectSize() throws InterruptedException {
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
		Thread.sleep(5000);
		List<WebElement> SelectSize = driver.findElements(By.xpath(obj.getProperty("Size_btn")));
		System.out.println(SelectSize.size());
		Random random = new Random();
		int choseSize = random.nextInt(SelectSize.size());
		String selectedSize = SelectSize.get(choseSize).getText();
		System.out.println("Selected Size  : " + selectedSize);
		SelectSize.get(choseSize).click();
		
		
	}
	public void ClickAddToCartBtn() {
		
		driver.findElement(By.xpath(obj.getProperty("AddToCart_btn"))).click();
		
	}
	
}
