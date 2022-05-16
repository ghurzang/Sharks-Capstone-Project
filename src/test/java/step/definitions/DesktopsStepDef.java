package step.definitions;

import org.junit.Assert;

import core.Base;
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
		util.threadSleep();

	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktops.clickDesktops();
		logger.info("user clicked on Destops tab");
		util.threadSleep();

	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktops.clickShowAllDesktops();
		logger.info("user clicked on Show All Desktops inner drop down.");
		util.threadSleep();
	}

	@When("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		desktops.isAllDesktopsItemsAvailable();
		logger.info("user see all items are present in desktop page.");
		util.threadSleep();
		util.takeScreenShots();

	}

	@When("User click ADD TO CART option on {string} item")
	public void user_click_add_to_cart_option_on_item(String string) {
		desktops.addToCartHPLP3065();
		logger.info("user clicked add to cart option on item");
		util.threadSleep();

	}

	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
		desktops.selectQuatity();
		logger.info("user selected to add quantity by 1");
		util.threadSleep();

	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktops.addQtyToCart();
		logger.info("user clicked on add to Cart button");
		util.threadSleep();

	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		Assert.assertTrue(desktops.isSuccessMessage());
		logger.info("user is able to see the success message.");
		util.threadSleep();
		util.takeScreenShots();
		
	}
	

}
