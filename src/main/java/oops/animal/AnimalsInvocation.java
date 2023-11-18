package oops.animal;

import oops.animal.Animal.AnimalType;

public class AnimalsInvocation {

	public static void main(String[] args) {
		Amoeba amoeba1 = new Amoeba();

		Animal a1 = new Animal();
		Animal a2 = new Animal("Dummy No Animal Type");
		Animal a3 = new Animal("Dummy With Animal Type", AnimalType.SINGLE_CELLED);

		System.out.println(a1.getScientificName());
		System.out.println(a1.getType());
		System.out.println(a2.getScientificName());
		System.out.println(a2.getType());
		System.out.println(a3.getScientificName());
		System.out.println(a3.getType());

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
	}

}
