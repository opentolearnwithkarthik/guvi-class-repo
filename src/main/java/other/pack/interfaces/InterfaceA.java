package other.pack.interfaces;

public interface InterfaceA extends InterfaceX{

	default void test() throws Exception {
		System.out.println("test method in Interface A ");
	}
	
	static void staticMethod() {
		System.out.println("static print in A");
	}
	

}
