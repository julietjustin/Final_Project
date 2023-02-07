package com.obsqura.ProjectServiceApp;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.ProjectServiceAppTest.Base;

import pages.HomePage;
import pages.InventoryPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class InventoryPageTest extends Base{
	LoginPage loginPageObj;
	HomePage homePageObj;
	InventoryPage inventoryPageObj;
	
	@Test(description="Click On Show Button",groups= {"SmokeTest"},priority=0)
	public void verifyClickOnShow() throws IOException {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnInventoryProductsMoreInfo();
		inventoryPageObj=new InventoryPage(driver);
		inventoryPageObj.clickShow();
	}
	@Test(description="Click On Image From The Table",groups= {"RegressionTest"},priority=0)
	public void verifyClickOnImage() throws IOException {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnInventoryProductsMoreInfo();
		inventoryPageObj=new InventoryPage(driver);
		inventoryPageObj.clickOnImage();
	}
}
