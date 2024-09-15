package com.abinash.HashMap;

import java.util.HashMap;
// Hashmap approach for anagram .
public class Anagram {
	static HashMap<Character , Integer> makeFreqMap(String str){
		HashMap<Character,Integer> mp = new  HashMap<>();
		for(int i = 0 ; i< str.length() ; i++) {
			Character  ch = str.charAt(i);
			
			if(!mp.containsKey(ch)) {
				mp.put(ch, 1);
			}else {
				mp.put(ch, mp.get(ch)+1);
			}
			
		
		}
		return mp;
	}
	
	public static boolean isString(String s , String t) {
			if(s.length() != t.length()) return false;
			HashMap<Character, Integer> mp1 = makeFreqMap(s);
			HashMap<Character, Integer> mp2 = makeFreqMap(t);
			return mp1.equals(mp2);
		}
	
		public static void main(String[] args) {
			String s = "listen";
			String t = "silent";
			isString(s ,t);
			if(isString(s, t) == true) {
				System.out.println("it is a anagram");
			}else {
				System.out.println("it is not a anagram");
			}
		}
}
