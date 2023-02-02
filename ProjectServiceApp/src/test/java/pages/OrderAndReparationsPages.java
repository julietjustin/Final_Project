package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class OrderAndReparationsPages {
	WebDriver driver;
	public OrderAndReparationsPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement filterResultIcon;
	@FindBy(xpath="(//div[@class='form-group'])[1]")
	private WebElement filterFirstField;
	@FindBy(xpath="//input[@name='date']")
	private WebElement filterEnterDate;
	@FindBy(xpath="//div[@class='ranges']//li")
	private List<WebElement> timePeriodFromDropDown;
	@FindBy(xpath="//span[@class='select2-selection__rendered'][1]")
	private WebElement filterMapkaField;
	@FindBy(xpath="//select[@name='manufacturer']")
	private WebElement filterMapkaSelectField;
	@FindBy(xpath="//span[@class='select2-selection__placeholder'][1]")
	private WebElement filterHasWarrantyField;
	@FindBy(xpath="//ul[@class='select2-results__options']//li")
	private List<WebElement> filterWarrantySelectField;
	@FindBy(xpath="//select[@name='status']")
	private WebElement filterStatusField;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement filterResultButton;
	@FindBy(xpath="(//td[@class='dataTables_empty'])[1]")
	private WebElement tableDataAfterFilter;
	@FindBy(xpath="//button[@class='add_reparation btn btn-primary']")
	private WebElement addReparationButton;
	@FindBy(xpath="//h4[@id='titReparation']")
	private WebElement addReparationPageTitle;
	@FindBy(xpath="//div[@id='reparationmodal']//child::button[@type='button'][1]")
	private WebElement AddReparationWindowCloseButton;
	@FindBy(xpath="//section[@class='content-header']")
	private WebElement addReparationCloseTitle;
	@FindBy(xpath="//a[@href='#CompletedRepairs']")
	private WebElement completedRepairsTab;
	@FindBy(xpath="//select[@name='dynamic-table-completed_length']")
	private WebElement completedrepairTableShow;
	@FindBy(xpath="//tr[@class='warranty_row even' or @class='warranty_row odd']")
	private WebElement rowcount;
	@FindBy(xpath="//a[@class='pull-right btn btn-primary']//child::i[@class='fa fa-file-pdf']")
	private WebElement pdfDownloadButton;
	@FindBy(xpath="//a[@class='pull-right btn btn-primary']//child::i[@class='fa fa-file-excel']")
	private WebElement excelDownloadButton;
	@FindBy(xpath="(//a[text()='Next > '])[2]")
	private WebElement scrollNextButton;
	@FindBy(xpath="//tr[@class='warranty_row odd'or@class='warranty_row even']")
	private List <WebElement> tableRow;
	@FindBy(xpath="//tr[@role='row']")
	private List<WebElement> tableHead;
	
	
	
	
	public void clickOnFilterIcon() throws IOException  {
		String actualTitle,expectedTitle=ExcelUtility.getTestData(7, 0, constants.Constants.TESTDATAFILE, "OrderReparationsPage");
		Assert.assertTrue(PageUtility.isElementDisplayed(filterResultIcon), "Filter Result + icon Is Not Displayed");
		PageUtility.clickOnElement(filterResultIcon);
		actualTitle=PageUtility.getElementText(filterFirstField);
		Assert.assertEquals(actualTitle, expectedTitle, "Filter Field Is Not Displayed");
		}
	
	public void EnterDetailsInFilter(String listItem,String warrantyListItem) throws IOException, InterruptedException  {
		String actualData,expectedData=ExcelUtility.getTestData(8, 0, constants.Constants.TESTDATAFILE, "OrderReparationsPage");
		Assert.assertTrue(PageUtility.isElementDisplayed(filterEnterDate), "Date Field Is Not Displayed");
		PageUtility.clickOnElement(filterEnterDate);
		List<WebElement>timePeriodList=timePeriodFromDropDown;
		for(WebElement timePeriod:timePeriodList) {
			if(PageUtility.getElementText(timePeriod).equalsIgnoreCase(listItem)){
				Assert.assertTrue(PageUtility.isElementDisplayed(timePeriod), "List Is Not Displayed To Select TimePeriod");
				PageUtility.clickOnElement(timePeriod);
				break;
				}
			}
		Assert.assertTrue(PageUtility.isElementDisplayed(filterMapkaField),"Mapka Field Is Not displayed");
		PageUtility.clickOnElement(filterMapkaField);
		PageUtility.selectDropdownbyText(filterMapkaSelectField, ExcelUtility.getTestData(2, 0, constants.Constants.TESTDATAFILE, "OrderReparationsPage"));
		Assert.assertTrue(PageUtility.isElementDisplayed(filterHasWarrantyField),"Has Warranty Field Is Not Displayed");
		PageUtility.clickOnElement(filterHasWarrantyField);
		List<WebElement>hasWarrantSelect=filterWarrantySelectField;
		for(WebElement selectList:hasWarrantSelect) {
			if(PageUtility.getElementText(selectList).equalsIgnoreCase(warrantyListItem)){
				Assert.assertTrue(PageUtility.isElementDisplayed(selectList),"List Is Not Displayed To Select TimePeriod");
				PageUtility.clickOnElement(selectList);
				break;
				}
			}
		PageUtility.selectDropdownbyText(filterStatusField, ExcelUtility.getTestData(5, 0, constants.Constants.TESTDATAFILE, "OrderReparationsPage"));
		Assert.assertTrue(PageUtility.isElementEnabled(filterResultButton),"Filter Result Button Is Not Enabled");
		PageUtility.click(driver, filterResultButton);
		WaitUtility.waitVisibilityOfAllElementsLocatedBy(driver, tableDataAfterFilter);
		actualData=PageUtility.getElementText(tableDataAfterFilter);
		Assert.assertEquals(actualData, expectedData, "Filtered Data Is Not Displayed");
		}
	
		public void clickOnAddReparationButton() throws IOException {
		String actualTitle,expectedTitle=ExcelUtility.getTestData(10, 0, constants.Constants.TESTDATAFILE, "OrderReparationsPage");
		Assert.assertTrue(PageUtility.isElementEnabled(addReparationButton),"Add Reparation Button Is Not Enabled");
		PageUtility.clickOnElement(addReparationButton);
		WaitUtility.textToBePresentInElement(driver, addReparationPageTitle, expectedTitle);
		actualTitle=PageUtility.getElementText(addReparationPageTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Add Reparation Page Is Not Displayed");
		}
		
		public void clickOnAddReparationWindowCloseButton() throws IOException {
		String actualTitle,expectedTitle=ExcelUtility.getTestData(0, 0, constants.Constants.TESTDATAFILE, "OrderReparationsPage");
		Assert.assertTrue(PageUtility.isElementEnabled(AddReparationWindowCloseButton),"Close Button Is Not Enabled");
		PageUtility.click(driver, AddReparationWindowCloseButton);
		actualTitle=PageUtility.getElementText(addReparationCloseTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "It Is Not Landed Back To Order&Reparation page");
		}
		
		public void clickOnCompletedRepairsTab() throws IOException{
		String actualData,expectedData= ExcelUtility.getTestData(6, 0, constants.Constants.TESTDATAFILE, "OrderReparationsPage");
		Assert.assertTrue(PageUtility.isElementDisplayed(completedRepairsTab), "Completed Repairs Tab Is Not Displayed");
		PageUtility.clickOnElement(completedRepairsTab);
		List<WebElement>option=PageUtility.selectDropdownbyOptions(completedrepairTableShow);
			for(WebElement inputMenu:option) {
				if(PageUtility.getElementText(inputMenu).contains(ExcelUtility.getNumeric(11, 0, constants.Constants.TESTDATAFILE, "OrderReparationsPage"))) {
					PageUtility.clickOnElement(inputMenu);
					break;
					}
				}
			List<WebElement>row=tableRow;
			for(WebElement data:row ) {
				if(PageUtility.getElementText(data).equals(ExcelUtility.getTestData(6, 0, constants.Constants.TESTDATAFILE, "OrderReparationsPage"))) {
					actualData = PageUtility.getElementText(data);
					Assert.assertEquals(actualData, expectedData, "Displayed Data IS Not Correct");
					break;
					}
				}
			}	
		
		public void clickOnPdfButton() throws InterruptedException, IOException {
			Assert.assertTrue(PageUtility.isElementEnabled(pdfDownloadButton), "PDF Download Button Is Not Enabled");
			PageUtility.clickOnElement(pdfDownloadButton);
			String sourceLocation = PageUtility.attribute(pdfDownloadButton, ExcelUtility.getTestData(13, 0, constants.Constants.TESTDATAFILE, "OrderReparationsPage"));
			String wget_command = constants.Constants.DOWNLOADFILE + sourceLocation;
			try {
				Process exec = Runtime.getRuntime().exec(wget_command);
			     int exitVal = exec.waitFor();
			      } catch ( IOException ex) {
			      }
			PageUtility.close(driver);
			}
		
		public void clickOnExcelButton() throws InterruptedException, IOException {
			Assert.assertTrue(PageUtility.isElementEnabled(excelDownloadButton), "Excel Download Button Is Not Enabled");
			PageUtility.clickOnElement(excelDownloadButton);
			String sourceLocation = PageUtility.attribute(excelDownloadButton, ExcelUtility.getTestData(13, 0, constants.Constants.TESTDATAFILE, "OrderReparationsPage"));
			String wget_command = constants.Constants.DOWNLOADFILE + sourceLocation;
			try {
				Process exec = Runtime.getRuntime().exec(wget_command);
				int exitVal = exec.waitFor();
				} catch ( IOException ex) {	
				}
			PageUtility.close(driver);
			}
		
		public void clickOnNextButtonByScrollingDown() throws InterruptedException, IOException {
			String actualData,expectedData=ExcelUtility.getTestData(12, 0, constants.Constants.TESTDATAFILE, "OrderReparationsPage");
			PageUtility.scrollTillTheElementFound(driver, scrollNextButton);
			WaitUtility.fluentVisibilityOfAllElements(driver, scrollNextButton);
			Assert.assertTrue(PageUtility.isElementEnabled(scrollNextButton), "NextButton Is Not Enabled");
			PageUtility.clickOnElement(scrollNextButton);
			List<WebElement>row=tableHead;
			for(WebElement data:row ) {
				if(PageUtility.getElementText(data).equals(ExcelUtility.getTestData(12, 0, constants.Constants.TESTDATAFILE, "OrderReparationsPage"))) {
					actualData =PageUtility.getElementText(data);
					Assert.assertEquals(actualData, expectedData, "Displayed Data IS Not Correct");
					break;
					}
				}
			}
		}
