package com.bridgelabz.lambdaexpression;

@FunctionalInterface
interface IMathFunction {
	int calculate (int a, int b);
}

public class MathOperation {

	public static void main(String[] args) {
		IMathFunction add = Integer::sum;
		System.out.println("Addition is " + add.calculate(6, 3));
		IMathFunction multiplication = (x, y) -> x*y;
		System.out.println("Multiplication is " + multiplication.calculate(5, 6));
		IMathFunction division  = (int x, int y) -> x/y;
		System.out.println("Division is " + division.calculate(10, 2));
	}

}
