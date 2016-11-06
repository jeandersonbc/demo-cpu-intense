package com.example;

public class Fibonacci {

	public static Long compute(Long i) {
		if ((i == 0) || (i == 1))
			return i;
		return Fibonacci.compute(i - 1) + Fibonacci.compute(i - 2);
	}

}
