package com.demo.Collections;

import java.util.Scanner;

public class CommonCharacterBetweenTwoString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings : ---");
		String s1 = sc.next();
		String s2 = sc.next();
		String sol = "";
		boolean commonCharacterFound = false;
		
		for(int i = 0 ; i<s1.length();i++) {
			for(int j = 0 ; j<s2.length();j++) {
					if(s1.charAt(i) == s2.charAt(j)) {
						sol = sol+s1.charAt(i);
						s1 = s1.replace(s1.charAt(i), ' ');
						System.out.println(s1);
						commonCharacterFound = true ;
						break;
					}
			}
		}
		if(commonCharacterFound == true) {
			System.out.println("Common characters is :   "+sol);
		}
		else {
			System.out.println("No common character is found ");
		}
	}

}
