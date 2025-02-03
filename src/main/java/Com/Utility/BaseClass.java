package Com.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static ConfigDataProvider config;
	public static ExcelDataProvider excel;
	
	@BeforeSuite
	
	public void SetData() throws Throwable {
		
		config = new ConfigDataProvider();
		excel = new ExcelDataProvider();	
	}
	
	@BeforeMethod
	
	public void Setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(config.GetBaseUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
	}
	
	@AfterMethod
	
	public void TearDown() throws Throwable {
		
		Thread.sleep(7000);
		driver.close();
		
		
	}
	
}
