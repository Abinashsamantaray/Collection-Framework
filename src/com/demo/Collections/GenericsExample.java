package com.demo.Collections;

public class GenericsExample {

	public static void main(String[] args) {
		IntegerPrinter<Integer> printer = new IntegerPrinter<>(23);
		printer.print();
		
	}

}
