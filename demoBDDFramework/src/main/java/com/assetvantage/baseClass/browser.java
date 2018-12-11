package com.assetvantage.baseClass;

import java.util.Properties;

import com.assetvantage.commonUtils.Log;
import com.assetvantage.commonUtils.getProperty;
import com.assetvantage.interfaces.InterfaceAsaService;

public class browser extends browserConfig {
	public static Properties prop;

	InterfaceAsaService log = new Log();

	public browser() {

	}

	public void openBrowserandNavigate() throws Exception {
		try {

			browserConfig.startBrowser(browserConfig.getBrowserName());
			driver.get(getProperty.readmyFile("url"));

			log.info("URL is Presented");

			// driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

			log.info("Browser is MAXIMIZED");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void teardown() {
		if (driver != null) {
			driver.quit();
			log.info("Browser Closed");
		}

	}
}