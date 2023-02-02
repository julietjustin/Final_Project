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
	
	@Test
	public void verifyClickOnShow() throws IOException {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnInventoryProductsMoreInfo();
		inventoryPageObj=new InventoryPage(driver);
		inventoryPageObj.clickShow();
	}
	@Test
	public void verifyClickOnImage() throws IOException {
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
		homePageObj=new HomePage(driver);
		homePageObj.clickOnInventoryProductsMoreInfo();
		inventoryPageObj=new InventoryPage(driver);
		inventoryPageObj.clickOnImage();
	}
}
