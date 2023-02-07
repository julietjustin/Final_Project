package com.obsqura.ProjectServiceApp;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.obsqura.ProjectServiceAppTest.Base;

import pages.CustomersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class CustomersPageTest extends Base{
	LoginPage loginPageObj;
	HomePage homePageObj;
	CustomersPage customersPageObj;
	
	
	@Test(description="ADD CLIENT BUTTON",groups= {"SmokeTest"},priority=10)
	public void verifyClickOnAddClientButton() throws IOException {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnClientMoreInfo();
		customersPageObj=new CustomersPage(driver);
		customersPageObj.clickOnAddClientButton();
	}
	@Test(description="GO BACK BUTTON",groups= {"RegressionTest"},priority=9)
	public void verifyClickOnGoBackButtonAddClientWindow() throws IOException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnClientMoreInfo();
		customersPageObj=new CustomersPage(driver);
		customersPageObj.clickOnAddClientButton();
		customersPageObj.clickOnGoBackButtonAddClientWindow();	
	}
	@Test(description="ENTER DATA ON ADD CLIENT PAGE",groups= {"SmokeTest"},priority=8)
	@Parameters({ "user","company","geoLocate","address","city","postalCode","telephone","email","vat","ssn","comment"})
	public void verifyEnterDetailsOnAddClientWindow(String user,String company,String geoLocate,String address,String city,String postalCode,String telephone,String email,String vat,String ssn,String comment) throws IOException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnClientMoreInfo();
		customersPageObj=new CustomersPage(driver);
		customersPageObj.clickOnAddClientButton();
		customersPageObj.enterDetailsOnAddClientWindow(user,company,geoLocate,address,city,postalCode,telephone,email,vat,ssn,comment);	
	}
	@Test(description="ACTION BUTTON CUSTOMER PAGE",groups= {"RegressionTest"},priority=7)
	public void verifyClickOnActionButtonCustomerPage() throws IOException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnClientMoreInfo();
		customersPageObj=new CustomersPage(driver);
		customersPageObj.clickOnActionButtonCustomerPage();	
		}
	@Test(description="ACTION BUTTON IN THE TABLE",groups= {"SmokeTest"},priority=6)
	public void verifyclickOnActionButtonInTable() throws IOException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnClientMoreInfo();
		customersPageObj=new CustomersPage(driver);
		customersPageObj.clickOnActionButtonInTable();
		}
	@Test(description="VIEW CLIENT OPTION FROM TABLE DROPDOWN",groups= {"RegressionTest"},priority=5)
	public void verifyClickOnViewClientOptionFromDropdown() throws IOException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnClientMoreInfo();
		customersPageObj=new CustomersPage(driver);
		customersPageObj.clickOnActionButtonInTable();
		customersPageObj.clickOnViewClientOptionFromDropdown(ExcelUtility.getTestData(9, 0, constants.Constants.TESTDATAFILE, "CustomerPage"));
		}
	@Test(description="EDIT CLIENT DATA IN EDIT CLIENT PAGE",groups= {"SmokeTest"},priority=4)
	@Parameters({ "geoLocate","address"})
	public void verifyEditClientData(String geoLocate,String address) throws IOException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnClientMoreInfo();
		customersPageObj=new CustomersPage(driver);
		customersPageObj.clickOnActionButtonInTable();
		customersPageObj.editClientData(geoLocate, address,ExcelUtility.getTestData(10, 0, constants.Constants.TESTDATAFILE, "CustomerPage"));
		}
	@Test(description="EDIT CLIENT OPTION FROM TABLE DROPDOWN",groups= {"RegressionTest"},priority=3)
		public void VerifyClickOnEditClientOptionFromDropdown() throws IOException{
			loginPageObj=new LoginPage(driver);
			loginPageObj.loginWithValidUserNameAndPassword();
			homePageObj=new HomePage(driver);
			homePageObj.clickOnClientMoreInfo();
			customersPageObj=new CustomersPage(driver);
			customersPageObj.clickOnActionButtonInTable();
			customersPageObj.clickOnEditClientOptionFromDropdown(ExcelUtility.getTestData(10, 0, constants.Constants.TESTDATAFILE, "CustomerPage"));
			
			}
	@Test(description="DELETE CLIENT OPTION FROM TABLE DROPDOWN",groups= {"SmokeTest"},priority=2)
	public void verifyClickOnDeleteClientOptionFromDropdown() throws IOException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnClientMoreInfo();
		customersPageObj=new CustomersPage(driver);
		customersPageObj.clickOnActionButtonInTable();
		customersPageObj.clickOnDeleteClientOptionFromDropdown(ExcelUtility.getTestData(11, 0, constants.Constants.TESTDATAFILE, "CustomerPage"));
		}
	@Test(description="CONFIRM BUTTON IN DELETE WINDOW",groups= {"RegressionTest"},priority=1)
	public void verifyClickOnConfirmButtonInDelete() throws IOException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
 		homePageObj=new HomePage(driver);
		homePageObj.clickOnClientMoreInfo();
		customersPageObj=new CustomersPage(driver);
		customersPageObj.clickOnActionButtonInTable();
		customersPageObj.clickOnConfirmButtonInDelete(ExcelUtility.getTestData(11, 0, constants.Constants.TESTDATAFILE, "CustomerPage"));
		}
	@Test(description="ENTER DATA IN SEARCH FIELD OF CUSTOMER PAGE",groups= {"SmokeTest"},priority=0)
	public void verifyEnterDataInSearchField() throws IOException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnClientMoreInfo();
		customersPageObj=new CustomersPage(driver);
		customersPageObj.enterDataInSearchField();
		}


}
