package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AddCustomerPage;
import pages.DashboardPage;
import pages.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;

	@Test
	public void userShuldBeAbleToAddCustomers() throws InterruptedException {
		
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickLoginButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage("Dashboard");
		Thread.sleep(3000);
		dashboardPage.clickOnCustomersMenu();
		dashboardPage.clickOnAddCustomerMenu();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.validateAddCustomerPage("Add Contact");
		Thread.sleep(3000);
		addCustomerPage.insertFullname("Mogambo");
		addCustomerPage.selectCompany("Apple");
		addCustomerPage.insertEmail("abc@abc.com");
		addCustomerPage.insertPhoneNumber("666 666 6");
		addCustomerPage.insertAddress("6th Street");
		addCustomerPage.insertCity("Some Where");
		addCustomerPage.insertState("NY");
		addCustomerPage.insertZip("66666");
		addCustomerPage.selectCountryName("Afghanistan");
		
		
		
		
		
		//BrowserFactory.tearDown();
		
	}

}
