package com.velocity.javacodes.collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

public class MapIterating {

	public static void mapIteratingUsingLambda() {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(101, "Ajay");
		hm.put(102, "Vjay");
		hm.put(103, "Varun");
		hm.put(104, "Dev");
		
		System.out.println("\n");
		
		System.out.println("Printing By Using Lambad Function");
		hm.forEach((K,V)->System.out.println("ID : "+ K + " Value :"+V));
	}

	public static void mapIteratingUsingItrator() {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(101, "Ajay");
		hm.put(102, "Vjay");
		hm.put(103, "Varun");
		hm.put(104, "Dev");
		
		System.out.println("Printing By Using Itrator Function"+"\n");
		Iterator<Integer> it=hm.keySet().iterator();
		
		while(it.hasNext()) {
			int key=(int)it.next();
			System.out.println("ID : "+key +" Value :"+hm.get(key));
		}
		
			System.out.println("\n");

	}

	public static void mapIteratingUsingOptional() {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(101, "Ajay");
		hm.put(102, "Vjay");
		hm.put(103, "Varun");
		hm.put(104, "Dev");

		System.out.println("Printing By Using Optional Class"+"\n");
		Optional<Map> optional = Optional.ofNullable(hm);
		System.out.println(optional.orElseThrow());
		
		
	}

	public static void main(String[] args) {
		String str = "Have a Nice Day";

		Optional<String> optional = Optional.ofNullable(str);
		System.out.println(optional.orElse("No element presrnt in object"));
		mapIteratingUsingLambda();
		System.out.println("\n");
		mapIteratingUsingItrator();
		System.out.println("\n");
		mapIteratingUsingOptional();

	}

}
