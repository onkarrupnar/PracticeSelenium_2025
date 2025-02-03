package Com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {

	
	public static ExtentReports GetReport() {
		
		String location = "D:\\Practice_Selenium2024\\PracticalSelenium_Framework3\\Reports";
		ExtentSparkReporter reporter = new ExtentSparkReporter(location);
		reporter.config().setDocumentTitle("Automation test");
		reporter.config().setReportName("Verify function");
		reporter.config().setTheme(Theme.DARK);
		
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project name", "Test");
		extent.setSystemInfo("Tool", "Selenium");
		extent.setSystemInfo("O.S", "Windows");
		extent.setSystemInfo("QA", "Onkar Rupnar");
		return extent;
		
		
	}
}
