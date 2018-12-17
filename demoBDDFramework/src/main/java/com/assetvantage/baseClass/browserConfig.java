package com.assetvantage.baseClass;

import java.util.Scanner;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.CapabilityType;

public class browserConfig {
	public static WebDriver driver;

	public static String getBrowserName() {
		Scanner browserName = new Scanner(System.in);
		System.out.println("Select Browser : ");
		String br = browserName.nextLine();
		browserName.close();
		return br;
	}
	
	static void startBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			String exePath = "../demoBDDFramework/src/main/java/com/assetvantage/browserDriver/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			ChromeOptions caps = new ChromeOptions();
			LoggingPreferences logPrefs = new LoggingPreferences();
			logPrefs.enable(LogType.PERFORMANCE, Level.INFO);
			caps.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
			driver = new ChromeDriver(caps);
		} else if (browserName.equalsIgnoreCase("firefox")) {
			String exePath = "../demoBDDFramework/src/main/java/com/assetvantage/browserDriver/geckodriver.exe";
			System.setProperty("webdriver.firefox.marionette", exePath);
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			String exePath = "../demoBDDFramework/src/main/java/com/assetvantage/browserDriver/MicrosoftWebDriver.exe";
			System.setProperty("webdriver.edge.driver", exePath);
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("opera")) {
			String exePath = "../demoBDDFramework/src/main/java/com/assetvantage/browserDriver/operadriver.exe";
			System.setProperty("webdriver.opera.driver", exePath);
			driver = new OperaDriver();
		}
	}

}
