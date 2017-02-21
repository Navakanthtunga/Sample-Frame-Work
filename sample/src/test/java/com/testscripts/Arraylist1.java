package com.sample;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist1 {
public static void main(String[] args) {
	// Creating Array-1
	 ArrayList<String> array1=new ArrayList<String>();  
	 array1.add("abc");  
	 array1.add("def");  
	 array1.add("ghi");  
	 array1.add("jkl");  
	//Traversing list through Iterator  
	Iterator<String> itr1=array1.iterator();  
	while(itr1.hasNext()){  
		System.out.println(itr1.next());  
		}
	 // For-each loop
	  for(String obj:array1)  
	    System.out.println(obj); 
		// To get the size of Array
	System.out.println(array1.size());
	  // Creating Array-2	 
	  ArrayList<String> array2=new ArrayList<String>();
	  array2.add("mno");
	  array2.add("pqr");
	  array2.add("stu");
	Iterator<String> itr2=array2.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
			}
		array1.addAll(array2);
		Iterator<String> itr3=array1.iterator();  
		while(itr3.hasNext()){  
			System.out.println(itr3.next());  
			}
		// To get the size of Array
	System.out.println(array1.size());
}  
	}