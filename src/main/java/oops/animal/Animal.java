package oops.animal;

public abstract class Animal implements LiveUntilDeath {
	
	private String scientificName;

	private AnimalType type;

	public Animal(String scientificName, AnimalType type) {
		super();
		this.scientificName = scientificName;
		this.type = type;
	}

	public String getScientificName() {
		return scientificName;
	}

	public enum AnimalType {
		SINGLE_CELLED, MULTI_CELLED;
	}

	public AnimalType getType() {
		return type;
	}

	public abstract void makeSound();
	
	protected void dummyProtected() {
		System.out.println("Protected method in Animal class");
	}

}
