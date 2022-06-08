package page.objects;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPage extends Base {

	public RetailPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement homePage;
	
	public boolean homePage() {
		if(homePage.isDisplayed())
			return true;
		else
			return false;
	}

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement clickMyAccount;

	public void clickMyAccount() {
		clickMyAccount.click();

	}

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement clickLogin;

	public void clickLogin() {
		clickLogin.click();
	}

	@FindBy(xpath = "//input[@name='email']")
	private WebElement enterEmail;

	public void enterEmail(String email) {
		enterEmail.sendKeys(email);
	}

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement enterPass;

	public void enterPass(String pass) {
		enterPass.sendKeys(pass);
	}

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement clickLoginBtn;

	public void clickLoginBtn() {
		clickLoginBtn.click();
	}

	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountDashboard;

	public boolean myAccountDashboard() {
		if (myAccountDashboard.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerAffiliateAccount;
	
	public void registerAffiliateAccount() {
		registerAffiliateAccount.click();
	}
	
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement companyName;
	
	public void companyName(String companyNameValue) {
		companyName.sendKeys(companyNameValue);
		
	}
	
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement webAdd;
	
	public void webAdd(String webAddValue) {
		webAdd.sendKeys(webAddValue);
	}
	
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxId;
	
	public void taxId(String taxIdValue) {
		taxId.sendKeys(taxIdValue);
		
	}
	
	@FindBy(xpath = "//input[@value='paypal']")
	private WebElement selectPayPal;
	
	public void selectPayPal() {
		selectPayPal.click();
	}
	
	
	@FindBy(xpath = "//input[@value='1']")
	private WebElement selectAboutUs;
	
	public void selectAboutUs() {
		selectAboutUs.click();
	}
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement clickContinue;
	
	public void clickContinue() {
		clickContinue.click();
	}
	

}
