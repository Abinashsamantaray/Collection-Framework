package com.demo.Collections;

import java.util.Scanner;

public class InsertStringInsideAnotherStringSOL2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the complete word: ");
		String word1 = sc.next();
		System.out.println("Enter the  word you want to insert : ");
		String word2 = sc.next();
		System.out.println("Enter in which  position you want to insert ");
		int position = sc.nextInt();
		
		String store = "";
		
		String part1 = word1.substring(0, position-1);// it takes the begin index(inclusive) and end index(exclusive) 
		String part2 = word1.substring(position-1, word1.length());
		
		store = part1 + word2 + part2;
		System.out.println(store);
	}
}
