package utility;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.TestBase;

public class TestUtility extends TestBase{
	public static XSSFWorkbook workbook ;
	public static String[][] getData() {

		try {
			FileInputStream file = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\AutomationFramework\\contactData.xlsx");
			workbook =new XSSFWorkbook(file);

		} catch (Exception e) {
			System.out.println("Given file is not on that location");
		} 
		XSSFSheet sheet = workbook.getSheet("crmData");
		int row =sheet.getLastRowNum();
		int column =sheet.getRow(0).getLastCellNum();
		String cellData[][]= new String[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column; j++) {
				cellData[i][j] = sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return cellData;
	}    

	public static void switchToMainPanel() {
		driver.switchTo().frame("mainpanel");
	}
	public static void mouseHoverAction(WebElement mouseHoverElement, WebElement targetElement) {
		Actions act = new Actions(driver);
		act.moveToElement(mouseHoverElement).build().perform();  // here we are giving path in specific crm pages
		targetElement.click();
	}
}
