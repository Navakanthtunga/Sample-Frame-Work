package com.sample;

import java.util.Iterator;

public class Array {
public static void main(String[] args) {
	// Different ways to Declare an array
int a[];
int c [];

int[] b;
int []d;

// instantiation 
c=new int[5];
//initialization 
c[0]=1;
c[1]=2;
c[2]=15;
System.out.println(c[2]);


//declaration and instantiation 
int array[]=new int[3];
//initialization  
array[0]=120;
array[1]=456;
array[2]=789;

for(int i=0;i<=array.length-1;i++){
	System.out.println(array[i]);
}

for(int values:array){
	System.out.println("The values are "+values);
}

//declaration, instantiation and initialization  
int newArray[]={45,89,76,78};

for(int printValues:newArray){
	System.out.println("The values are "+printValues);
}

Class cclass=newArray.getClass();  
String name=cclass.getName();
System.out.println(cclass);
System.out.println(name);

// Multi-Dimensional Array

int multiArray[][]={{1,2,3},{2,4,5},{4,4,5}};

for(int i=0;i<=multiArray.length-1;i++){
	for(int j=0;j<=multiArray.length-1;j++){
		System.out.println(multiArray[i][j]+"");
	}
	System.out.println();
}
}
}
