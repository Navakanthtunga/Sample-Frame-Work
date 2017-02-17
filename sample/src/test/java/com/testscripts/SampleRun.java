package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.liqvid.library.GenericLib;

public class SampleRun {
	
	@Test
	public void test1() throws Throwable{
		System.setProperty("webdriver.chrome.driver",GenericLib.sDirPath+"\\resources\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=Eb2mWPrUILHl8Aemp5WoDQ");
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		Thread.sleep(15000);
		driver.close();
	}
	
	@Test
	public void test2(){
		System.setProperty("webdriver.chrome.driver",GenericLib.sDirPath+"\\resources\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=Eb2mWPrUILHl8Aemp5WoDQ");
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
	}
	
}
