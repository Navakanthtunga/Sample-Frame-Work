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
	public  WebDriver driver;
	
	@BeforeMethod
	public void launch()
	{	
	System.setProperty("webdriver.chrome.driver", "D:\\Sample Frame Work\\sample\\resources\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("https://accounts.google.com/ServiceLogin?");

}
}
