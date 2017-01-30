package com.testscripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baselib.BaseLib;

public class Screen {
public static void main(String[] args) {
	String sDirPath = System.getProperty("user.dir");
	
	WebDriver driver ;
	System.setProperty("webdriver.chrome.driver", sDirPath+"\\resources\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(scrFile, new File(sDirPath+"\\screenshots\\testScreenShot.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("***********");
}
}