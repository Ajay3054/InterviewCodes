package com.java8.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class InsuranceMain {

	public static void itratingMaps() {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 600);
		map.put(2, 300);
		map.put(3, 100);
		map.put(4, 700);
		map.put(5, 900);
		map.put(6, 400);
		map.put(7, 500);

		Iterator<Integer> it = map.keySet().iterator();

		while (it.hasNext()) {
			int key = it.next();
			System.out.println(" ID : " + key + "   Amount : " + map.get(key));
		}

		Optional<Map> optional = Optional.ofNullable(map);
		System.out.println(optional.orElseThrow());

		map.forEach((k, v) -> System.out.println(" Id : " + k + "    Amount : " + v));

		List<Entry<Integer, Integer>> newMap = map.entrySet().stream().collect(Collectors.toList());
		System.out.println(newMap);
	}

	public static void main(String[] args) {

		List<Insurance> list = new ArrayList<>();
		list.add(new Insurance(1, 200));
		list.add(new Insurance(2, 400));
		list.add(new Insurance(3, 100));
		list.add(new Insurance(4, 700));
		list.add(new Insurance(5, 400));
		list.add(new Insurance(6, 200));
		list.add(new Insurance(7, 100));

		Map<Integer, Integer> hmMap = list.stream().collect(Collectors.toMap(Insurance::getId, Insurance::getAmount));

		Optional<Map> optional = Optional.ofNullable(hmMap);
		System.out.println(optional.orElseThrow());

		System.out.println(hmMap);

		List<Entry<Integer, Integer>> entries = new ArrayList<>(hmMap.entrySet());
		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

		List<Integer> newList = list.stream().filter(l -> l.getId() >= 3).map(l -> l.getAmount())
				.collect(Collectors.toList());

		Collections.sort(newList);
		System.out.println(newList);

		itratingMaps();
	}

}

/*
 * Map<Integer,Integer> map=new HashMap<>(); map.put(1, 600); map.put(2, 300);
 * map.put(3, 100); map.put(4, 700); map.put(5, 900); map.put(6, 400);
 * map.put(7, 500);
 * 
 */