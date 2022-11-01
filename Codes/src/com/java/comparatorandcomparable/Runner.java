package com.java.comparatorandcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

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
		
		
	}

}
