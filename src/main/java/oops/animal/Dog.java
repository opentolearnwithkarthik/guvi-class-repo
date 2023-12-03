package oops.animal;

/**
 * 
 */
public class Dog extends DomesticAnimal implements Canine {

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
	}

	@Override
	public void placeOfStay() {
		System.out.println("on the sofa");
	}

	@Override
	public void makeSound() {
		bark();
		dummyProtected();
	}

	@Override
	public void howl() {
		System.out.println("Dog is howling");
	}

	@Override
	public void runWithFourLegs() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sitsWithLegsStretched() {
		System.out.println("overriding here sitswithlegstretched");
	}

	public static void someStaticOperation() {
		System.out.println("static operation");
	}

	@Override
	public String toString() {
		return "Dog [furColour=" + furColour + ", petName=" + petName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		return this.petName.equals(((Dog) obj).petName);
	}

	@Override
	public int hashCode() {
		return petName.length();
	}

	private String furColour;

	public String getFurColour() {
		return furColour;
	}

	public void setFurColour(String furColour) {
		this.furColour = furColour;
	}

}
