package com.bridgelabz.lambdaexpression;

@FunctionalInterface
interface IMathFunction {
	int calculate (int a, int b);
	static void printResult(int a, int b, String function, IMathFunction fobj) {
		System.out.println("Result of "+function+" is "+fobj.calculate(a, b));
	}
}

public class MathOperation {

	public static void main(String[] args) {
		IMathFunction add = Integer::sum;
		IMathFunction multiply = (x, y) -> x*y;
		IMathFunction divide  = (int x, int y) -> x/y;
		IMathFunction.printResult(3, 3, "Addition", add);
		IMathFunction.printResult(5, 2, "Multiplication", multiply);
		IMathFunction.printResult(6, 2, "Division", divide);
	}

}
