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
	
	
	@Test(description="Customer Page Test")
	public void verifyClickOnAddClientButton() throws IOException {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnClientMoreInfo();
		customersPageObj=new CustomersPage(driver);
		customersPageObj.clickOnAddClientButton();
	}
	@Test
	public void verifyClickOnGoBackButtonAddClientWindow() throws IOException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnClientMoreInfo();
		customersPageObj=new CustomersPage(driver);
		customersPageObj.clickOnAddClientButton();
		customersPageObj.clickOnGoBackButtonAddClientWindow();	
	}
	@Test
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
	@Test
	public void verifyClickOnActionButtonCustomerPage() throws IOException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnClientMoreInfo();
		customersPageObj=new CustomersPage(driver);
		customersPageObj.clickOnActionButtonCustomerPage();	
		}
	@Test
	public void verifyclickOnActionButtonInTable() throws IOException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnClientMoreInfo();
		customersPageObj=new CustomersPage(driver);
		customersPageObj.clickOnActionButtonInTable();
		}
	@Test
	public void verifyClickOnViewClientOptionFromDropdown() throws IOException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnClientMoreInfo();
		customersPageObj=new CustomersPage(driver);
		customersPageObj.clickOnActionButtonInTable();
		customersPageObj.clickOnViewClientOptionFromDropdown(ExcelUtility.getTestData(9, 0, constants.Constants.TESTDATAFILE, "CustomerPage"));
		}
	@Test
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
	@Test
		public void VerifyClickOnEditClientOptionFromDropdown() throws IOException{
			loginPageObj=new LoginPage(driver);
			loginPageObj.loginWithValidUserNameAndPassword();
			homePageObj=new HomePage(driver);
			homePageObj.clickOnClientMoreInfo();
			customersPageObj=new CustomersPage(driver);
			customersPageObj.clickOnActionButtonInTable();
			customersPageObj.clickOnEditClientOptionFromDropdown(ExcelUtility.getTestData(10, 0, constants.Constants.TESTDATAFILE, "CustomerPage"));
			
			}
	@Test
	public void verifyClickOnDeleteClientOptionFromDropdown() throws IOException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnClientMoreInfo();
		customersPageObj=new CustomersPage(driver);
		customersPageObj.clickOnActionButtonInTable();
		customersPageObj.clickOnDeleteClientOptionFromDropdown(ExcelUtility.getTestData(11, 0, constants.Constants.TESTDATAFILE, "CustomerPage"));
		}
	@Test
	public void verifyClickOnConfirmButtonInDelete() throws IOException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
 		homePageObj=new HomePage(driver);
		homePageObj.clickOnClientMoreInfo();
		customersPageObj=new CustomersPage(driver);
		customersPageObj.clickOnActionButtonInTable();
		customersPageObj.clickOnConfirmButtonInDelete(ExcelUtility.getTestData(11, 0, constants.Constants.TESTDATAFILE, "CustomerPage"));
		}
	@Test
	public void verifyEnterDataInSearchField() throws IOException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnClientMoreInfo();
		customersPageObj=new CustomersPage(driver);
		customersPageObj.enterDataInSearchField();
		}


}
