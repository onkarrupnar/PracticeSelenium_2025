package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.PageObject.SignUpPage;
import Com.Utility.BaseClass;

public class Test_TC001 extends BaseClass{

	@Test
	
	public void VerifySignIn() {
		
		SignUpPage SignIn = PageFactory.initElements(driver,SignUpPage.class);
		SignIn.getCreateNewAccButton().click();
		SignIn.getFirstnameTextBox().sendKeys("aujsjsj");
		SignIn.getLastnameTextBox().sendKeys("jjsjjs");
		SignIn.getMoborEmailTextBox().sendKeys("abc@jjaja");
		SignIn.getPasswordTextBox().sendKeys("sssss");
		
	}
}

