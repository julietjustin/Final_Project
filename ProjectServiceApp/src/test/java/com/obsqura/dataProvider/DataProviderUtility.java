package com.obsqura.dataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class DataProviderUtility {
	
	public static void sendKeyValue(WebDriver driver,WebElement element,String inputString) {
		element.sendKeys(inputString);
		}
	
	@DataProvider(name="LoginPage")
	public static Object[][] getDataFromDataprovider(){
		return new Object[][]
				{
			{"admin@admin.com","password"}
			};
			}
	}
