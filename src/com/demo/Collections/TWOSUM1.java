package com.demo.Collections;

import java.util.Arrays;
import java.util.HashMap;

public class TWOSUM1 {

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		System.out.println(Arrays.toString(twoSum(nums, 9))); // Arrays.toString we use because the println takes the String and we are returnning array of int (int[] ) 
	}
	public static int[] twoSum(int[] nums , int target ) {
		HashMap<Integer, Integer> complements = new  HashMap<Integer,Integer>();  // HashMap doesn't maintain any order for the key and value whereas the LinkedHashMap maintains the Order of Key and value .
		
		for(int i = 0 ; i  < nums.length;i++) {
				Integer complementIndex = complements.get(nums[i]);
				if(complementIndex != null) {
					return new int[] {i , complementIndex};
				}
				complements.put(target - nums[i], i);
		}
		return nums;
	}

}
