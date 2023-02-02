package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.AlertAndPopUpWindowHandlingUtility;
import com.obsqura.dataProvider.DataProviderUtility;
import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.WaitUtility;


public class CustomersPage {
	WebDriver driver;
	public CustomersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//button[@class='add_c btn btn-primary']")
	private WebElement addClientButton;
	@FindBy(xpath="//h4[@id='titclienti']")
	private WebElement addClientPageTitle;
	@FindBy(xpath="//input[@id='name1']")
	private WebElement clientName;
	@FindBy(xpath="//input[@id='company1']")
	private WebElement companyName;
	@FindBy(xpath="//input[@id='autocomplete']")
	private WebElement geoLocateField;
	@FindBy(xpath="//input[@id='route']")
	private WebElement addressField;
	@FindBy(xpath="//input[@id='locality']")
	private WebElement cityField;
	@FindBy(xpath="//input[@id='postal_code']")
	private WebElement postalCodeField;
	@FindBy(xpath="//input[@id='telephone']")
	private WebElement telephoneField;
	@FindBy(xpath="//input[@id='email1']")
	private WebElement emailField;
	@FindBy(xpath="//input[@id='vat1']")
	private WebElement vatField;
	@FindBy(xpath="//input[@id='cf1']")
	private WebElement ssnField;
	@FindBy(xpath="//input[@id='image']")
	private WebElement fileUploadField;
	@FindBy(xpath="//textarea[@id='comment1']")
	private WebElement commentField;
	@FindBy(xpath="//button[@form='client_form']")
	private WebElement addClientButtonSubmit;
	@FindBy(xpath="//div[@id='titoloclienti']")
	private WebElement addClientSubmitTitle;
	@FindBy(xpath="(//button[@class='pull-left btn btn-default'])[2]")
	private WebElement goBackButtonAdClientWindow;
	@FindBy(xpath="//section[@class='content-header']")
	private WebElement goBackNavigatedPageTitle;
	By dropdownSelectCustomerPage=By.xpath("//ul[@class='dropdown-menu pull-right tasks-menus']//li");
	@FindBy(xpath="//a[@data-toggle='dropdown'and@class='dropdown-toggle btn-round btn btn-default']")
	private WebElement actionButtonCustomerPage;
	@FindBy(xpath="(//button[@class='btn btn-default btn-xs btn-primary dropdown-toggle'])[1]")
	private WebElement actionButtonInTable;
	@FindBy(xpath="(//ul[@class='dropdown-menu pull-right'])[2]//li")
	private List<WebElement> actionDropdown;
	@FindBy(xpath="//button[@id='submit']")
	private WebElement saveChangesButtonInEdit;
	@FindBy(xpath="//button[@data-bb-handler='cancel']")
	private WebElement deleteOptionCancelButton;
	@FindBy(xpath="//button[@data-bb-handler='confirm']")
	private WebElement deleteOptionConfirmButton;
	@FindBy(xpath="//input[@type='search'and@aria-controls='dynamic-table']")
	private WebElement searchFieldCustomerPage;
	@FindBy(xpath="(//span[@class='bold'])[12]")
	private WebElement viewClientTitle;
	@FindBy(xpath="//h4[@id='titclienti']")
	private WebElement editClientTitle;
	@FindBy(xpath="(//div[@class='col-md-12 col-lg-6 bio-row']//child::span[@class='bold'])[1]")
	private WebElement editClientSubmitTitle;
	@FindBy(xpath="//div[@class='bootbox-body']")
	private WebElement deleteClientTitle;
	@FindBy(xpath="//table[@role='grid']//child::tr[@class='odd'or@class='even']")
	private List <WebElement> rowTable;
	@FindBy(xpath="//ul[@class='dropdown-menu pull-right tasks-menus']//li")
	private List <WebElement> dropdownCount;
	@FindBy(xpath="(//ul[@class='dropdown-menu pull-right'])[3]//li")
	private List <WebElement> tableActionDropCount;
	
	
	public void clickOnAddClientButton() throws IOException {
		String actualTitle,expectedTitle=ExcelUtility.getTestData(1, 0, constants.Constants.TESTDATAFILE, "CustomerPage");
		Assert.assertTrue(PageUtility.isElementEnabled(addClientButton), "Add Client Button Is Not Enabled");
		PageUtility.clickOnElement(addClientButton);
		WaitUtility.textToBePresentInElement(driver, addClientPageTitle, expectedTitle);
		actualTitle=PageUtility.getElementText(addClientPageTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Add Client Page Is Not Displayed");
		}
	
	public void enterDetailsOnAddClientWindow(String user,String company,String geoLocate,String address,String city,String postalCode,String telephone,String email,String vat,String ssn,String comment) throws IOException {
		String actualTitle,expectedTitle=ExcelUtility.getTestData(2, 0, constants.Constants.TESTDATAFILE, "CustomerPage");
		DataProviderUtility.sendKeyValue(driver, clientName, user);
		DataProviderUtility.sendKeyValue(driver, companyName, company);
		DataProviderUtility.sendKeyValue(driver, geoLocateField, geoLocate);
		DataProviderUtility.sendKeyValue(driver, addressField, address);
		DataProviderUtility.sendKeyValue(driver, cityField, city);
		DataProviderUtility.sendKeyValue(driver, postalCodeField, postalCode);
		DataProviderUtility.sendKeyValue(driver, telephoneField, telephone);
		DataProviderUtility.sendKeyValue(driver, emailField, email);
		DataProviderUtility.sendKeyValue(driver, vatField, vat);
		DataProviderUtility.sendKeyValue(driver, ssnField, ssn);
		PageUtility.enterText(fileUploadField, constants.Constants.UPLOADFILE);
		DataProviderUtility.sendKeyValue(driver, commentField, comment);
		Assert.assertTrue(PageUtility.isElementEnabled(addClientButtonSubmit), "Add Client Button Is Not Enabled");
		PageUtility.clickOnElement(addClientButtonSubmit);
		WaitUtility.textToBePresentInElement(driver, addClientSubmitTitle, expectedTitle);
		actualTitle=PageUtility.getElementText(addClientSubmitTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Not Displayed The Submission Page");
		}
	
	public void clickOnGoBackButtonAddClientWindow() throws IOException {
		String actualTitle,expectedTitle=ExcelUtility.getTestData(3, 0, constants.Constants.TESTDATAFILE, "CustomerPage");
		Assert.assertTrue(PageUtility.isElementEnabled(goBackButtonAdClientWindow), "GoBack Button In Add Client Popup Window Is Not Enabled");
		PageUtility.clickOnElement(goBackButtonAdClientWindow);
		actualTitle=PageUtility.getElementText(goBackNavigatedPageTitle);
		Assert.assertEquals(actualTitle, expectedTitle, expectedTitle);
		}
	
	public void clickOnActionButtonCustomerPage() throws IOException {
		int expectedCount=ExcelUtility.getTestNumericData(8, 0, constants.Constants.TESTDATAFILE, "CustomerPage");
		Assert.assertTrue(PageUtility.isElementEnabled(actionButtonCustomerPage), "Action button Is Not Enabled in the Customer Page");
		WaitUtility.fluentWaitForElementToBeClickable(driver, actionButtonCustomerPage);
		PageUtility.clickOnElement(actionButtonCustomerPage);
		List<WebElement>dropdown=dropdownCount;
		int countDrop=PageUtility.getElementSize(dropdown);
		Assert.assertEquals(countDrop, expectedCount, "Count Is Not Displayed");
		}
	
	public void clickOnActionButtonInTable() throws IOException {
		int expectedCount=ExcelUtility.getTestNumericData(8, 0, constants.Constants.TESTDATAFILE, "CustomerPage");
		WaitUtility.waitForElementClickable(driver, actionButtonInTable);
		Assert.assertTrue(PageUtility.isElementEnabled(actionButtonInTable), "Action Button Is Not Enabled For The Table");
		PageUtility.clickOnElement(actionButtonInTable);
		List<WebElement>dropdown=tableActionDropCount;
		int countDrop=PageUtility.getElementSize(dropdown);
		Assert.assertEquals(countDrop, expectedCount, "Count Is Not Displayed");
		}
	
	public void clickOnViewClientOptionFromDropdown(String listItem) throws IOException {
		String actualTitle,expectedTitle=ExcelUtility.getTestData(5, 0, constants.Constants.TESTDATAFILE, "CustomerPage");
		List<WebElement>selectDropDown=actionDropdown;
		WaitUtility.waitVisibilityOfAllElements(driver, actionDropdown);
		for(WebElement dropDown:selectDropDown) {
			if(PageUtility.getElementText(dropDown).equalsIgnoreCase(listItem)){
				Assert.assertTrue(PageUtility.isElementDisplayed(dropDown), "List To Select View Client Option Is Not Displayed");
				PageUtility.clickOnElement(dropDown);
				break;
				}
			}
		WaitUtility.waitVisibilityOfAllElementsLocatedBy(driver, viewClientTitle);
		actualTitle=PageUtility.getElementText(viewClientTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Not Displayed View Client Page");
		}
	
	public void clickOnEditClientOptionFromDropdown(String listItem) throws IOException {
		String actualTitle,expectedTitle=ExcelUtility.getTestData(6, 0, constants.Constants.TESTDATAFILE, "CustomerPage");
		List<WebElement>selectDropDown=actionDropdown;
		WaitUtility.waitVisibilityOfAllElements(driver, actionDropdown);
		for(WebElement dropDown:selectDropDown) {
			if(PageUtility.getElementText(dropDown).equalsIgnoreCase(listItem)){
				Assert.assertTrue(PageUtility.isElementDisplayed(dropDown), "List To Select Edit Client Option Is Not Displayed");
				PageUtility.clickOnElement(dropDown);
				break;
				}
			}
		WaitUtility.textToBePresentInElement(driver, editClientTitle, expectedTitle);
		actualTitle=PageUtility.getElementText(editClientTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Edit Client Page Is Not Displayed");
		}
	
	public void editClientData(String geoLocate,String address,String listItem) throws IOException {
		String actualTitle,expectedTitle=ExcelUtility.getTestData(5, 0, constants.Constants.TESTDATAFILE, "CustomerPage");
		List<WebElement>selectDropDown=actionDropdown;
		WaitUtility.waitVisibilityOfAllElements(driver, actionDropdown);
		for(WebElement dropDown:selectDropDown) {
			if(PageUtility.getElementText(dropDown).equalsIgnoreCase(listItem)){
				Assert.assertTrue(PageUtility.isElementDisplayed(dropDown), "List To Select Edit Client Option Is Not Displayed");
				PageUtility.clickOnElement(dropDown);
				break;
				}
			}
		Assert.assertTrue(PageUtility.isElementDisplayed(geoLocateField), "GeoLocate Field Is Not Displayed In Edit Client Page");
		DataProviderUtility.sendKeyValue(driver, geoLocateField, geoLocate);
		Assert.assertTrue(PageUtility.isElementDisplayed(addressField), "Address Field Is Not Displayed In Edit Client Page");
		DataProviderUtility.sendKeyValue(driver, addressField, address);
		WaitUtility.waitForElementClickable(driver, saveChangesButtonInEdit);
		Assert.assertTrue(PageUtility.isElementEnabled(saveChangesButtonInEdit), "Save Changes Button Is Not Enabled In Client Edit Page");
		PageUtility.clickOnElement(saveChangesButtonInEdit);
		WaitUtility.textToBePresentInElement(driver, editClientSubmitTitle, expectedTitle);
		actualTitle=PageUtility.getElementText(editClientSubmitTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Not Displaying The Edit Submit Page");
		}
	
	public void clickOnDeleteClientOptionFromDropdown(String listItem) throws IOException {
		String actualTitle,expectedTitle=ExcelUtility.getTestData(3, 0, constants.Constants.TESTDATAFILE, "CustomerPage");
		List<WebElement>selectDropDown=actionDropdown;
		WaitUtility.waitVisibilityOfAllElements(driver, actionDropdown);
		for(WebElement dropDown:selectDropDown) {
			if(PageUtility.getElementText(dropDown).equalsIgnoreCase(listItem)){
				Assert.assertTrue(PageUtility.isElementDisplayed(dropDown), "List To Select Delete Client Option Is Not Displayed");
				PageUtility.clickOnElement(dropDown);
				break;
				}
			}
		WaitUtility.waitForElementVisibilityOf(driver, deleteOptionCancelButton);
		Assert.assertTrue(PageUtility.isElementEnabled(deleteOptionCancelButton), "Cancel Button Is Not Enabled In Delete Confirmation Page");
		PageUtility.clickOnElement(deleteOptionCancelButton);
		actualTitle=PageUtility.getElementText(goBackNavigatedPageTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Not Landed In Customer Page");
		}
	
	public void clickOnConfirmButtonInDelete(String listItem) throws IOException {
		String actualTitle,expectedTitle=ExcelUtility.getTestData(3, 0, constants.Constants.TESTDATAFILE, "CustomerPage");
		List<WebElement>selectDropDown=actionDropdown;
		WaitUtility.waitVisibilityOfAllElements(driver, actionDropdown);
		for(WebElement dropDown:selectDropDown) {
			if(PageUtility.getElementText(dropDown).equalsIgnoreCase(listItem)){
				Assert.assertTrue(PageUtility.isElementDisplayed(dropDown), "List To Select Delete Client Option Is Not Displayed");
				PageUtility.clickOnElement(dropDown);
				break;
				}	
		}
		WaitUtility.waitForElementVisibilityOf(driver, deleteOptionConfirmButton);
		Assert.assertTrue(PageUtility.isElementEnabled(deleteOptionConfirmButton), "Confirm Button Is Not Enabled In Delete Confirmation Page");
		PageUtility.clickOnElement(deleteOptionConfirmButton);
		actualTitle=PageUtility.getElementText(goBackNavigatedPageTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Confirm Delete Alert Message IS Not Displayed and Not Landed In Customer Page");
		}
	
	public void enterDataInSearchField() throws IOException {
		Assert.assertTrue(PageUtility.isElementDisplayed(searchFieldCustomerPage), "Search Field Is Not Displayed In The Customer Page");
		PageUtility.enterText(searchFieldCustomerPage, ExcelUtility.getTestData(0, 0, constants.Constants.TESTDATAFILE, "CustomerPage"));
		String actualData,expectedData= ExcelUtility.getTestData(7, 0, constants.Constants.TESTDATAFILE, "CustomerPage");
		List<WebElement>row=rowTable;
		for(WebElement data:row ) {
			if(PageUtility.getElementText(data).equals(ExcelUtility.getTestData(7, 0, constants.Constants.TESTDATAFILE, "CustomerPage"))) {
				actualData = PageUtility.getElementText(data);
				actualData = PageUtility.getElementText(data);
				Assert.assertEquals(actualData, expectedData, "Displayed Data IS Not Correct");
				break;
				}
			}
		
		}
	}
