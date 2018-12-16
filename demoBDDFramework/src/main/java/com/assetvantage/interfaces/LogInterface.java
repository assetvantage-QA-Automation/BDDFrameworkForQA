package com.assetvantage.interfaces;

public interface LogInterface extends InterfaceAsaService {

	void startTestCase(String sTestCaseName);

	void endTestCase(String sTestCaseName);

	public void info(String message);

	void warn(String message);

	void error(String message);

	void fatal(String message);

	void debug(String message);
}
