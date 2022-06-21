package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;

public class HomeStepDef extends Base {

	HomePage homePage = new HomePage();

	@When("User click on Currency")
	public void user_click_on_currency() {
		homePage.currency();
		logger.info("user clicked on currency");

	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePage.euro();
		logger.info("user selected Euro from dropdown");

	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		Assert.assertTrue(homePage.currencyEuro());
		logger.info("currency value is changed to Euro");

	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePage.shoppingCart();
		logger.info("user clicked on shopping cart");
	}

	@Then("{string} message should display")
	public void message_should_display(String expected) {
		Assert.assertTrue(homePage.shoppingCartMessage());
		logger.info("the message is displayed");
		

	}

}
