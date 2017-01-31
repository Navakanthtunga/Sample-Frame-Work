package com.testscripts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baselib.BaseLib;

public class Screen {
public static void main(String[] args) throws Throwable {
	String sDirPath = System.getProperty("user.dir");
	
	WebDriver driver ;
	System.setProperty("webdriver.chrome.driver", sDirPath+"\\resources\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss");
	String sdate = sdf.format(date);
	System.out.println(sdate);
	File imgFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(imgFile, new File(BaseLib.sDirPath+"\\screenshots\\"+sdate+"_test.png"));
}
}
