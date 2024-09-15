package com.demo.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondHighest {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter the elements you want to add in the list ");
		List<Integer> list = new  ArrayList<Integer>();
		for(int i = 0 ; i< size;i++)
		{
			list.add(sc.nextInt());	
		}
		Collections.sort(list);// it will sort the list in the ascending order .
		System.out.println(list);
		int value = list.get(size-1);// returns the element present in that particular index  in the  list .
		System.out.println(size-1);
		System.out.println(value);
		for(int j =size-1 ; j >= 0 ; j-- ) {
			if(list.get(j) != value)
			{
				System.out.println("The second largest element in the list is : " + list.get(j));
				break; // it will come out from the loop once the condition is satisfied 
			}
		}
	}
}
