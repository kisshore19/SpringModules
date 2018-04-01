package com.java.core;

public class Recurssion {

	public static void main(String[] args) {
		// Recurssion.printNumbers(10);
		// System.out.println("Factorial of : " + Recurssion.factorial(4)); ///
		// 4*3*2*1 = 24
		// System.out.println("powe of : " + Recurssion.power(2,5)); /// s
		// System.out.println("fibonancci : " + Recurssion.fibonancci(7)); /// s
		// System.out.println("sumOfTheGivenNumber : " +
		// Recurssion.sumOfTheGivenNumber(108)); /// s
//		System.out.println("countNumberOf5s : " + Recurssion.countNumberOf5s(48565832)); /// s
		int []arr = {4,18,23,48,60,80,93,102};
		System.out.println("binarySearch : " + Recurssion.binarySearch(arr,93,0,arr.length-1)); /// s

	}

	public static void printNumbers(int number) {
		if (number == 0) {
			return;
		}

		System.out.print(number);
		System.out.print(" ");
		printNumbers(number - 1);

	}

	public static int factorial(int number) {
		if (number == 1 || number == 0) {
			return number;
		} else {
			return number * factorial(number - 1);
		}
	}

	public static int power(int base, int number) {

		if (number == 1) {
			return base;
		} else {
			return base * power(base, number - 1);
		}
	}

	// 0 1 1 2 3 5 8 13 21
	public static int fibonancci(int number) {

		if (number == 0) {
			return 0;
		}
		if (number == 1) {
			return 1;
		} else {
			return fibonancci(number - 1) + fibonancci(number - 2);
		}

	}

	public static int sumOfTheGivenNumber(int number) {

		if (number < 9) {
			return number;
		} else {
			return number % 10 + sumOfTheGivenNumber(number / 10);
		}
	}

	public static int countNumberOf5s(int number) {

		if (number < 9) {
			if (number % 5 == 0) {
				return 1;
			} else {
				return 0;
			}
		} else {
			if (number % 5 == 0) {
				return 1 + countNumberOf5s(number / 10);
			} else {
				return 0 + countNumberOf5s(number / 10);
			}
		}

	}

	public static int binarySearch(int array[], int key, int start, int end) {

		if (start <= end) {

			int middle = (start + end) / 2;

			if (array[middle] > key) {
				return binarySearch(array, key, start, middle - 1);
			} else if (array[middle] < key) {
				return binarySearch(array, key, middle + 1, end);
			} else {
				return middle;
			}

		} else {
			return -1;
		}
	}
}
