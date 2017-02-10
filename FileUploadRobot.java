package com.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.liqvid.library.GenericLib;

public class FileUploadRobot {
	static WebDriver driver;
	/* 
	 * File upload using Robot class in Main()
	 		*/
	 public static void main(String args[]) throws Exception
	    {
	        Robot robot = new Robot();
	    	System.setProperty("webdriver.chrome.driver",GenericLib.sDirPath+"\\resources\\chromedriver.exe");	 
	    	driver = new ChromeDriver();
	        driver.get("http://demo.automationtesting.in/Register.html");
	        driver.findElement(By.id("imagesrc")).click();
	        robot.setAutoDelay(2000); 
	        StringSelection selection = new StringSelection("D:\\New folder\\cbt_automation-liqvid-45f98939364b\\Test1.png");
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
	        robot.setAutoDelay(1000); // To pass driver control to the File upload popup
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyRelease(KeyEvent.VK_V);
	        robot.setAutoDelay(1000);// To pass driver control to the File upload popup
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	    }
	 
	/*
	 * File upload using Robot class in @Test
	 									*/
	
	public void clipboard(String string){
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	
	}
	
@Test
public void test1() throws AWTException, InterruptedException{
	 String filepath = "D:\\New folder\\cbt_automation-liqvid-45f98939364b\\Test1.png";  
	System.setProperty("webdriver.chrome.driver",GenericLib.sDirPath+"\\resources\\chromedriver.exe");	 
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();     
	Thread.sleep(5000);
	driver.get("http://www.helloselenium.com/2015/03/how-to-upload-file-using-java-robot.html");
	
	WebElement ChooseFile = driver.findElement(By.name("uploadFileInput"));
	ChooseFile.click();
	 clipboard(filepath);		
		Robot robot = new Robot();
		robot.setAutoDelay(1000);		
 		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_ENTER); 
		robot.keyRelease(KeyEvent.VK_ENTER); 
		 }
	
	
	@Test
	public void test2() throws Exception{
	// To perform some basic operations on a web page 	
  driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
	Thread.sleep(2000);
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_P);
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.tagName("iframe")));
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_ENTER);
}
}

