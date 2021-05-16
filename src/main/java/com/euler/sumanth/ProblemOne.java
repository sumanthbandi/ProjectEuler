package com.euler.sumanth;

/*
 * Multiples of 3 and 5 - https://projecteuler.net/problem=1
 */
public class ProblemOne {
	public static long sumOfMultiplesOf3And5(int num) {
		long sum = 0;
		for(int i=1; i<num; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sumOfMultiplesOf3And5(1000));
	}

}
