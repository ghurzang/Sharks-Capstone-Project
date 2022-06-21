package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.jmx.mbeanserver.Util;

import core.Base;
import utilities.util;

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

	@FindBy(xpath = "//li/a[text()='Register for an affiliate account']")
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

	public void selectPaymentMethod(String paymentType) {
		if (paymentType.equalsIgnoreCase("paymentType"))
			selectPaymentMethodCheque.click();
		else if (paymentType.equalsIgnoreCase("payPal"))
			selectPaymentMethodCheque.click();
		else
			selectBankTranfer.click();
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
		util.threadSleep();

	}

	@FindBy(xpath = "(//div[@class='radio']/label/input)[3]")
	private WebElement selectBankTranfer;

	public void selectBankTranfer() {
		selectBankTranfer.click();
		util.threadSleep();

	}

	@FindBy(xpath = "//div/input[@id='input-bank-name']")
	private WebElement bankName;

	public void bankName(String bankNameValue) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/input[@id='input-bank-name']")));
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
	
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editYourAccInfo;
	
	public void editYourAccInfo() {
		editYourAccInfo.click();
	}
	
	@FindBy(id = "input-firstname")
	private WebElement inputFirstName;
	
	public void inputFirstName(String inputFirstNameValue) {
		inputFirstName.clear();
		inputFirstName.sendKeys(inputFirstNameValue);
	}
	
	@FindBy(id = "input-lastname")
	private WebElement inputLastName;
	
	public void inputLastName(String inputLastNameValue) {
		inputLastName.clear();
		inputLastName.sendKeys(inputLastNameValue);
		
	}
	
	@FindBy(id = "input-email")
	private WebElement inputEmailAdd;
	
	public void inputEmailAdd(String inputEmailAddValue) {
		inputEmailAdd.clear();
		inputEmailAdd.sendKeys(inputEmailAddValue);
	}
	
	@FindBy(id = "input-telephone")
	private WebElement inputTeleNum;
	
	public void inputTeleNum(String inputTeleNumValue) {
		inputTeleNum.clear();
		inputTeleNum.sendKeys(inputTeleNumValue);
	}
	
	@FindBy(xpath = "//div/input[@class='btn btn-primary']")
	private WebElement clickContinueButton;
	
	public void clickContinueButton() {
		clickContinueButton.click();
	}
	
	@FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement successMessagePInfo;
	
	
	public boolean successMessagePInfo() {
		if(successMessagePInfo.isDisplayed())
			return true;
		else
			return false;
	
//	public String actualSuccessMessage() {
//		return successMessagePInfo.getText();
		
	}
	
	
	
	

}
