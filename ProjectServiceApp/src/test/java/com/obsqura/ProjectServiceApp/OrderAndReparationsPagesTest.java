package com.obsqura.ProjectServiceApp;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.ProjectServiceAppTest.Base;

import pages.HomePage;
import pages.LoginPage;
import pages.OrderAndReparationsPages;
import utilities.ExcelUtility;

public class OrderAndReparationsPagesTest extends Base{
	LoginPage loginPageObj;
	HomePage homePageObj;
	OrderAndReparationsPages orderAndReparationsPagesObj;
	
	
	@Test(description="Click On Filter Icon",groups= {"SmokeTest"},priority=7)
	public void verifyClickOnFilterIcon() throws IOException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnreparationMoreInfo();
		orderAndReparationsPagesObj=new OrderAndReparationsPages(driver);
		orderAndReparationsPagesObj.clickOnFilterIcon();
	}
	@Test(description="Enter Data In Filter Fields",groups= {"RegressionTest"},priority=6)
	public void verifyEnterDetailsInFilter() throws IOException, InterruptedException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnreparationMoreInfo();
		orderAndReparationsPagesObj=new OrderAndReparationsPages(driver);
		orderAndReparationsPagesObj.clickOnFilterIcon();
		orderAndReparationsPagesObj.EnterDetailsInFilter(ExcelUtility.getTestData(9, 0, constants.Constants.TESTDATAFILE, "OrderReparationsPage"),ExcelUtility.getTestData(3, 0, constants.Constants.TESTDATAFILE, "OrderReparationsPage"));
	}
	@Test(description="Click On Add Reparation Button",groups= {"SmokeTest"},priority=5)
	public void verifyClickOnAddReparationButton() throws IOException {
	loginPageObj=new LoginPage(driver);
	loginPageObj.loginWithValidUserNameAndPassword();
	homePageObj=new HomePage(driver);
	homePageObj.clickOnreparationMoreInfo();
	orderAndReparationsPagesObj=new OrderAndReparationsPages(driver);
	orderAndReparationsPagesObj.clickOnAddReparationButton();
	}
	@Test(description="Click On Add Reparation Window CloseButton",groups= {"RegressionTest"},priority=4)
	public void verifyClickOnAddReparationWindowCloseButton() throws IOException {
	loginPageObj=new LoginPage(driver);
	loginPageObj.loginWithValidUserNameAndPassword();
	homePageObj=new HomePage(driver);
	homePageObj.clickOnreparationMoreInfo();
	orderAndReparationsPagesObj=new OrderAndReparationsPages(driver);
	orderAndReparationsPagesObj.clickOnAddReparationButton();
	orderAndReparationsPagesObj.clickOnAddReparationWindowCloseButton();
	}
	@Test(description="Click On Completed Repairs Tab",groups= {"SmokeTest"},priority=3)
	public void verifyClickOnCompletedRepairsTab() throws IOException {
	loginPageObj=new LoginPage(driver);
	loginPageObj.loginWithValidUserNameAndPassword();
	homePageObj=new HomePage(driver);
	homePageObj.clickOnreparationMoreInfo();
	orderAndReparationsPagesObj=new OrderAndReparationsPages(driver);
	orderAndReparationsPagesObj.clickOnCompletedRepairsTab();
	}
	@Test(description="Click On Pdf Button",groups= {"RegressionTest"},priority=2)
	public void verifyClickOnPdfButton() throws IOException, InterruptedException{
	loginPageObj=new LoginPage(driver);
	loginPageObj.loginWithValidUserNameAndPassword();
	homePageObj=new HomePage(driver);
	homePageObj.clickOnreparationMoreInfo();
	orderAndReparationsPagesObj=new OrderAndReparationsPages(driver);
	orderAndReparationsPagesObj.clickOnPdfButton();
	}
	@Test(description="Click On Excel Button",groups= {"SmokeTest"},priority=1)
	public void verifyClickOnExcelButton() throws IOException, InterruptedException{
	loginPageObj=new LoginPage(driver);
	loginPageObj.loginWithValidUserNameAndPassword();
	homePageObj=new HomePage(driver);
	homePageObj.clickOnreparationMoreInfo();
	orderAndReparationsPagesObj=new OrderAndReparationsPages(driver);
	orderAndReparationsPagesObj.clickOnExcelButton();
	}
	@Test(description="Scroll Down Click On Next Button",groups= {"RegressionTest"},priority=0)
	public void verifyClickOnNextButtonByScrollingDown() throws IOException, InterruptedException{
	loginPageObj=new LoginPage(driver);
	loginPageObj.loginWithValidUserNameAndPassword();
	homePageObj=new HomePage(driver);
	homePageObj.clickOnreparationMoreInfo();
	orderAndReparationsPagesObj=new OrderAndReparationsPages(driver);
	orderAndReparationsPagesObj.clickOnCompletedRepairsTab();
	orderAndReparationsPagesObj.clickOnNextButtonByScrollingDown();
	}
	
	
	

}
