package com.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.testng.annotations.Test;

public class ListSample {
@Test
public void listSample(){
	List<String> list=new ArrayList<>();
	list.add("abc");
	list.add("def");
	list.add("ghi");
	list.add("jkl");
	System.out.println("*****************************");
	
	Iterator<String> itr=list.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	System.out.println("*****************************");
	ListIterator<String> listItr=list.listIterator();
	while(listItr.hasNext()){
		System.out.println(listItr.next());
	}
	System.out.println("*****************************");
	
	
	while(listItr.hasPrevious()){
		System.out.println(listItr.previous());
	}
}
}
