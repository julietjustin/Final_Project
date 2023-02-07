package com.obsqura.ProjectServiceApp;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.ProjectServiceAppTest.Base;

import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomePageTest extends Base{
	LoginPage loginPageObj;
	HomePage homePageObj;
	
	@Test(description="Click On Reparation MoreInfo",groups= {"SmokeTest"},priority=7)
	public void verifyClickOnreparationMoreInfo() throws IOException {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnreparationMoreInfo();
	}
	@Test(description="Click On Client MoreInfo",groups= {"RegressionTest"},priority=6)
	public void verifyClickOnClientMoreInfo() throws IOException {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnClientMoreInfo();
	}
	@Test(description="Click On Client Inventory Products MoreInfo",groups= {"SmokeTest"},priority=5)
	public void verifyClickOnInventoryProductsMoreInfo() throws IOException {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnInventoryProductsMoreInfo();
	}
	@Test(description="Click On User Icon SignOut",groups= {"RegressionTest"},priority=4)
	public void verifyClickOnUserIconSignOut() throws IOException {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnUserIconSignOut();
	}
	@Test(description="Click On Plus Icon HomePage",groups= {"SmokeTest"},priority=3)
	public void verifyClickOnPlusIcon() throws IOException {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnPlusIcon();
	}
	@Test(description="Click On Send SMS From Plus Icon DropDown",groups= {"RegressionTest"},priority=2)
	public void verifyClickOnSendSMS() throws IOException  {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnPlusIcon();
		homePageObj.clickOnSendSMS(ExcelUtility.getTestData(3, 0, constants.Constants.TESTDATAFILE, "HomePage"));
	}
	@Test(description="Click On Send Email From Plus Icon DropDown",groups= {"SmokeTest"},priority=1)
	public void verifyclickOnSendEmail() throws IOException  {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnPlusIcon();
		homePageObj.clickOnSendEmail(ExcelUtility.getTestData(4, 0, constants.Constants.TESTDATAFILE, "HomePage"));
	}
	@Test(description="Click On Add Reparation From Plus Icon DropDown",groups= {"RegressionTest"},priority=0)
	public void verifyclickOnAddReparation() throws IOException  {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnPlusIcon();
		homePageObj.clickOnAddReparation(ExcelUtility.getTestData(5, 0, constants.Constants.TESTDATAFILE, "HomePage"));
	}
}
