package com.java8.streamapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Converting List into Map

public class StudentMain {

	public static void main(String[] args) {
		 List<Student> list = new ArrayList<Student>();
		 list.add(new Student(1,"Ajay"));
		 list.add(new Student(2,"Vijay"));
		 list.add(new Student(3,"Nikhil"));
		 
		
		 
		Map<Integer,String> newMap= list.stream().collect(Collectors.toMap(Student::getStudeId,Student::getStudentName));

		System.out.println(newMap);
	}

}
