package concept.staticness;

import oops.animal.Amoeba;

public class MyClass {
	
	public static void main(String[] args) {
		Holder obj1 = new Holder();
		Holder obj2 = new Holder();
//		obj1.amoeba = new Amoeba();
		obj1.nonstaticValue = 1;
		obj2.nonstaticValue = 2;
		obj1.staticValue = 5;
		obj1.nonstaticValue = 3;
		obj2.staticValue = 10;
		
		System.out.println(10*obj1.nonstaticValue);
		System.out.println(10*obj2.nonstaticValue);
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1.amoeba);
		System.out.println(obj2.amoeba);
	}

}
