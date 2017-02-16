package com.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.liqvid.library.GenericLib;

public class UploadUsingAutoIt {
@Test
public void upload() throws Throwable{
  	System.setProperty("webdriver.chrome.driver",GenericLib.sDirPath+"\\resources\\chromedriver.exe");	 
	WebDriver driver = new ChromeDriver();
	driver.get("file:///D:/Navakanth/Autoit/FileUpload.html");
	driver.findElement(By.xpath("//input[@id='1']")).click();
	
	Runtime.getRuntime().exec("D:\\Navakanth\\Autoit\\File upload.exe");
	Thread.sleep(5000);
	
}
}
