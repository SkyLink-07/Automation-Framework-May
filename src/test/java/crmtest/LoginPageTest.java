package crmtest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;

	@BeforeMethod
	public void inlitilization() {
		init();
		loginPage = new LoginPage();
	}
	@Test(priority =4)
	public void validLoginTest() {
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));	
	}
	@Test(priority =3)
	public void validLogoTest() {
		boolean isDisplayed = loginPage.validLogo();
		Assert.assertEquals(isDisplayed, true);
	}
	@Test(priority =2)
	public void validTitleTest() {
		String title =loginPage.validTitle();
		Assert.assertEquals(title, "Free CRM - CRM software for customer relationship management, sales, and support.");
	}
	@Test(priority =1)
	public void validUrlTest() {
		String url = loginPage.validUrl();
		Assert.assertEquals(url, "https://classic.freecrm.com/index.html");
	}
	@AfterMethod
	public void closeResources() {
		driver.close();
	}



}
