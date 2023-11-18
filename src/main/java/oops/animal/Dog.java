package oops.animal;

public class Dog extends DomesticAnimal {

	public static boolean fourLegged = true;

	public static boolean isFourLegged() {
		return fourLegged;
	}

	/**
	 * This constructor creates instance of {@link Dog}
	 * 
	 * @param biologicalName scientific name of the dog
	 * @param petName        name of my pet
	 */
	public Dog(String biologicalName, String petName) {
		super(biologicalName, petName);
	}

	public void bark() {
		System.out.println("Bow Bow");
	}

	public void wagTheTail() {
		System.out.println("Wagging the tail");
	}

	public void carryLuggage() {

	}

	public void wagAndBark() {
		this.wagTheTail();
		this.bark();
		stayInHouse();
	}

	@Override
	public void stayInHouse() {
		super.stayInHouse();
		System.out.println("Dog stays in house");
	}

}
