package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilities.AlertAndPopUpWindowHandlingUtility;
import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class InventoryPage {
	public WebDriver driver;
	public InventoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//select[@name='PRData_length']")
	private WebElement showDropDown;
	@FindBy(xpath="//img[@src='https://qalegend.com/mobile_service/assets/uploads/thumbs/4b50d036f60a154b126318477eb9c0ed.jpg']")
	private WebElement imageClickFromTable;
	@FindBy(xpath="//tr[@class='product_link']")
	private List<WebElement> tableDisplayCount;
	@FindBy(xpath="//i[@data-original-title='actions']")
	private WebElement actionDropdown;
	By actionList=By.xpath("//ul[@class='dropdown-menu pull-right tasks-menus']/li");
	@FindBy(xpath="//div[@class='alert alert-danger']//child::button[@class='close']")
	private WebElement alertClose;
	@FindBy(xpath="//img[@style='max-width: 100%;']")
	private WebElement imageSize;
	@FindBy(xpath="(//input[@class='checkbox multi-select input-xs'])[1]")
	private WebElement checkBox;
	

	public void clickShow() throws IOException {
		int expectedCount=ExcelUtility.getTestNumericData(1, 0, constants.Constants.TESTDATAFILE, "Inventory");
		List<WebElement>option=PageUtility.selectDropdownbyOptions(showDropDown);
		for(WebElement Inputmenu:option) {
			String show=PageUtility.getElementText(Inputmenu);
			if(PageUtility.equals(Inputmenu, ExcelUtility.getNumeric(1, 0, constants.Constants.TESTDATAFILE, "Inventory"))) {
				Assert.assertTrue(PageUtility.isElementDisplayed(Inputmenu), "List To Select The Count Is Not Displayed");
				PageUtility.isElementDisplayed(Inputmenu);
				break;
				}
			}
		WaitUtility.waitVisibilityOfAllElements(driver, tableDisplayCount);
		List<WebElement>tableCount=tableDisplayCount;
		int count=PageUtility.getElementSize(tableCount);
		Assert.assertEquals(count, expectedCount, "Count Is Not Displayed");
		}
	
	public void clickOnImage() {
		WaitUtility.waitForElementClickable(driver, imageClickFromTable);
		Assert.assertTrue(PageUtility.isElementDisplayed(imageClickFromTable), "Image Is Not Displayed");
		PageUtility.clickOnElement(imageClickFromTable);
		WaitUtility.waitVisibilityOfAllElementsLocatedBy(driver, imageSize);
		Boolean display=PageUtility.isElementDisplayed(imageSize);
		Assert.assertTrue(display, "Image Is Not Displayed");
		}
	}
