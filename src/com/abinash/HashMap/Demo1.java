package com.abinash.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
	static void hashMapMethods() {
		
		//syntax
		HashMap<String, Integer> map = new HashMap<>();
		
		// Adding entries in the hashTable
		map.put("Akash", 21);
		map.put("Dibya", 24);
		map.put("abinash", 23);
		map.put("Rahul",25);
		map.put("Rohit", 45);
		// Getting value of a key from hashmap
		System.out.println(map.get("Rahul")); // 25
		System.out.println(map.get("rakesh")); // null
		
		// Changing or updating value of a key in a hashmap
		
		map.put("Akash", 25);  // --> 25 it will not enter a new akash 25 , in place of akash 21 it will update because keys cannot be duplicate .
		
		// Remoing a pair from the hashMap
		map.remove("abinash"); // 23
		map.remove("riya"); //null
		
		// check if the key is in the HashMap 
		System.out.println(map.containsKey("Dibya")); // true
		System.out.println(map.containsKey("abinash")); // false
		
		//Adding the new entry only if the new key doesn't exist 
		map.putIfAbsent("Yash", 56); // will be enter
		map.putIfAbsent("Akash", 21); // will not enter 
		
		// Get all the keys in the hashmap
		System.out.println(map.keySet());
		
		// Get all the values in a hashmap
		System.out.println(map.values());
		
		//Get all the entries in a hashmap
		System.out.println(map.entrySet());
		
		// Traversing of the map 
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.printf("Age of  %s is %d\n" , e.getKey(),e.getValue());
		}
		
		 
		
	
	
	
	}

	public static void main(String[] args) {
		hashMapMethods();
	}
}
