package com.sample;

import org.testng.annotations.Test;

public class BrowserUninstall {

	@Test
	public void ChromeUninstall() throws Throwable{

	Runtime.getRuntime().exec("D:\\Navakanth\\Autoit\\Unistall.exe");
	Thread.sleep(15000);
	Runtime.getRuntime().exec("C:\\Softwares\\google-chrome-52-0-2743-116-64-bit.exe");
	Thread.sleep(2000);
	Runtime.getRuntime().exec("D:\\Navakanth\\Autoit\\Install.exe");
	Thread.sleep(90000);
}

}
