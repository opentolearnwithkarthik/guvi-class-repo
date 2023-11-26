package exceptions;

import exceptions.MyException.HttpErrorCode;

public class MathOperations {

	public static int divide(int a, int b) {
		return a / b;
	}

	public static int divide(int a, int b, int c) throws MyException {
		try {
			return divide(divide(a, b), c);
		} catch (Exception e) {
			System.err.println("Error occurred while dividing the numbers - " + a + ", " + b + ", " + c);
			MyException myException = new MyException("Invalid numbers while doing division", HttpErrorCode.BAD_REQUEST,
					e);
			throw myException;
//			throw new ArithmeticException();
//			throw e;
		}
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static String sum(String a, String b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

}
