package com.demo.Collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
			ArrayList<Integer> list = new ArrayList<>();
					list.add(10);
					list.add(20);
					list.add(30);
					list.add(40);
					list.add(50);
			//	System.out.println(list);
				list.add(2, 60);// at the index add 
			//	System.out.println(list);
				list.set(2,50); // remove the element from that index and insert the new element .
				//System.out.println(list);
				//list.addAll(list);// add all the elements at the end of the list 
				//System.out.println(list);
				list.clone(); // returns a shadow copy of this .
				//System.out.println(list);
			// list.forEach(alist -> System.out.println(list));
				list.remove(2);
				//System.out.println(list);
			Integer value = list.get(2);
				//System.out.println(value);
				int size = list.size();
				if(list.size() >= 2)
				//System.out.println(size);
				//boolean empty = list.isEmpty();
				//System.out.println(empty);
				//int lastIndexOf = list.lastIndexOf(value);
				//System.out.println(lastIndexOf);
				//list.clear();

				
				System.out.println(list.toArray());
			
				
			
		}

}
