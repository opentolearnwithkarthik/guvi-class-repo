package oops.animal;

import dummy.animal.Animal;

public class AnimalsInvocation {

	public static void main(String[] args) {

		Amoeba amoeba1 = new Amoeba();

//		Animal a1 = new Animal();
//		Animal a2 = new Animal("Dummy No Animal Type");
//		Animal a3 = new Animal("Dummy With Animal Type", AnimalType.SINGLE_CELLED);

//		System.out.println(a1.getScientificName());
//		System.out.println(a1.getType());
//		System.out.println(a2.getScientificName());
//		System.out.println(a2.getType());
//		System.out.println(a3.getScientificName());
//		System.out.println(a3.getType());

		Dog dog1 = new Dog("Canis lupus familiaris", "Jimmy");
		Dog dog2 = new Dog("Canis lupus familiaris", "Tommy");
		System.out.println(dog1.getPetName());
		System.out.println(dog2.getPetName());
		Tiger tiger1 = new Tiger("Panthera Tigris");
		tiger1.killPrey(dog1);

		dog1.wagAndBark();
		System.out.println(dog1.isFourLegged());
		System.out.println(dog2.isFourLegged());
		dog1.fourLegged = false;
		System.out.println(dog2.isFourLegged());

		System.out.println(dog1.getPetName());
		System.out.println(dog2.getPetName());
		Cat cat1 = new Cat("whatever", "Meow1");
		System.out.println(cat1.getPetName());
		System.out.println(dog1.getPetName());
		System.out.println(dog2.getPetName());
		dog1.setPetName("Ghost");
		System.out.println(dog1.getPetName());
		System.out.println(dog2.getPetName());
		System.out.println(cat1.getPetName());

		System.out.println(cat1 instanceof DomesticAnimal);
		System.out.println(dog1 instanceof DomesticAnimal);
		System.out.println(dog1 instanceof Animal);
		System.out.println(dog1 instanceof Dog);

		dog1.makeSound();
		cat1.makeSound();

		Animal dog5 = new Dog("Canis lupus familiaris", "Mani");
		dog5.makeSound();

		Dog dog6 = new Dog("Canis lupus familiaris", "Mani");
		dog6.makeSound();

		System.out.println(dog6.getScientificName());

		System.out.println(dog6.getPetName());
		dog6.petName = "Subramani";
		System.out.println(dog6.getPetName());

		int a = 10;
		int b = 5;
		System.out.println(a + b);

		String name1 = "India";
		String name2 = "Bharat";
		System.out.println(name1 + " ie " + name2);
		
		System.out.println(name1.concat(name2));
		
		System.out.println(sum(5, 10));
		System.out.println(sum(5, 10, 15));
		System.out.println(sum("5", "10"));

	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private static String sum(String a, String b) {
		return a + b;
	}

	private static int sum(int a, int b, int c) {
		return a + b + c;
	}

}
