package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h2[contains(text(), ' Dashboard ')]")WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Customers')]")WebElement CUSTOMERS_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Add Customer')]")WebElement ADD_CUSTOMERS_MENU_ELEMENT;
	
	public void validateDashboardPage(String validateDashboardText) {
		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), validateDashboardText, "Dashboard Page is not available!!!");
	}
	
	public void clickOnCustomersMenu() {
		CUSTOMERS_MENU_ELEMENT.click();
	}
	
	public void clickOnAddCustomerMenu() {
		ADD_CUSTOMERS_MENU_ELEMENT.click();
	}
}
