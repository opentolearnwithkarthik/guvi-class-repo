package guvi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyEntryPointClass {

	public static void main(String[] args) throws IOException {
		
		char ch = 'a';
		System.out.println(ch);
		char ch2 = 98;
		System.out.println(ch2);
		String name = "karthik";
		String name2 = new String("karthik");
		String name3 = "karthik";
		String name4 = new String("karthik");
		System.out.println(name2 == name4);
		System.out.println(name.equals(name2) );
		System.out.println(name == name2);// false
		int ii = 5;
		int jj = 5;
		System.out.println(ii == jj );// true
		System.out.println(name); // karthik
		name = "chandru";
		System.out.println(name); // chandru
		name = "karthik2";
		System.out.println(name); // karthik2
		
		char[] charArray = {'k','a','r','t','h','i','k'};
		System.out.println(name);
		for (char c : charArray) {
			System.out.print(c);
		}
		
		
		int var = 10;
		System.out.println(var);
		int[] myArray = {10,20,50,65,15,24,94};
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray);
		
		for(int i =0 ; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		for (int value : myArray) {
			System.out.println(value);
		}
		
		var++;
		System.out.println(var);
		printHello();
		String numberType = var % 2 == 0 ? "even" : "odd";
		System.out.println(numberType);
		if(var % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
		for(int i =1;i <= 10; i++) {
			printHello();
			if(i<=5) {
				continue;
			}
			System.out.println(i+"th iteration");
			System.out.println(i+"th iteration");
			System.out.println(i+"th iteration");
			System.out.println(i+"th iteration");
			System.out.println(i+"th iteration");
			
		}
	
		System.out.println("out of loop");
		
		
		
		
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
		
		
		/**
		 * 
		 * while(condition){
		 * ....
		 * ...
		 * ....
		 * ....
		 * }
		 * 
		 * 
		 * do{
		 * ...
		 * ...
		 * ...
		 * }while(condition);
		 * 
		 * 
		 * for(first-statement;condition;last-statement){
		 * ...
		 * ...
		 * ...
		 * ..
		 * 
		 * }
		 * 
		 * 
		 * 
		 */
		

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
