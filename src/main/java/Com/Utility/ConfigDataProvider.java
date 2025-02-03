package Com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {

	public static Properties prop;

	public ConfigDataProvider() throws Throwable {

		String location = "D:\\Practice_Selenium2024\\PracticalSelenium_Framework3\\Config\\Config.Properties";

		FileInputStream file = new FileInputStream(location);
		prop = new Properties();
		prop.load(file);

	}

	public String GetBaseUrl() {

		return prop.getProperty("BaseUrl");
	}
}
