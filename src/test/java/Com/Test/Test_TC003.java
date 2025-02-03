package Com.Test;

import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.PageObject.SignUpPage;
import Com.Utility.BaseClass;
import Com.Utility.Library;

public class Test_TC003 extends BaseClass{

	@Test
	
	public void VerifySignIn() {
		
		SignUpPage SignIn = PageFactory.initElements(driver,SignUpPage.class);
        Library.CustomClick(SignIn.getCreateNewAccButton());
        Library.CustomSendkeys(SignIn.getFirstnameTextBox(), excel.GetStringData("Sheet1", 1, 1));
        Library.CustomSendkeys(SignIn.getLastnameTextBox(), excel.GetStringData("Sheet1", 2, 1));
        Library.HandleDropdown(SignIn.getDateDrpdwn(),excel.GetStringData("Sheet1", 5, 1));
        Library.HandleDropdown(SignIn.getMonthDrpdwn(), excel.GetStringData("Sheet1", 6, 1));
        Library.HandleDropdown(SignIn.getYearDrpdwn(), excel.GetStringData("Sheet1", 7, 1));
        Library.CustomClick(SignIn.getGenderRadioButton());
		Library.CustomSendkeys(SignIn.getMoborEmailTextBox(), excel.GetStringData("Sheet1", 3, 1));
		Library.CustomSendkeys(SignIn.getPasswordTextBox(), excel.GetStringData("Sheet1", 4, 1));
        
		Library.GetImplicitWait(driver,Duration.ofMillis(5000), SignIn.getMessengerText());
     
		Library.HandlePageScrolling(driver);
		
	}
}

