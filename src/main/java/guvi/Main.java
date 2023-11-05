package guvi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
//		int var = 10;
//		System.out.println(var);
//		var++;
//		System.out.println(var);
//		printHello();
////		String numberType = var % 2 == 0 ? "even" : "odd";
////		System.out.println(numberType);
//		if(var % 2 == 0) {
//			System.out.println("Even");
//		}else {
//			System.out.println("Odd");
//		}
		int a = 10;
		int b = 20;
		String options = "1. add\n2. sub\n3. multiply\n4. divide\nplease enter your option";
		System.out.println(options);
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			String option = reader.readLine();
			switch (option) {
			case "1":
				System.out.println(a + b);
				break;
			case "2":
				System.out.println(a - b);
				break;
			case "3":
				System.out.println(a * b);
				break;
			case "4":
				System.out.println(a / b);
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
			System.out.println("outside switch statement");
		}
		
		

		/*
		 * switch(condition) { case a: whatever; break; case b: whatsoever break
		 * default: other stuff }
		 */

		/**
		 * 
		 * if(condition){ ifblock } else if(another condition){ else if block }else{
		 * else block }
		 * 
		 */
	}

	/**
	 * This method prints Hello
	 */
	private static void printHello() {
		System.out.println("Hello");
	}

}
