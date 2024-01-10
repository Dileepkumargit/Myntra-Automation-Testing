package Definations;

import static Definations.hooks.driver;

import java.awt.AWTException;

import POM.addtocartPage;
import POM.homePage;
import POM.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class stepdefination {
	
	homePage Homepage = new homePage();
	loginPage Loginpage = new loginPage();
	addtocartPage Cartpage = new addtocartPage();
	
	
	@Given("I want to open the Myntra website")
	public void i_want_to_open_the_myntra_website() {
		
		String baseUrl = "https://www.myntra.com/";
		driver.get(baseUrl);
		System.out.println("I want to open the Myntra website");
	   
	}
	
	@Given("login to Myntra")
	public void login_to_Myntra() {
		System.out.println("login to Myntra");
	}
	
	@Given("search for the tees")
	public void search_for_the_tees() throws InterruptedException {
		Homepage.searching();
	}

	@When("select the Iteam")
	public void select_the_iteam() throws InterruptedException {
		Homepage.selectGender();
		Thread.sleep(5000);
		Homepage.selectCategory();
		Homepage.selectTshirt();
		Homepage.SelectSize();
		Homepage.ClickAddToCartBtn();
	}

	@When("click add to cart button")
	public void click_add_to_cart_button() throws AWTException, InterruptedException {
		System.out.println("click add to cart button");
		Cartpage.viewCartIteams();
	}

}
