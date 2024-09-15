package com.demo.Collections;

import java.util.Scanner;

public class InsertStringIntoAnotherString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  the string");
		String word1 = sc.next();
		System.out.println("Enter the position:");
		int position = sc.nextInt();
		System.out.println("Enter the string to insert in that position: ");
		String word2 = sc.next();
		String store = "";
		
		for(int i = 0 ; i<position-1 ; i++) {
			store = store + word1.charAt(i);
		}
		store = store + word2;
		for(int j = position-1 ; j <word1.length(); j++) {
			store = store + word1.charAt(j);
		}
		System.out.println(store);
	}

}
