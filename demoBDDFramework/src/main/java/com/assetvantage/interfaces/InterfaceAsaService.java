package com.assetvantage.interfaces;

import java.io.IOException;

import org.testng.ITestResult;

public interface InterfaceAsaService {

	void takeScreenShotofCurrentpage() throws IOException;

	void startTestCase(String sTestCaseName);

	void endTestCase(String sTestCaseName);

	public void info(String message);

	void warn(String message);

	void error(String message);

	void fatal(String message);

	void debug(String message);

	public void onTestStart(ITestResult result);

	public void onTestSuccess(ITestResult result);

	public void onTestFailure(ITestResult result);

	public void onTestSkipped(ITestResult result);

	public void onStart(ITestResult result);

	public void onFinish(ITestResult result);

}
