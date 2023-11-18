package oops.animal;

public class Animal {

	private String scientificName;

	private AnimalType type;

	public Animal(String biologicalName) {
		this.scientificName = biologicalName;
	}

	public Animal() {

	}

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

}
