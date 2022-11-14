package crmtest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.CompanyPage;
import crmpages.ContactPage;
import crmpages.DealPage;
import crmpages.HomePage;
import crmpages.LoginPage;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	CompanyPage companyPage;
	ContactPage contactPage;
	DealPage dealPage;

	@BeforeMethod
	public void initialization() {
		init();
		loginPage = new LoginPage(); // we have to all time  this statement after init method
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		companyPage = new CompanyPage();
		contactPage = new ContactPage();
		dealPage = new DealPage();

	}

	@Test(priority =1)
	public void validUserTxt() {
		String name = homePage.userNameTxt();
		Assert.assertEquals(name, "  User: james bond");
	}

	@Test(priority =2)
	public void validNewCompanyRedirection() {
		homePage.newCompanyRedirect();
		Assert.assertEquals(companyPage.getNewCompanyTxt() ,"Create New Company" );
	}

	@Test(priority =3)
	public void validNewContactRedirection() {
		homePage.newContactRedirect();
		Assert.assertEquals(contactPage.getNewContactTxt(),"Contact Information" );
	}

	@Test(priority =4)
	public void validNewDealRedirection() {
		homePage.newDealRedirect();
		Assert.assertEquals(dealPage.getDealTxt(),"Deal" );
	}

	@AfterMethod
	public void closeResources() {
		homePage.logout();
		driver.close();
	}

}
