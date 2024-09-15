package com.demo.Collections;

import java.util.Scanner;

public class HeartPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");// try to enter a odd nummber value.
		int value = sc.nextInt();
		int count1 = value, space1 = value + 2, space2 = value + 2;
		for (int a = 1; a <= 3; a++) {
			for (int i = 1; i <= space2; i++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= count1; j++) {
				System.out.print("*");
			}
			for (int k = 1; k <= space1; k++) {
				System.out.print(" ");
			}
			for (int l = 1; l <= count1; l++) {
				System.out.print("*");
			}
			count1 = count1 + 2;
			space1 = space1 - 2;
			space2--;
			System.out.println();
		}
		space1 = space1 + 2;
		count1 = count1 - 2;
		int star = count1 * 2 + space1, starcount = star;
		space2 = value;
		while (starcount > 0) {
			for (int m = 1; m <= space2; m++) {
				System.out.print(" ");
			}
			for (int n = 1; n <= starcount; n++) {
				System.out.print("*");
			}
			starcount = starcount - 2;
			if (starcount == 2)
				starcount = starcount + 1;
			space2++;
			System.out.println();
		}

	}
}
