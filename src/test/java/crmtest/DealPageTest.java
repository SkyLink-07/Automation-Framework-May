package crmtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.DealPage;
import crmpages.HomePage;
import crmpages.LoginPage;

public class DealPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	DealPage dealPage;
	@BeforeMethod
	public void initialization() {
		init();
		loginPage= new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		dealPage = homePage.newDealRedirect();
	}
	@Test
	public void createDealTest() {
		dealPage.createDeal();

	}
	@AfterMethod
	public void closeResources() {
		driver.close();
	}

}
