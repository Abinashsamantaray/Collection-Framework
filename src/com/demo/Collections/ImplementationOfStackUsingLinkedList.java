package com.demo.Collections;

import java.util.LinkedList;

public class ImplementationOfStackUsingLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.push(10);
		linkedList.push(20);
		linkedList.push(30);
		linkedList.push(40);
		linkedList.push(50);
		
		System.out.println(linkedList);
		System.out.println(linkedList.pop());
		System.out.println(linkedList.pop());
		System.out.println(linkedList.pop());
		System.out.println(linkedList.pop());
		System.out.println(linkedList.pop());
	}

}
 
