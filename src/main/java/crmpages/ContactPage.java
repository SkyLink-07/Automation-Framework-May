package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class ContactPage extends TestBase {
	
	//PageFactory method by using constructor
	
	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Object Repository
	
	@FindBy(xpath ="/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/legend")
	WebElement newContactTxt;

	@FindBy(name ="title")
	WebElement titleDropdown ;

	@FindBy(id ="first_name")
	WebElement firstNameTxtBox ;

	@FindBy(id ="middle_initial")
	WebElement middleNameTxtBox;

	@FindBy(id ="surname")
	WebElement surnameTxtBox;

	@FindBy(name ="mobile")
	WebElement mobileTxtBox;

	@FindBy(id ="email")
	WebElement emailTxtBox;
	
	@FindBy(xpath ="//*[@id=\"contactForm\"]/table/tbody/tr[2]/td[2]/table/tbody/tr[9]/td[2]/input[2]")
	WebElement radioEmailBtn;
	
	@FindBy(xpath ="(//*[@value='Lookup'])[1]")
	WebElement compLookupBtn;
	
	@FindBy(xpath ="//*[@id=\"search\"]")
	WebElement compLookupTxtBox;
	
	@FindBy(xpath ="/html/body/table/tbody/tr[3]/td/table/tbody/tr[2]/td/a")
	WebElement companyBtn;

	@FindBy(xpath ="//*[@id=\"contactForm\"]/table/tbody/tr[3]/td/fieldset/table/tbody/tr/td/table/tbody/tr[4]/td[2]/textarea")
	WebElement addTxtBtn;

	@FindBy(xpath ="//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/input[2]")
	WebElement saveBtn;
	
	@FindBy(xpath ="/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[1]")
	WebElement contactNameTxt; 
	//Actions
	public String getNewContactTxt() {
		return newContactTxt.getText();
	}
	
	public void createContact(String title,String fName,String mName ,String lName ,String mobNum,String email,String address) {
		Select sel =new Select(titleDropdown);
		sel.selectByValue(title);
		firstNameTxtBox.sendKeys(fName);
		middleNameTxtBox.sendKeys(mName);
		surnameTxtBox.sendKeys(lName);
		mobileTxtBox.sendKeys(mobNum);
		emailTxtBox.sendKeys(email);
		radioEmailBtn.click();  // for selecting the no action
		addTxtBtn.sendKeys(address);
		saveBtn.click();
	}
	public String getContactName() {
		return contactNameTxt.getText();
	}
	
}
