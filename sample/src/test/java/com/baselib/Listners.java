package com.baselib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {
public static int passCount;


	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		passCount=passCount++;
		System.out.println("No of Test passed : "+ passCount);
	}

	public void onTestFailure(ITestResult result) 
	{
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
