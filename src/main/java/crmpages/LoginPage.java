package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.TestBase;

public class LoginPage extends TestBase {
	//to initialize webelement - Page factory method-->by using constuctor
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	//Page object Repository
	//Finding username text box
	@FindBy(xpath= "//*[@placeholder='Username']")
	WebElement usernameTxt;

	//Finding password text box
	@FindBy(xpath = "//*[@placeholder='Password']")
	WebElement passwordTxt;

	//Finding login button text box
	@FindBy(css= ".btn.btn-small")
	WebElement loginBtn;



	@FindBy(xpath = "(//*[@class='img-responsive'])[1]")
	WebElement logo;
	//Actions

	public HomePage login(String username, String password) {
		usernameTxt.sendKeys(username);
		passwordTxt.sendKeys(password);
		loginBtn.click();
		
		return new HomePage(); // here we are returning homepage object

	}

	public boolean validLogo() {
		boolean value =logo.isDisplayed(); 
		return value;
	}

	public String validTitle() {
		String title = driver.getTitle();
		return title;
	}
	public String validUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}



}
