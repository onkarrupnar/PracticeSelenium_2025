package Com.Utility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {

	public static ExtentTest test;
	
	public static void CustomSendkeys(WebElement element, String value) {

		try {
			
		element.sendKeys(value);
		test.log(Status.PASS, "Value send successfully");
		
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

	public static void CustomClick(WebElement element) {
		
		try {
			
			element.click();
			test.log(Status.PASS, "element clicked successfully");
			
			}
			catch(Exception e) {
				
				System.out.println(e.getMessage());
			}

	}

	public static void HandleDropdown(WebElement element, String value) {

		try {
			
			Select select = new Select(element);

			List<WebElement> list = select.getOptions();
			int a = list.size();

			for (int i = 0; i < a; i++) {

				if (list.get(i).getText().equals(value)) {
					list.get(i).click();
					break;
				}
			}
			
			test.log(Status.PASS, "value passed successfully");
			}
		
			catch(Exception e) {
				
				System.out.println(e.getMessage());
			}

		
		
	}

	public static void HandlePageScrolling(WebDriver driver) {

		try {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			// js.executeScript("arguments[0].scrollIntoView", element);

			js.executeScript("window.scrollBy(0,5000)", " ");
			
			}
			catch(Exception e) {
				
				System.out.println(e.getMessage());
			}
		test.log(Status.PASS, "Scrolled successfully");
	}

	public static void GetImplicitWait(WebDriver driver, Duration time, WebElement element) {

		try {
			
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.visibilityOf(element));
			
			test.log(Status.PASS, "element found successfully");
			}
			catch(Exception e) {
				
				System.out.println(e.getMessage());
			}


	}

}
