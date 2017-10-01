package edu.umb.cs.cs410.hw01;

public class Calculator {

	public Calculator() {
	}

	public float multiply(float x, float y) {
		return x*y;
	}

	public float divide(float x, float y) {
		if (y == 0)  throw new IllegalArgumentException("division by zero");
		return x/y;
	}

	public float subtract(float x, float y) {
		return x-y;
	}

	public float add(float x, float y) {
		return x+y;
	}

	public static void main(String[] args) {

		Calculator calc = new Calculator();

		System.out.println("3 times 4 is: " + calc.multiply(3, 4));
		System.out.println("25 divided by 5 is: " + calc.divide(25, 5));
		System.out.println("7 plus 6 is: " + calc.add(7, 6));
		System.out.println("15 minus 3 is: " + calc.subtract(15, 3));
	}

}