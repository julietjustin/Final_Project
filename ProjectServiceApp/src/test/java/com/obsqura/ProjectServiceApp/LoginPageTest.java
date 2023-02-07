package com.obsqura.ProjectServiceApp;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.ProjectServiceAppTest.Base;

import pages.LoginPage;

public class LoginPageTest extends Base{
	LoginPage loginPageObj;
	
	
	@Test(description="Login With Valid UserName And Password",groups= {"SmokeTest"},priority=0)
	public void verifyLoginWithValidUserNameAndPassword() throws IOException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithValidUserNameAndPassword();
	}
	@Test(description="Login With InValid UserName And Password",groups= {"RegressionTest"},priority=0)
	public void verifyLoginWithInValidUserNameAndPassword() throws IOException, InterruptedException{
		loginPageObj=new LoginPage(driver);
		loginPageObj.loginWithInValidUserNameAndPassword();
	}

}
