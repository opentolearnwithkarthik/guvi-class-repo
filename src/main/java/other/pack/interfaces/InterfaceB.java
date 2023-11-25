package other.pack.interfaces;

public interface InterfaceB extends InterfaceX {

	default void test() throws Exception {
		System.out.println("test method in Interface B ");
	}
}
