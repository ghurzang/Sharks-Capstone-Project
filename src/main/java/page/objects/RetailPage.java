package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPage extends Base {

	public RetailPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement clickMyAccount;

	public void clickMyAccount() {
		clickMyAccount.click();
		
	}
	
	@FindBy(xpath = "//a[text()=\"Login\"]")
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
	
	
	
	
}
