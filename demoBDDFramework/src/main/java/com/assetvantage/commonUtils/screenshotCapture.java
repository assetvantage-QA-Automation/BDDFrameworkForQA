package com.assetvantage.commonUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.assetvantage.baseClass.browser;
import com.assetvantage.interfaces.screenShotInterface;

public class screenshotCapture extends browser implements screenShotInterface {

	public void takeScreenShotofCurrentpage() throws IOException {
		// final File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(
					"C:\\Users\\partha.das\\git\\BDDFrameworkForQA\\demoBDDFramework\\screenShots\\" + System.currentTimeMillis() + ".png"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		System.out.println("ScreenShot is Captured");

	}

	public void startTestCase(String sTestCaseName) {
		// TODO Auto-generated method stub

	}

	public void endTestCase(String sTestCaseName) {
		// TODO Auto-generated method stub

	}

	public void info(String message) {
		// TODO Auto-generated method stub

	}

	public void warn(String message) {
		// TODO Auto-generated method stub

	}

	public void error(String message) {
		// TODO Auto-generated method stub

	}

	public void fatal(String message) {
		// TODO Auto-generated method stub

	}

	public void debug(String message) {
		// TODO Auto-generated method stub

	}

}
