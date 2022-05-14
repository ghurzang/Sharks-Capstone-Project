package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopsPage extends Base {

	/*
	 * In this class we store all UI elements that belongs to Desktop of this
	 * application. We use PageFactory Class to to initialize the UI elements we
	 * store in this class. PageFactory class provides a method called .initElements
	 * and this method's job is to initialize all UI (User Interface) Elements.
	 */

	public DesktopsPage() {
		PageFactory.initElements(driver, this);
	}

	// @FindBy annotation is == driver.findElement()

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement logo;

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopsDropDown;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktopsInnerDropDown;

	@FindBy(xpath = "//div[@class='list-group']")
	private WebElement allDesktopsItems;

	@FindBy(xpath = "//button[@onclick=\"cart.add('47', '1');\"]")
	private WebElement addToCartHPLP3065;

	@FindBy(xpath = "//input[@name='quantity']")
	private WebElement selectQty;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addQtyToCart;

	@FindBy(xpath = "//div[text()='Success: You have added ']")
	private WebElement successMessage;

	public boolean isLogoPresent() {
		if (logo.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickDesktops() {
		desktopsDropDown.click();

	}

	public void clickShowAllDesktops() {
		showAllDesktopsInnerDropDown.click();

	}

	public boolean isAllDesktopsItemsAvailable() {
		if (allDesktopsItems.isDisplayed())
			return true;
		else
			return false;
	}

	public void addToCartHPLP3065() {
		addToCartHPLP3065.click();
	}

	public void selectQuatity() {
		selectQty.click();
				
	}

	public void addQtyToCart() {
		addQtyToCart.click();
	}

	public boolean isSuccessMessage() {
		if (successMessage.isDisplayed())
			return true;
		else
			return false;
	}
}
