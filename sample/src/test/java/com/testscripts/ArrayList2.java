package com.sample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
public static void main(String[] args) {
	// Creating Array-1
		 ArrayList<String> array1=new ArrayList<String>();  
		 array1.add("abc");  
		 array1.add("def");  
		 array1.add("ghi");  
		 array1.add("jkl");  
	 // Creating Array-2	 
	  ArrayList<String> array2=new ArrayList<String>();
	  array2.add("abc");
	  array2.add("def");
	  array2.add("stu");		
	  
// remove all will remove the common elements from the two arrays	
  array1.removeAll(array2);  
	  
	Iterator<String> itr1=array1.iterator();  
	while(itr1.hasNext()){  
		System.out.println(itr1.next());  
		}
/*	// retain all will give the common elements from the two arrays
	array1.retainAll(array2);  
	  Iterator<String> itr2=array1.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
			}*/
}
}