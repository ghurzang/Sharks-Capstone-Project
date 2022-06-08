package step.definitions;

import java.util.List;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPage;
import utilities.util;

public class RetailStepDef extends Base {

	RetailPage retailPage = new RetailPage();
	
	@Given("user is on Retail websited")
	public void user_is_on_retail_website() {
		Assert.assertTrue(retailPage.homePage());
		logger.info("user is on Retail website");
		util.threadSleep();
	}
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
		Assert.assertTrue(retailPage.myAccountDashboard());
		logger.info("user is able to see MyAccount dashboard");

	}
	
	@When("User click on {string} link")
	public void user_click_on_link(String string) {
		retailPage.registerAffiliateAccount();
		logger.info("user clicked on register affiliate account");
	   
	}
	
	@When("User fill affiliate form with below information")
	public void User_fill_affiliate_form_with_below_information(DataTable dataTable) {
		
		List<List<String>> information = dataTable.asList(String.class);
		retailPage.companyName(information.get(0).get(0));
		retailPage.webAdd(information.get(0).get(0));
		retailPage.taxId(information.get(0).get(0));
		retailPage.selectPayPal();
		retailPage.selectAboutUs();
		
	}
	
	@When("User click on Continue button")
	public void User_click_on_Continue_button() {
		retailPage.clickContinue();
		logger.info("user clicked on continue button");
		
	}
	
	
	
	
}
