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
	
	@Test(groups= {"SmokeTest"})
	public void verifyClickOnreparationMoreInfo() throws IOException {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnreparationMoreInfo();
	}
	@Test(groups= {"RegressionTest"})
	public void verifyClickOnClientMoreInfo() throws IOException {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnClientMoreInfo();
	}
	@Test(groups= {"SmokeTest"})
	public void verifyClickOnInventoryProductsMoreInfo() throws IOException {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnInventoryProductsMoreInfo();
	}
	@Test(groups= {"SmokeTest"})
	public void verifyClickOnUserIconSignOut() throws IOException {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnUserIconSignOut();
	}
	@Test(groups= {"RegressionTest"})
	public void verifyClickOnPlusIcon() throws IOException {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnPlusIcon();
	}
	@Test(groups= {"SmokeTest"})
	public void verifyClickOnSendSMS() throws IOException  {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnPlusIcon();
		homePageObj.clickOnSendSMS(ExcelUtility.getTestData(3, 0, constants.Constants.TESTDATAFILE, "HomePage"));
	}
	@Test(groups= {"SmokeTest"})
	public void verifyclickOnSendEmail() throws IOException  {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnPlusIcon();
		homePageObj.clickOnSendEmail(ExcelUtility.getTestData(4, 0, constants.Constants.TESTDATAFILE, "HomePage"));
	}
	@Test(groups= {"RegressionTest"})
	public void verifyclickOnAddReparation() throws IOException  {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnPlusIcon();
		homePageObj.clickOnAddReparation(ExcelUtility.getTestData(5, 0, constants.Constants.TESTDATAFILE, "HomePage"));
	}
}
