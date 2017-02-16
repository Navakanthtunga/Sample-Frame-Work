package com.sample;

import org.testng.annotations.Test;

public class Autoit {
@Test
public void demo() throws Throwable{
String filePath="D:\\Navakanth\\Autoit\\NotepadDemo.exe";
	Runtime.getRuntime().exec(filePath);

}
}
