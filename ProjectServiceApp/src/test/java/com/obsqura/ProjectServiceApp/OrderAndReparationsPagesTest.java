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
	
	
	@Test(priority=6)
	public void verifyClickOnFilterIcon() throws IOException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnreparationMoreInfo();
		orderAndReparationsPagesObj=new OrderAndReparationsPages(driver);
		orderAndReparationsPagesObj.clickOnFilterIcon();
	}
	@Test(priority=7)
	public void verifyEnterDetailsInFilter() throws IOException, InterruptedException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnreparationMoreInfo();
		orderAndReparationsPagesObj=new OrderAndReparationsPages(driver);
		orderAndReparationsPagesObj.clickOnFilterIcon();
		orderAndReparationsPagesObj.EnterDetailsInFilter(ExcelUtility.getTestData(9, 0, constants.Constants.TESTDATAFILE, "OrderReparationsPage"),ExcelUtility.getTestData(3, 0, constants.Constants.TESTDATAFILE, "OrderReparationsPage"));
	}
	@Test(priority=4)
	public void verifyClickOnAddReparationButton() throws IOException {
	loginPageObj=new LoginPage(driver);
	loginPageObj.loginWithValidUserNameAndPassword();
	homePageObj=new HomePage(driver);
	homePageObj.clickOnreparationMoreInfo();
	orderAndReparationsPagesObj=new OrderAndReparationsPages(driver);
	orderAndReparationsPagesObj.clickOnAddReparationButton();
	}
	@Test(priority=5)
	public void verifyClickOnAddReparationWindowCloseButton() throws IOException {
	loginPageObj=new LoginPage(driver);
	loginPageObj.loginWithValidUserNameAndPassword();
	homePageObj=new HomePage(driver);
	homePageObj.clickOnreparationMoreInfo();
	orderAndReparationsPagesObj=new OrderAndReparationsPages(driver);
	orderAndReparationsPagesObj.clickOnAddReparationButton();
	orderAndReparationsPagesObj.clickOnAddReparationWindowCloseButton();
	}
	@Test(priority=2)
	public void verifyClickOnCompletedRepairsTab() throws IOException {
	loginPageObj=new LoginPage(driver);
	loginPageObj.loginWithValidUserNameAndPassword();
	homePageObj=new HomePage(driver);
	homePageObj.clickOnreparationMoreInfo();
	orderAndReparationsPagesObj=new OrderAndReparationsPages(driver);
	orderAndReparationsPagesObj.clickOnCompletedRepairsTab();
	}
	@Test(priority=3)
	public void verifyClickOnPdfButton() throws IOException, InterruptedException{
	loginPageObj=new LoginPage(driver);
	loginPageObj.loginWithValidUserNameAndPassword();
	homePageObj=new HomePage(driver);
	homePageObj.clickOnreparationMoreInfo();
	orderAndReparationsPagesObj=new OrderAndReparationsPages(driver);
	orderAndReparationsPagesObj.clickOnPdfButton();
	}
	@Test(priority=1)
	public void verifyClickOnExcelButton() throws IOException, InterruptedException{
	loginPageObj=new LoginPage(driver);
	loginPageObj.loginWithValidUserNameAndPassword();
	homePageObj=new HomePage(driver);
	homePageObj.clickOnreparationMoreInfo();
	orderAndReparationsPagesObj=new OrderAndReparationsPages(driver);
	orderAndReparationsPagesObj.clickOnExcelButton();
	}
	@Test(priority=0)
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
