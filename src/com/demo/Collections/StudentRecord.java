package com.demo.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class StudentRecord {
	

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 HashMap<Integer, List> hm = new HashMap<>();
		 System.out.println("enter the number of students : ");
		 int n = sc.nextInt();
		 for(int i = 0 ; i<n ; i++) {		
			 ArrayList studentRecords = new ArrayList<>();
		 System.out.println("enter the student id: ");
		 int id = sc.nextInt();
		 System.out.println("enter the student name: ");
		 String name = sc.next();
		 studentRecords.add(name);
		 
		 System.out.println("Enter the phone number : ");
		 long phone = sc.nextLong();
		 	studentRecords.add(phone);
		 	
		 	System.out.println("Enter the City ");
		 	String city = sc.next();
		 	studentRecords.add(city);
		 	hm.put(id, studentRecords);
		 	
		 }
		 System.out.println("Enter the students id to be search");
		 int searchId = sc.nextInt();
		 
		 if(hm.get(searchId) == null) {
			 System.out.println("no record found" );
			 
		 }else {
			 System.out.println(hm.get(searchId));
		 }
		 
	}

}
