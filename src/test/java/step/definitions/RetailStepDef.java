package step.definitions;

import java.util.List;
import java.util.Map;

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
		retailPage.clickLogin();
		logger.info("user clicked on login button");
		util.threadSleep();

	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String email, String pass) {
		retailPage.enterEmail(email);
		logger.info("user entered email address." + email);
		retailPage.enterPass(pass);
		logger.info("user entered password" + pass);
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

	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retailPage.registerAffiliateAccount();
		logger.info("user clicked on Register for an Affiliate Account link");
	}

	@When("User fill affiliate form with below information")
	public void User_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String, String>> affiliateInformation = dataTable.asMaps(String.class, String.class);
		retailPage.companyName(affiliateInformation.get(0).get("company"));
		retailPage.webAdd(affiliateInformation.get(0).get("website"));
		retailPage.taxId(affiliateInformation.get(0).get("taxID"));
		retailPage.selectPaymentMethod(affiliateInformation.get(0).get("paymentMethod"));
		retailPage.chequePayeeNameInput(affiliateInformation.get(0).get("payeeName"));
		logger.info("user filled affiliate form with required infomation");
		util.takeScreenShots();
	}

	@When("User check on About us check box")
	public void User_check_on_About_us_check_box() {
		retailPage.selectAboutUs();
		logger.info("user checked on About us Check box");

	}

	@When("User click on Continue button")
	public void User_click_on_Continue_button() {
		retailPage.clickContinue();
		logger.info("user clicked on continue button");

	}

	@Then("User should see a success message")
	public void User_should_see_a_success_message() {
		Assert.assertTrue(retailPage.successMessageVerify());
		logger.info("Success message verified.");
		util.takeScreenShots();
	}

	@When("User click on {string} link")
	public void user_click_on_link(String string) {
		retailPage.editAffiliateInfo();
		logger.info("user clicked on Edit your affiliate information link");

	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailPage.selectBankTranfer();

	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> bankInformation = dataTable.asMaps(String.class, String.class);
		retailPage.bankName(bankInformation.get(0).get("bankName"));
		retailPage.branchNum(bankInformation.get(0).get("abaNumber"));
		retailPage.swiftCode(bankInformation.get(0).get("swiftCode"));
		retailPage.accountName(bankInformation.get(0).get("accountName"));
		retailPage.accountNum(bankInformation.get(0).get("accountNumber"));

	}

	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
		retailPage.editYourAccInfo();
		logger.info("user clicked on edit account infromation link");

	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> personalInformation = dataTable.asMaps(String.class, String.class);
		retailPage.inputFirstName(personalInformation.get(0).get("firstname"));
		retailPage.inputLastName(personalInformation.get(0).get("lastName"));
		retailPage.inputEmailAdd(personalInformation.get(0).get("email"));
		retailPage.inputTeleNum(personalInformation.get(0).get("telephone"));
		util.takeScreenShots();

	}
	
	@Then("User click on continue button")
	public void user_click_on_continue_button() {
		retailPage.clickContinueButton();
	   
	}
	
	@Then("User should see a message {string}.")
	public void user_should_see_a_message(String string) {
		Assert.assertTrue(retailPage.successMessagePInfo());
		logger.info("User should see success Message");
	}


//	@Then("User should see a message {string}.")
//	public void user_should_see_a_message(String string) {
//		Assert.assertTrue(retailPage.successMessagePInfo());
//		//Assert.assertEquals(expectedMessage, retailPage.actualSuccessMessage());
//		logger.info("User should see success Message");
//
//	}

}
