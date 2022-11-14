package crmtest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.TestBase;
import crmpages.ContactPage;
import crmpages.HomePage;
import crmpages.LoginPage;
import utility.TestUtility;

public class ContactPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	ContactPage contactPage;

	@BeforeMethod
	public void initialization() {
		init();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactPage =homePage.newContactRedirect();

	}  
	@DataProvider(name ="contactData")
	public String[][] contactDataProvider() {
		return TestUtility.getData();
	}
	
	@Test(dataProvider="contactData")
	public void validateCreateContactTest(String title,String fName,String mName ,String lName ,String mobNum,String email,String address) {
		contactPage.createContact(title,fName, mName, lName, mobNum, email, address);
		Assert.assertEquals(contactPage.getContactName(),fName+" "+lName);

	}
	@AfterMethod
	private void closeResources() {

		driver.close();
	}

}
