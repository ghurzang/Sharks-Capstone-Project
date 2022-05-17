package step.definitions;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopsPage;
import utilities.util;

public class DesktopsStepDef extends Base {

	DesktopsPage desktops = new DesktopsPage();

	@Given("User in on Retail website")
	public void user_in_on_retail_website() {
		Assert.assertTrue(desktops.isLogoPresent());
		logger.info("user is on Home page.");
		//util.threadSleep();

	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktops.clickDesktops();
		logger.info("user clicked on Destops tab");
		//util.threadSleep();

	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktops.clickShowAllDesktops();
		logger.info("user clicked on Show All Desktops inner drop down.");
		//util.threadSleep();
	}

	@When("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		desktops.isAllDesktopsItemsAvailable();
		logger.info("user see all items are present in desktop page.");
		util.threadSleep();
		//util.takeScreenShots();

	}

	@When("User click ADD TO CART option on {string} item")
	public void user_click_add_to_cart_option_on_item(String string) {
		desktops.addToCartHPLP3065();
		logger.info("user clicked add to cart option on item");
		//util.threadSleep();

	}

	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
		desktops.selectQuatity();
		logger.info("user selected to add quantity by 1");
		//util.threadSleep();

	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktops.addQtyToCart();
		logger.info("user clicked on add to Cart button");
		//util.threadSleep();

	}

	@When("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktops.addToCartCanonEOS5D();
		logger.info("user clicked add to cart option on Canon EOS 5D item.");
		util.threadSleep();
	}

	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
		desktops.selectColorRed();
		logger.info("user selected color from dropdown red.");
		util.threadSleep();
	}


	@When("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		Assert.assertTrue(desktops.isSuccessMessage());
		logger.info("user is able to see the success message.");
		util.threadSleep();
		util.takeScreenShots();
	}
	
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktops.clickCanonEOS5DCamera();
		logger.info("user clicked on canon EOS 5D camera.");
		util.threadSleep();
	   
	}
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktops.writeReview();
		logger.info("user clicked on write a review link.");
		util.threadSleep();

	}
	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> reviewInfo = dataTable.asMaps(String.class, String.class);
		desktops.writeYourName(reviewInfo.get(0).get("yourName"));
		util.threadSleep();
		desktops.writeYourReview(reviewInfo.get(0).get("yourReview"));
		util.threadSleep();
		desktops.clickGoodRate();
		logger.info("user filled the review infromation with his name.");
		util.threadSleep();

	}
	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktops.clickContinueBtn();
		logger.info("user clicked on continue button.");
		util.threadSleep();

	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
		Assert.assertTrue(desktops.isthanksReviewMessage());
		logger.info("user is able to see the thanks for review message.");
		util.takeScreenShots();
	    
	}
}
