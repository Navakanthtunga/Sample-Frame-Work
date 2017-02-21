package com.sample;

import java.util.HashMap;

import org.testng.annotations.Test;

public class HashMapSample {
@Test
public void hashMapSample(){
	HashMap<Integer, String> map = new HashMap<Integer, String>();   
	map.put(001, "abc");
	map.put(002, "def");
	map.put(003, "ghi");
	map.put(003, "ilk");
	map.put(003, "g4i");
	System.out.println(map);
	map.remove("abc");
	System.out.println(map);
	
	System.out.println(map.keySet());
	
	System.out.println(map.entrySet());
	
}
}
