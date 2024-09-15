package com.abinash.HashMap;

import java.util.HashMap;

public class MaximumFrequency {
	public static void main(String[] args) {
		int arr[] = {1,2,3,9,6,6,6,8,8,9,9,9,0,9,0,9};
		HashMap<Integer, Integer> freq = new HashMap<>();
		for (int key : arr) {
			if(!freq.containsKey(key)) {
				freq.put(key, 1);
			}
			else {
				freq.put(key, freq.get(key) + 1);
			}
		}
		System.out.println("frequency set");
		System.out.println(freq.entrySet());
		
		int maxfreq = 0 , ansKey = -1 ;
		for(var e : freq.entrySet()) {
			if(e.getValue() > maxfreq) {
				maxfreq = e.getValue();
				ansKey = e.getKey();
			}
		}
		System.out.println("the maximum frequency of a given elements is  :" +ansKey);
		
	}
}
