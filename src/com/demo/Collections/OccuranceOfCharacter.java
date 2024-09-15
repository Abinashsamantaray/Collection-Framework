package com.demo.Collections;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String  : ");
		String value = sc.next();
		char[] ch = value.toCharArray();
		LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<Character , Integer>();
			for(int i = 0; i< ch.length ; i++) {
				if(!hashMap.containsKey(ch[i])) {
					hashMap.put(ch[i], 1);
				}
				else {
					int feq = hashMap.get(ch[i]);
					hashMap.put(ch[i],++feq);
				}
			}
			System.out.println(hashMap);
		
	}

}
