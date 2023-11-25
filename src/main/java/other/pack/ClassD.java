package other.pack;

public class ClassD {

	public static void main(String[] args) throws Exception {
		ClassC var = new ClassC();
		var.test();
		ClassD classD = new ClassD();
		ClassE obj = classD.new ClassE();
		obj.printMethod();
	}
	
	public void testname() throws Exception {
		ClassE obj = new ClassE();
	}

	private class ClassE {

		public void printMethod() {
			System.out.println("Class E print method");
		}
	}
	

}
