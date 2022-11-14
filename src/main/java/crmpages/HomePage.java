package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.TestBase;
import utility.TestUtility;

public class HomePage extends TestBase {

	public HomePage(){	
		PageFactory.initElements(driver, this);
	}
	// object repository

	@FindBy(xpath ="/html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]")
	WebElement userTxt;

	@FindBy(xpath ="//*[@id=\"navmenu\"]/ul/li[3]/a")
	WebElement companyBtn;

	@FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/ul/li[1]/a")
	WebElement newCompanyBtn;

	@FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[4]/a")
	WebElement contactBtn;

	@FindBy(xpath="//*[@title='New Contact']")
	WebElement newContactBtn;

	@FindBy(xpath = "//*[@title='Deals']")
	WebElement dealBtn; 

	@FindBy(xpath = "//*[@title='New Deal']")
	WebElement newDealBtn; 

	@FindBy(xpath= "/html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[4]/a")
	WebElement logoutBtn;

	//Actions

	Actions act = new Actions(driver);
	public String userNameTxt() {
		TestUtility.switchToMainPanel();
		String userName = userTxt.getText();
		return userName;
	}
	public CompanyPage newCompanyRedirect() {
		TestUtility.switchToMainPanel();
		TestUtility.mouseHoverAction(companyBtn, newCompanyBtn);
		return new CompanyPage();
	}
	public ContactPage newContactRedirect() {
		TestUtility.switchToMainPanel();
		TestUtility.mouseHoverAction(contactBtn, newContactBtn);
		return new ContactPage();
	}
	public DealPage newDealRedirect() {
		driver.switchTo().frame("mainpanel");
		TestUtility.mouseHoverAction(dealBtn, newDealBtn);
		return new DealPage();
	}
	public void logout() {
		
		logoutBtn.click();
	}




}
