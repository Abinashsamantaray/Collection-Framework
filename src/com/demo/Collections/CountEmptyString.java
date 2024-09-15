package com.demo.Collections;
import java.util.Arrays;
import java.util.List;

public class CountEmptyString {

	public static void main(String[] args) {
		List<String>  list = Arrays.asList("java", "", "Abinash", "Gopal");
		
		long count = list.stream()
			.filter(x->x.isEmpty())
			.count();
		System.out.println(count);
	}

}
