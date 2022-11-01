package com.java.comparatorandcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Runner2 {

	public static void main(String[] args) {
	
		List<Laptop> laps = new ArrayList<>();
		laps.add(new Laptop("Hp",8,40000));
		laps.add(new Laptop("Dell",16,70000));
		laps.add(new Laptop("Lenovo",12,60000));

		Comparator<Laptop> com = new Comparator<Laptop>() {
			
			@Override
			public int compare(Laptop o1, Laptop o2) {
				if(o1.getPrice()>o2.getPrice()) {
				return 1;
			}else {
				return -1;
			}
			}
		};
		
		Collections.sort(laps,com);
		
		for(Laptop l : laps) {
			System.out.println(l);
		}
		
		Map<String, Integer> map=laps.stream().collect(Collectors.toMap(Laptop::getBrand,Laptop::getPrice));
		System.out.println(map);
	}

}
