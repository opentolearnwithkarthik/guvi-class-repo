package other.pack.interfaces;

public interface InterfaceX {
	
	default void test() throws Exception {
		System.out.println("test method in Interface X ");
	}
	
	static void staticMethod() {
		System.out.println("static print in X");
	}

}
