package com.velocity.javacodes.collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class MapItrating {

	public static void main(String[] args) {
		Map<Integer, Integer> hpMap = new HashMap<>();
		hpMap.put(1, 400);
		hpMap.put(2, 500);
		hpMap.put(3, 700);
		hpMap.put(4, 500);
		hpMap.put(5, 600);
		hpMap.put(6, 700);
		hpMap.put(7, 500);
		
		

		Iterator<Integer> it =hpMap.keySet().iterator();
		
		while(it.hasNext()) {
			int key = (int)it.next();
		//System.out.println("ID : " + key + " Name : "+ hpMap.get(key));
		}
		hpMap.forEach((K,V)->System.out.println(" Key : "+ K + "   Value : "+ V));
		
	
	}

}
