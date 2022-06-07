package step.definitions;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPage;
import utilities.util;

public class RetailStepDef extends Base {

	RetailPage retailPage = new RetailPage();


	@Given("User click  on MyAccount")
	public void user_click_on_my_account() {
		retailPage.clickMyAccount();
		logger.info("user clicked on My Account");
		util.threadSleep();

	}
	@When("User click on Login")
	public void user_click_on_login() {
		retailPage.clickMyAccount();
		logger.info("user clicked on login button");
		util.threadSleep();

	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String email, String pass) {
		retailPage.enterEmail(email);
		logger.info("user entered email address." +email);
		retailPage.enterPass( pass);
		logger.info( "user entered password" +pass);
		util.threadSleep();

	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		retailPage.clickLoginBtn();
		logger.info("user clicked on login button");

	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {

	}
	
	@When("User click on {string} link")
	public void user_click_on_link(String string) {
	  
	}
	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information() {
	   
	}
}
