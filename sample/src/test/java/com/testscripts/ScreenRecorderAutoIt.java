package com.sample;

import org.testng.annotations.Test;

public class ScreenRecorderAutoIt {
@Test
public void install() throws Throwable{
	Runtime.getRuntime().exec("C:\\Softwares\\screen_recorder_setup.exe");
	Thread.sleep(3000);
	Runtime.getRuntime().exec("D:\\Navakanth\\Autoit\\ScreenRecorder.exe");
}
}

