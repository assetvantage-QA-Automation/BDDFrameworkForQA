package com.assetvantage.baseClass;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

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
			String exePath = "D:\\WebDrivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			String exePath = "D:\\WebDrivers\\geckodriver.exe";
			System.setProperty("webdriver.firefox.marionette", exePath);
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			String exePath = "D:\\WebDrivers\\MicrosoftWebDriver.exe";
			System.setProperty("webdriver.edge.driver", exePath);
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("opera")) {
			String exePath = "D:\\WebDrivers\\operadriver.exe";
			System.setProperty("webdriver.opera.driver", exePath);
			driver = new OperaDriver();
		}
	}
	
}
