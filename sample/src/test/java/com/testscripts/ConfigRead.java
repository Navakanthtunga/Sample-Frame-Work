package com.sample;

import java.io.FileReader;
import java.util.Properties;

import org.testng.annotations.Test;

public class ConfigRead {
String filePath= System.getProperty("user.dir")+"\\datatoread.properties";
	@Test
	public void configRead() throws Throwable{
		FileReader reader=new FileReader(filePath);  
	      
	    Properties properties=new Properties();  
	    properties.load(reader);  
	    System.out.println(properties.getProperty("name"));
	}
}
