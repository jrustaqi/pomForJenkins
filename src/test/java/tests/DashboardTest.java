package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;
import util.BrowserFactory;

public class DashboardTest {

	WebDriver driver;

	@Test
	public void userShuldBeAbleToClickOnCustomersAndAddCustomer() throws InterruptedException {
		
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
		
		
		
		
		
		//BrowserFactory.tearDown();
		
	}
}
