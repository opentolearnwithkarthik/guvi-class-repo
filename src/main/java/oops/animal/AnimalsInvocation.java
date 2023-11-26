package oops.animal;

public class AnimalsInvocation {

	public static void main(String[] args) {

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

		FourLeggedAnimal obj1 = new Dog("dog name", "Jimmyyyy");
		FourLeggedAnimal obj2 = new Cat("cat name", "Poonachi");
		// Code for getting input from user
		int option = 1;
		FourLeggedAnimal runtimeInstance = getInstance(option);
		runtimeInstance.runWithFourLegs();

		boolean sharpTeeth = Canine.hasSharpTeeth;
		System.out.println(sharpTeeth);
		Dog.someStaticOperation();
		dog1.someStaticOperation();

	}

	private static FourLeggedAnimal getInstance(int option) {
		switch (option) {
		case 1:
			return new Dog("dog name", "Jimmyyyy");
		case 2:
			return new Cat("cat name", "Poonachi");
		default:
			return null;
		}
	}

}
