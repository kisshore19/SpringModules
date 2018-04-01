package com.java.beans;

import org.springframework.stereotype.Component;

public class AnotherBean {

	public static void main(String[] args) {
		System.out.println(AnotherBean.factorial(2));
	}

	public static int factorial(int number) {
		int result = 1;
		if (number < 1) {
			return 1;
		} else {
			return result * factorial(number - 1);
		}
	}
}
