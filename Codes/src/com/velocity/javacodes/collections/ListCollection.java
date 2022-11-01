package com.velocity.javacodes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCollection {
	public static void main(String[] args) {
		
	
	 //Creating a List  
	 List<String> list=new ArrayList<String>();  
	 //Adding elements in the List  
	 list.add("Mango");  
	 list.add("Apple");  
	 list.add("Banana");  
	 list.add("Grapes");  
	 //Iterating the List element using for-each loop 
	 
	 List<String> reverse=new ArrayList<String>();
	 
	Collections.sort(list);
	 
	 for(String fruit:list) 
		 System.out.println(fruit);   
	 
	 System.out.println("----------------------------------------");
	 
	 for(int i= list.size()-1; i>=0;i--) {
		 String temp = list.get(i);
		 reverse.add(temp);
	 }
	 for(String list2: reverse)	 
	 System.out.println(list2);
	}  

	
	
}
