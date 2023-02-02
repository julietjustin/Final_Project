package com.obsqura.ProjectServiceApp;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.ProjectServiceAppTest.Base;

import pages.LoginPage;

public class LoginPageTest extends Base{
	LoginPage loginPageObj;
	
	
	@Test
	public void verifyLoginWithValidUserNameAndPassword() throws IOException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
	}
	@Test
	public void verifyLoginWithInValidUserNameAndPassword() throws IOException, InterruptedException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithInValidUserNameAndPassword();
	}

}
