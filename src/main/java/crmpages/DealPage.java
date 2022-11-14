package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class DealPage extends TestBase {
	//page factory by using constructor
	
	public DealPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//object repository 
	
	@FindBy(xpath ="/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/legend")
	WebElement newDealTxt;

	
	//Actions 
	
	public String getDealTxt() {
		return newDealTxt.getText();
	}
	public void createDeal() {
		System.out.println("This is new deal page test");
	}
	
	
	
	
	

}
