package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePage extends Base {
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "//div[id='logo']")
	private WebElement logo;
	
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currency;
	
	@FindBy(xpath = "//button[text()='€ Euro']")
	private WebElement euro;
	
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currencyEuro;
	
	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement shoppingCart;
	
	@FindBy(xpath = "//h1[text()='Shopping Cart']")
	private WebElement shoppingCartMessage;
	
	
	public boolean isLogoDisplay() {
		if(logo.isDisplayed())
			return true;
		else
			return false;

	}
	
	public void currency() {
		currency.click();
		
	}
	
	public void euro() {
		euro.click();
	}
	
	public boolean currencyEuro() {
		if(currencyEuro.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void shoppingCart() {
		shoppingCart.click();
	}
	
	public boolean shoppingCartMessage() {
		if(shoppingCartMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	

}
