package Definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class stepdefination {
	
	@Given("I want to open the Myntra website")
	public void i_want_to_open_the_myntra_website() {
		System.out.println("I want to open the Myntra website");
	   
	}
	
	@Given("login to Myntra")
	public void login_to_Myntra() {
		System.out.println("login to Myntra");
	}
	
	@Given("search for the tees")
	public void search_for_the_tees() {
		System.out.println("search for the tees");
	}

	@When("select the Iteam")
	public void select_the_iteam() {
		System.out.println("select the Iteam");
	}

	@When("click add to cart button")
	public void click_add_to_cart_button() {
		System.out.println("click add to cart button");
	}

}
