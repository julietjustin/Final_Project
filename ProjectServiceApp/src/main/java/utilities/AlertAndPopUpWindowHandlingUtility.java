package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertAndPopUpWindowHandlingUtility {
	
	public static void acceptAlert(WebDriver driver,WebElement element) {
		element.click();
		driver.switchTo().alert().accept();
		}
	public static void acceptAndWaitAlert(WebDriver driver,WebElement element) {
		element.click();
		WaitUtility.alertPresent(driver);
		driver.switchTo().alert().accept();
		}
	public static void cancelAlert(WebDriver driver,WebElement element) {
		element.click();
		driver.switchTo().alert().dismiss();
		}
	public static String getTextOfAlert(WebDriver driver,WebElement element) {
		element.click();
		String text=driver.switchTo().alert().getText();
		return text;
		}
	public static void sendKeyForAlert(WebDriver driver,WebElement element,String input) {
		element.click();
		driver.switchTo().alert().sendKeys(input);
		driver.switchTo().alert().accept();
		}
	}
