package com.obsqura.ProjectServiceApp;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.ProjectServiceAppTest.Base;

import pages.LoginPageWithDataProvider;


public class LoginPageWithDataProviderTest extends Base {
LoginPageWithDataProvider LoginPageWithDataProviderObj;
	
	
	@Test(description="Check Login Page Fields With Valid And Invalid Data",groups= {"SmokeTest","RegressionTest"},priority=0,dataProvider="LoginPage",dataProviderClass=com.obsqura.dataProvider.DataProviderUtility.class)
	public void verifyLoginWithValidUserNameAndPassword(String userName,String password) throws IOException{
		LoginPageWithDataProviderObj=new LoginPageWithDataProvider(driver);
		LoginPageWithDataProviderObj.loginWithValidUserNameAndPassword(userName,password);
	}

}
