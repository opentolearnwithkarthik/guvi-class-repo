package other.pack.interfaces;

public class ClassC implements InterfaceA, InterfaceB{
	
	@Override
	public void test() throws Exception {
		InterfaceA.super.test();
		InterfaceB.super.test();
	}
	
	
	

}
