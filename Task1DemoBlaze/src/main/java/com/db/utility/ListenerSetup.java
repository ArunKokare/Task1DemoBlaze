package com.db.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.db.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) 
	{
	  logger.info("Testcase Execution Started"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
	  logger.info("Testcase Execution Successfully"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		logger.info("Testcase Execution Failure"+result.getName());
		Utill.screenshot(result.getName()+System.currentTimeMillis());
		logger.info("Take Screenshot");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		logger.info("Testcase Execution Skipped"+result.getName());
	}

	
	
	

}
