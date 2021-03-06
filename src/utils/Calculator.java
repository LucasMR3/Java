package utils;

public class Calculator {
	public static final double PI = 3.14159; // static members should have upper case

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

	public static double roots (double root) {
		return Math.sqrt(root);
	}
}
