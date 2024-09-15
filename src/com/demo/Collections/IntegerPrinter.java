package com.demo.Collections;

public class IntegerPrinter <T> {

		T integerPrinter;

		public IntegerPrinter(T integerPrinter) {
			this.integerPrinter = integerPrinter;
		}
		
		public void print() {
			System.out.println(integerPrinter);
		}
		
		
}
