package guvi;

public class MyClass {
	
	public int myVariable = 10;

	public void publicMethod() {
		System.out.println("public");
	}

	private  void privateMethod() {
		System.out.println("private");
	}

	protected  void protectedMethod() {
		System.out.println("protected");
	}
	
	 void accessPrivateMethod() {
		privateMethod();
	}
	 
	 void defaultMethod() {
		 System.out.println("default");
	 }

}
