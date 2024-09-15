package com.demo.Collections;

import java.util.Arrays;
import java.util.HashMap;
// return indecies of two numbers whose sum is equal to target .
public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2,8,1,15};
		System.out.println(Arrays.toString(twoSum(nums, 9)));// Arrays.toString we use because the println takes the String and we are returnning array of int (int[] ) 
		
	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hm = new HashMap<>();//// HashMap doesn't maintain any order for the key and value whereas the LinkedHashMap maintains the Order of Key and value .
		for (int i = 0; i < nums.length; i++) {
			int requiredNumber = target - nums[i];
			if (hm.containsKey(requiredNumber)) // containsKey --> it will check whether the given key is present in HashMap or not .
			{
				int[] arr = {hm.get(requiredNumber), i };// get --> it will get the value of that particular object key in the HashMap.
				return arr;
			}
			hm.put(nums[i], i); // put --> to put some key and value pair in HashMap
		}
		return null;

	}
 		
}
