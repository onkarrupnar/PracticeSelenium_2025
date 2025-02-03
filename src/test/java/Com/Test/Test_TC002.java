package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.PageObject.SignUpPage;
import Com.Utility.BaseClass;

public class Test_TC002 extends BaseClass{

	@Test
	
	public void VerifySignIn() {
		
		SignUpPage SignIn = PageFactory.initElements(driver,SignUpPage.class);
		SignIn.getCreateNewAccButton().click();
		SignIn.getFirstnameTextBox().sendKeys(excel.GetStringData("Sheet1", 1, 1));
		SignIn.getLastnameTextBox().sendKeys(excel.GetStringData("Sheet1", 2, 1));
		SignIn.getMoborEmailTextBox().sendKeys(excel.GetStringData("Sheet1", 3, 1));
		SignIn.getPasswordTextBox().sendKeys(excel.GetStringData("Sheet1", 4, 1));
		
	}
}

