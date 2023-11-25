package oops.animal;

public abstract class DomesticAnimal extends Animal {

	String petName;

	public DomesticAnimal(String biologicalName, String petName) {
		super(biologicalName, AnimalType.MULTI_CELLED);
		this.petName = petName;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public abstract void placeOfStay();

//	@Override
//	public void makeSound() {
//		System.out.println("In Domestic Animal");
//	}
//
}
