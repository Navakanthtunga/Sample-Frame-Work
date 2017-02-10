package com.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class FileDownloadPopup {
@Test
public void downloadUsingSettings() throws Throwable{
	// Create a profile
	FirefoxProfile profile=new FirefoxProfile();
	 

	// To get value for different types of files----- https://www.sitepoint.com/web-foundations/mime-types-complete-list/

	// Set preferences for file type To over come "open" Option in Popup

	profile.setPreference("browser.helperApps.neverAsk.openFile", "application/zip");
	
	// Set preferences for file type To over come "Save" Option in Popup
	
	profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
	WebDriver driver=new FirefoxDriver(profile);
	driver.manage().window().maximize();
	driver.get("http://www.seleniumhq.org/download/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//tr//td)[4]")).click();
}

@Test
public void usingRobotCls() throws Throwable{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.seleniumhq.org/download/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//tr//td)[4]")).click();
	Robot robot=new Robot();
	robot.setAutoDelay(2000);
	
	// To Select "Save" Option
	robot.keyPress(KeyEvent.VK_ALT);
	robot.keyPress(KeyEvent.VK_S);
	
	robot.keyRelease(KeyEvent.VK_S);
	robot.keyRelease(KeyEvent.VK_ALT);
	robot.setAutoDelay(2000);
	// To Click on "Enter" OK button  
	robot.keyPress(KeyEvent.VK_ENTER);
	
	robot.keyRelease(KeyEvent.VK_ENTER);

	/*// To Click on "Cancel" button
	robot.keyPress(KeyEvent.VK_ESCAPE);
	
	robot.keyRelease(KeyEvent.VK_ESCAPE);*/

}
}
