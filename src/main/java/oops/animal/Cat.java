package oops.animal;

public class Cat extends DomesticAnimal implements FourLeggedAnimal {

	public Cat(String biologicalName, String petName) {
		super(biologicalName, petName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void placeOfStay() {
		System.out.println("Under the bed");
	}

	@Override
	public void makeSound() {
		System.out.println("Meow");
	}

	@Override
	public void runWithFourLegs() {
		// TODO Auto-generated method stub
		
	}

}
