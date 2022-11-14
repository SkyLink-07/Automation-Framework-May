package crmtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.CompanyPage;
import crmpages.HomePage;
import crmpages.LoginPage;

public class CompanyPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	CompanyPage companyPage;

	@BeforeMethod
	public void initialization() {
		init();
		loginPage= new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		companyPage = homePage.newCompanyRedirect();
	}
	@Test
	public void createCompanyTest() {
		companyPage.createCompany();

	}
	@AfterMethod
	public void closeResources() {
		driver.close();
	}





}
