package com.assetvantage.baseClass;

import java.util.Properties;

import com.assetvantage.commonUtils.Log;
import com.assetvantage.commonUtils.getProperty;
import com.assetvantage.interfaces.InterfaceAsaService;

public class browser extends browserConfig {
	public static Properties prop;

	static InterfaceAsaService log = new Log();

	public browser() {

	}

	public void openBrowserandNavigate() throws Exception {
		try {

			log.info("Browsers are configurable, for checking purposes Selection is skipped. //browserConfig.getBrowserName()");
			browserConfig.startBrowser("chrome");
			driver.get(getProperty.readmyFile("url"));

			log.info("URL is Presented");

			// driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

			log.info("Browser is MAXIMIZED");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void teardown() {
		if (driver != null) {
			driver.quit();
			log.info("Browser Closed");
		}

	}
}
