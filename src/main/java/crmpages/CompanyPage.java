package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.TestBase;

public class CompanyPage extends TestBase {

	// PageFactory Method by using constructor

	public CompanyPage() {
		PageFactory.initElements(driver, this);
	}
	// object repository

	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/legend")
	WebElement newCompanyTxt;

	@FindBy(id = "company_name" )
	WebElement companyNameTxtBox;

	@FindBy(name ="industry")
	WebElement idustryTxtBox;

	@FindBy(css ="#annual_revenue")
	WebElement annualRevenueTxtBox;

	@FindBy(css ="#num_of_employees")
	WebElement numEmployeeTxtBox;

	@FindBy(css="#vat_number")
	WebElement vatNumTxtBox;

	@FindBy(css="#phone")
	WebElement phoneTxtBox;

	@FindBy(css="#fax")
	WebElement faxTxtBox;

	@FindBy(css="#website")
	WebElement websiteBox;

	@FindBy(css="#email")
	WebElement emailTxtBox;

	@FindBy(css="#symbol")
	WebElement symbolTxtBox;

	@FindBy(name="address_title")
	WebElement addTitleTxtBox;

	@FindBy(name="address")
	WebElement addressTxtBox;

	@FindBy(name="city")
	WebElement cityTxtBox;

	@FindBy(name="state")
	WebElement stateTxtBox;

	@FindBy(name="postcode")
	WebElement postcodeTxtBox;

	@FindBy(name="country")
	WebElement countryTxtBox;

	@FindBy(name="tags")
	WebElement tagsTxtBox;

	@FindBy(name="service")
	WebElement servicecodeTxtBox;

	@FindBy(xpath="//*[@id=\"companyForm\"]/table/tbody/tr[8]/td/input")
	WebElement saveBtn;

	//Actions 

	public String getNewCompanyTxt() {
		return newCompanyTxt.getText(); //this statement return the text contain in that webelement
	}
	public void createCompany() {
		companyNameTxtBox.sendKeys("JAI GAJANAN BUILDCON");
		idustryTxtBox.sendKeys("Builders And Developers");
		annualRevenueTxtBox.sendKeys("Builders And Developers");
		annualRevenueTxtBox.sendKeys("7 Billion");
		numEmployeeTxtBox.sendKeys("7777");
		vatNumTxtBox.sendKeys("BO7700770077");
		phoneTxtBox.sendKeys("7777777777");
		faxTxtBox.sendKeys("7777700000");
		websiteBox.sendKeys("www.Buildconbond.worldwide");
		emailTxtBox.sendKeys("jb007@bond.worldwide");
		symbolTxtBox.sendKeys("007");
		addTitleTxtBox.sendKeys("Buildcon India");
		addressTxtBox.sendKeys("Hinjewadi Block no 7");
		cityTxtBox.sendKeys("Pune");
		stateTxtBox.sendKeys("Maharashtra");
		postcodeTxtBox.sendKeys("777701");
		countryTxtBox.sendKeys("India");
		tagsTxtBox.sendKeys("construction group, Development ");
		servicecodeTxtBox.sendKeys("This is the description part of body ");
		saveBtn.click();
	}
}