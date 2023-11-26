package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println(MathOperations.sum(5, 10));
		System.out.println(MathOperations.sum(5, 10, 15));
		System.out.println(MathOperations.sum("5", "10"));

		System.out.println(MathOperations.divide(50, 5));
//		Scanner scanner = new Scanner(System.in);
		try (Scanner scanner = new Scanner(System.in)) {
//			System.out.println(MathOperations.divide(50, 10, 0));
			System.out.println("Enter 3 numbers with one space in between");

			String line = scanner.nextLine();
			String[] values = line.split(" ");
			List<Integer> list = new ArrayList<>();
			for (String eachStringValue : values) {
				list.add(Integer.parseInt(eachStringValue));
			}
//			scanner.close();
			System.out.println(MathOperations.divide(list.get(0), list.get(1), list.get(2)));
			System.out.println("Last line in try block");

			//
			//
			//
			//
			//
			//
		} catch (ArithmeticException e) {
			System.err.println("I have got Arithmetic Exception");
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			System.err.println("I have got IndexOutOfBoundsException Exception");
			e.printStackTrace();
		} catch (MyException e) {
			System.err.println(e.getErrorCode());
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("I have got some other Exception");
			e.printStackTrace();
		} finally {
			System.out.println("Finally block code");
		}
		System.out.println("Printing outside try catch finally exception");

		String value = getValue();
		value.split(" ");

		fileRead();
	}

	private static String getValue() {
//		return null;
		return "Empty";
	}

	private static void fileRead() {
		try (FileReader fileReader = new FileReader("C:\\Users\\sreek\\Downloads\\Attendees.txt");
				BufferedReader reader = new BufferedReader(fileReader)) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
