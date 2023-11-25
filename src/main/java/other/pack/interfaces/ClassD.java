package other.pack.interfaces;

public class ClassD {

	public static void main(String[] args) throws Exception {
		ClassC classC = new ClassC();
		classC.test();
		InterfaceX.staticMethod();
		InterfaceA.staticMethod();
//		classC.staticMethod(); error
	}
	

}
