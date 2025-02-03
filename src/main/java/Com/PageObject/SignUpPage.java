package Com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPage {

	@FindBy(how=How.XPATH,using="//a[contains(@id,'u_0_0')]")
	private WebElement CreateNewAccButton;
	
	@FindBy(how=How.XPATH,using="//input[@name='firstname']")
	private WebElement FirstnameTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@name='lastname']")
	private WebElement LastnameTextBox;
	
	@FindBy(how=How.XPATH,using="//select[@name='birthday_day']")
	private WebElement DateDrpdwn;
	
	@FindBy(how=How.XPATH,using="//select[@name='birthday_month']")
	private WebElement MonthDrpdwn;
	
	@FindBy(how=How.XPATH,using="//select[@name='birthday_year']")
	private WebElement YearDrpdwn;
	
	@FindBy(how=How.XPATH,using="(//input[@name='sex'])[2]")
	private WebElement GenderRadioButton;
	
	@FindBy(how=How.XPATH,using="//input[@name='reg_email__']")
	private WebElement MoborEmailTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@name='reg_passwd__']")
	private WebElement PasswordTextBox;
	
	@FindBy(how=How.XPATH,using="//*[text()='Messenger']")
	private WebElement MessengerText;
	
	

	public WebElement getCreateNewAccButton() {
		return CreateNewAccButton;
	}

	public WebElement getMessengerText() {
		return MessengerText;
	}

	public WebElement getFirstnameTextBox() {
		return FirstnameTextBox;
	}

	public WebElement getLastnameTextBox() {
		return LastnameTextBox;
	}

	public WebElement getDateDrpdwn() {
		return DateDrpdwn;
	}

	public WebElement getMonthDrpdwn() {
		return MonthDrpdwn;
	}

	public WebElement getYearDrpdwn() {
		return YearDrpdwn;
	}

	public WebElement getGenderRadioButton() {
		return GenderRadioButton;
	}

	public WebElement getMoborEmailTextBox() {
		return MoborEmailTextBox;
	}

	public WebElement getPasswordTextBox() {
		return PasswordTextBox;
	}
	
	
	
}
