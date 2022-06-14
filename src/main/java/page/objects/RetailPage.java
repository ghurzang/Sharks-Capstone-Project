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
		if (homePage.isDisplayed())
			return true;
		else
			return false;
	}

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement clickMyAccount;

	public void clickMyAccount() {
		clickMyAccount.click();

	}

	@FindBy(xpath = "//li/a[text()='Login']")
	private WebElement clickLogin;

	public void clickLogin() {
		clickLogin.click();
	}

	@FindBy(id = "input-email")
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

	@FindBy(id = "input-company")
	private WebElement companyName;

	public void companyName(String companyNameValue) {
		companyName.sendKeys(companyNameValue);

	}

	@FindBy(id = "input-website")
	private WebElement webAdd;

	public void webAdd(String webAddValue) {
		webAdd.sendKeys(webAddValue);
	}

	@FindBy(id = "input-tax")
	private WebElement taxId;

	public void taxId(String taxIdValue) {
		taxId.sendKeys(taxIdValue);

	}

	@FindBy(xpath = "(//div[@class='radio'])[1]")
	private WebElement selectPaymentMethodCheque;

	public void selectPaymentMethodCheque(String paymentType) {
		if (paymentType.equalsIgnoreCase("paymentType"))
			selectPaymentMethodCheque.click();
		else if (paymentType.equalsIgnoreCase("payPal"))
			selectPaymentMethodCheque.click();
		else
			selectPaymentMethodCheque.click();
	}

	@FindBy(id = "input-cheque")
	private WebElement chequePayeeNameInput;

	public void chequePayeeNameInput(String payNameValue) {
		chequePayeeNameInput.sendKeys(payNameValue);
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

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;

	public boolean successMessageVerify() {
		if (successMessage.isDisplayed())
			return true;
		else
			return false;

	}

	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateInfo;

	public void editAffiliateInfo() {
		editAffiliateInfo.click();

	}

	@FindBy(xpath = "(//div[@class='radio'])[3]")
	private WebElement selectBankTranfer;

	public void selectBankTranfer() {
		selectBankTranfer.click();

	}

	@FindBy(id = "input-bank-name")
	private WebElement bankName;

	public void bankName(String bankNameValue) {
		bankName.sendKeys(bankNameValue);

	}
	
	@FindBy(id = "input-bank-branch-number")
	private WebElement branchNum;
	
	public void branchNum(String branchNumValue) {
		branchNum.sendKeys(branchNumValue);
		
	}
	
	@FindBy(id = "input-bank-swift-code")
	private WebElement swiftCode;
	
	public void swiftCode(String swiftCodeValue) {
		swiftCode.sendKeys(swiftCodeValue);
		
	}
	
	@FindBy(id = "input-bank-account-name")
	private WebElement accountName;
	
	public void accountName(String accountNameValue) {
		accountName.sendKeys(accountNameValue);
		
	}
	
	@FindBy(id = "input-bank-account-number")
	private WebElement accountNum;
	
	public void accountNum(String accountNumValue) {
		accountNum.sendKeys(accountNumValue);
		
	}
	

}
