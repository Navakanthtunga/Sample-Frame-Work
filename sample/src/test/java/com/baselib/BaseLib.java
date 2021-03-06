package com.baselib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

/***********
 *@method:  
 *
 *
 */
public class BaseLib {
	public static  WebDriver driver;
	static public String sDirPath = System.getProperty("user.dir");
	
	@BeforeMethod
	public void launch() throws Throwable
	{	
	System.setProperty("webdriver.chrome.driver", sDirPath+"\\resources\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get(GenericLib.getconfigdata(sDirPath+"\\config.properties", "TestURL"));
	//driver.navigate().to("https://accounts.google.com/ServiceLogin?");

}
	
}
