package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopsAndNoteBooksPage;
import utilities.util;

public class LaptopsAndNoteBooksStepDef extends Base {
	
	LaptopsAndNoteBooksPage laptopsNotebooks = new LaptopsAndNoteBooksPage();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		Assert.assertTrue(laptopsNotebooks.isLogoDisplay());
		logger.info("User is on retail website.");
	   
	}
	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopsNotebooks.clickLaptopsAndNotebooks();
		logger.info("User clicked on laptops and notebooks tab.");
	  
	}
	@When("User click on Show all Laptop & NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopsNotebooks.clickShowAllLaptopsAndNotebooks();
		logger.info("User clicked on show all laptop and notebooks option.");
		
	}
	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptopsNotebooks.clickMacbookItem();
		logger.info("User clicked on Macbook item.");
		
	}
	@When("User click add into Cart button")
	public void user_click_add_into_cart_button() {
		laptopsNotebooks.clickAddToCartBtn();
		logger.info("User clicked add to cart button. ");
	    
	}
	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) {
		Assert.assertTrue(laptopsNotebooks.seeSuccessMessage());
		logger.info("User saw the success message.");
	}
	
	@When("User should see '1 item(s)-602.00' showed to the cart")
	public void User_should_see_1_items_602_00_showed_to_the_cart(){
		Assert.assertTrue(laptopsNotebooks.showCartTotalInBtn());
		logger.info("user should see 1 item(s)-602.00 showed to the cart.");
	    
	}
	@When("User click on cart option")
	public void user_click_on_cart_option() {
		laptopsNotebooks.clickshowCartTotalInBtn();
		logger.info("user clicked on cart option");
	   
	}
	@When("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopsNotebooks.clickOnRemoveBtn();
		logger.info("user clicked on red X button to remove the item from cart.");
	   
	}
	@When("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) {
		Assert.assertTrue(laptopsNotebooks.showCartTotalZero());
		logger.info("Item removed and cart show zero amount.");
		util.takeScreenShots();
	   
	}
	@When("User click on product comparison icon on {string}")
	public void user_click_on_product_comparison_icon_on(String string) {
		laptopsNotebooks.compateBtnMacBook();
		logger.info("user cicked on product comparison icon on MacBook.");

	}
	@When("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopsNotebooks.compareBtnMacBookAir();
		logger.info("user clicked on product comparison link on MacBookAir.");
	}	
	@Then("User should see message {string}")
	public void User_should_see_a_message(String string) {
		Assert.assertTrue(laptopsNotebooks.comparisonSuccessMessage());
		logger.info("user is able to see comparison success message.");
	
	}
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		laptopsNotebooks.clickComparisonLink();
		logger.info("user saw product comparison chart.");

	}

	

}
