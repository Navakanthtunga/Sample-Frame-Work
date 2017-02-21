package com.sample;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ConfigWrite {
@Test
public void configWrite() throws Throwable{
	Properties properties=new Properties();
	properties.setProperty("name1", "Test1");
	properties.setProperty("name2", "Test2");
	properties.setProperty("name3", "Test1");
	properties.setProperty("name4", "Test2");
	properties.store(new FileWriter("dateWrite.properties"), "Sample Data Write in Properties file");
}
}
